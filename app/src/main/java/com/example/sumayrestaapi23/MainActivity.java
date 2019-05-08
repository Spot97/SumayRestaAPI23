package com.example.sumayrestaapi23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etN1,etN2;
    Button btnSuma, btnResta;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etN1= findViewById(R.id.etN1);
        etN2= findViewById(R.id.etN2);
        txtResultado=findViewById(R.id.txtResultado);

        btnSuma=findViewById(R.id.btnSuma);
        btnResta=findViewById(R.id.btnResta);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1= Integer.parseInt(etN1.getText().toString());
                int n2= Integer.parseInt(etN2.getText().toString());
                String Cadena1="";
                Cadena1="La suma es: "+(n1+n2);

                txtResultado.setText(Cadena1);

                Toast.makeText(MainActivity.this,
                        Cadena1,
                        Toast.LENGTH_LONG).show();
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1= Integer.parseInt(etN1.getText().toString());
                int n2= Integer.parseInt(etN2.getText().toString());
                String Cadena2="";
                Cadena2="La Resta es: "+(n1-n2);


                txtResultado.setText(Cadena2);
                Toast.makeText(MainActivity.this,
                        Cadena2,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
