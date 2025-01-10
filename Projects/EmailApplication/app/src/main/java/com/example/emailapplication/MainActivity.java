package com.example.emailapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText receipent;
    EditText subject;
    EditText body;
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
        receipent = findViewById(R.id.receipent);
        subject  = findViewById(R.id.Subject);
        body = findViewById(R.id.Body);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String receiver = receipent.getText().toString();
                String subject_data = subject.getText().toString();
                String body_data = body.getText().toString();

                Intent sendIntent = new Intent(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{receiver});
                sendIntent.putExtra(Intent.EXTRA_SUBJECT, subject_data);
                sendIntent.putExtra(Intent.EXTRA_TEXT, body_data);
                if(sendIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendIntent);
                }

            }
        });
    }
}