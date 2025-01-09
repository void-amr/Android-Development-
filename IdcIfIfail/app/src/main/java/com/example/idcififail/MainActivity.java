package com.example.idcififail;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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

    Button button;
    EditText editText;

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
        editText = findViewById(R.id.editTextText);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View v) {
                String url = editText.getText().toString();
                if(url.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Text data in empty", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Text data is their", Toast.LENGTH_SHORT).show();
                }
                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                    url = "http://" + url;
                }

                Uri webpage = Uri.parse(url);
                String title = getResources().getString(R.string.chooser_title);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                Intent chooser = Intent.createChooser(intent, title);
                if(intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(chooser);
                } else {
                    Toast.makeText(MainActivity.this, "No browser found", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}