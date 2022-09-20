package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Zona de definición de Variables de TIPO VISTA
    private Button btnResetMain;
    private Button btnSaludoMain;
    private EditText txtNombreMain;
    private TextView lblSaludoMain;

    //Zona de definición de Variables de TIPO LÓGICA
    private String nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializaVistas();

        btnSaludoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombreMain.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Debes rellenar el campo de nombre", Toast.LENGTH_SHORT).show();
                }else {lblSaludoMain.setText("Hola, "+txtNombreMain.getText()+", Buenos Dias");}
            }
        });

        btnResetMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNombreMain.setText("");
                lblSaludoMain.setText("");
            }
        });
    }


    private void inicializaVistas() {
        lblSaludoMain = findViewById(R.id.lblSaludoMain);
        btnResetMain = findViewById(R.id.btnResetMain);
        btnSaludoMain = findViewById(R.id.btnSaludoMain);
        txtNombreMain = findViewById(R.id.txtNombreMain);
    }

}