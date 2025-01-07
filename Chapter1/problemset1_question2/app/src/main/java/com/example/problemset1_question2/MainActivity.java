package com.example.problemset1_question2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgButton;
    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private TextView textView;

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

        imgButton = findViewById(R.id.imageButton);
        editTextNumber1 =  findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textView = findViewById(R.id.textView);

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = editTextNumber1.getText().toString();
                String number2 = editTextNumber2.getText().toString();
                if (number1.isEmpty() || number2.isEmpty()) {
                    textView.setText("Please enter numbers");
                }
                else {
                    int num1 = Integer.parseInt(number1);
                    int num2 = Integer.parseInt(number2);
                    int sum = num1 + num2;
                    editTextNumber1.setText("");
                    editTextNumber2.setText("");
                    textView.setText("Sum of two numbers is " + sum);
                }
            }
        });

    }
}