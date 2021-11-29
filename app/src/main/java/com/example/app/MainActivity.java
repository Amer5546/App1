package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText num1=findViewById(R.id.num1);
        EditText num2=findViewById(R.id.num2);

       Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button Mul = findViewById(R.id.Mul);
        Button div= findViewById(R.id.div);
        TextView rez=findViewById(R.id.rez);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1,number2;
                number1 = Double.parseDouble(num1.getText().toString().trim());
                number2 =Double.parseDouble(num2.getText().toString().trim());
                String _rez=String.valueOf(number1+number2);
                rez.setText(_rez);

            }
        });
sub.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        double number1,number2;
        number1 = Double.parseDouble(num1.getText().toString().trim());
        number2 =Double.parseDouble(num2.getText().toString().trim());
        String _rez=String.valueOf(number1-number2);
        rez.setText(_rez);

    }
});
Mul.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        double number1,number2;
        number1 = Double.parseDouble(num1.getText().toString().trim());
        number2 =Double.parseDouble(num2.getText().toString().trim());
        String _rez=String.valueOf(number1*number2);
        rez.setText(_rez);

    }
});
div.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        double number1, number2;
        number1 = Double.parseDouble(num1.getText().toString().trim());
        number2 = Double.parseDouble(num2.getText().toString().trim());
        if (number1 != 0 && number2 != 0) {
            String reez = String.valueOf(number1 / number2);
            rez.setText(reez);
        }
        else {
            Toast.makeText(MainActivity.this,"use count div", Toast.LENGTH_SHORT).show();
        }
    }
});
    }
}