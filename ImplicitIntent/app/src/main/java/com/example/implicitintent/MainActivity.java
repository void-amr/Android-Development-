package com.example.implicitintent;

import static android.content.ContentValues.TAG;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    // public static final String EXTRA_NAME = "com.example.implicitintent.EXTRA_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                String message = editText.getText().toString();
                if(message.isEmpty()) {
                    Log.w(TAG, "onClick: message is empty");
                } else {
                    Log.d(TAG, "onClick: message is " + message);
                }
                sendIntent.putExtra("com.example.implicitintent.EXTRA_NAME", message);
                sendIntent.setType("text/plain");
                try {
                    startActivity(sendIntent);
                } catch (ActivityNotFoundException AE) {
                    Toast.makeText(MainActivity.this, "Activity not Found", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}