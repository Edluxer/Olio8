package com.example.olio8;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText EuroInput;
    private TextView ResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EuroInput = findViewById(R.id.EuroInput);
        ResultText = findViewById(R.id.ResultText);
    }

    public void USDButton(View view) {
        try {
            double euro = Double.parseDouble(EuroInput.getText().toString());
            double res = euro * 1.05;
            ResultText.setText(String.format("$%.2f", res));
        }
        catch (NumberFormatException e) {
            ResultText.setText("Virhe luvun annossa.");
        }
    }
    public void GDPButton(View view) {
        try {
            double euro = Double.parseDouble(EuroInput.getText().toString());
            double res = euro * 0.83;
            ResultText.setText(String.format("£%.2f", res));
        }
        catch (NumberFormatException e) {
            ResultText.setText("Virhe luvun annossa.");
        }
    }
}