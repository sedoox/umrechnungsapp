package com.example.umrechnungsapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = findViewById(R.id.spinner1);
        Spinner spinner2 = findViewById(R.id.spinner2);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long multiplikator1 = 1;
                switch (spinner1.getSelectedItem().toString()) {
                    case "Quadratzentimeter":
                        multiplikator1 = 10;
                        break;
                    case "Quadratdezimeter":
                        multiplikator1 = 100;
                        break;
                    case "Quadratmeter":
                        multiplikator1 = 1000;
                        break;
                    case "Ar":
                        multiplikator1 = 10000;
                        break;
                    case "Hektar":
                        multiplikator1 = 100000;
                        break;
                    case "Quadratkilometer":
                        multiplikator1 = 1000000;
                        break;
                }

                long multiplikator2 = 1;
                switch (spinner2.getSelectedItem().toString()) {
                    case "Quadratzentimeter":
                        multiplikator2 = 10;
                        break;
                    case "Quadratdezimeter":
                        multiplikator2 = 100;
                        break;
                    case "Quadratmeter":
                        multiplikator2 = 1000;
                        break;
                    case "Ar":
                        multiplikator2 = 10000;
                        break;
                    case "Hektar":
                        multiplikator2 = 100000;
                        break;
                    case "Quadratkilometer":
                        multiplikator2 = 1000000;
                        break;
                }

                Double m = multiplikator1/(double)multiplikator2;
                m = m*m;

                EditText eins = findViewById(R.id.editTextNumberDecimal);
                TextView zwei = findViewById(R.id.result);

                zwei.setText(String.valueOf(Double.valueOf(eins.getText().toString())*m));

            }
        });
    }
}