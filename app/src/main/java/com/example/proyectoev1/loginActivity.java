package com.example.proyectoev1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import sqlite.conSQLite;
import sqlite.llamadas;

public class loginActivity extends AppCompatActivity {
    EditText etUsuario, etContra;
    Button lButton, rButton;
    conSQLite conSQLite;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        etUsuario = (EditText) findViewById(R.id.EdTxUsuario);
        etContra = (EditText) findViewById(R.id.EdTxCont);
        lButton = (Button) findViewById(R.id.logButton);
        rButton = (Button) findViewById(R.id.regButton);

        lButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        rButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    conSQLite.insertar(etUsuario.getText(), etContra.getText());
                } catch (Exception e){
                    //Toast.makeText(this, "Error al Registrar", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
