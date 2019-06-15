package com.example.telaloginepassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Criação dos objetos
    EditText editlogin;
    EditText editpassword;
    Button btnacessar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculando os objetos ao seus ID's
        editlogin = (EditText) findViewById(R.id.editlogin);
        editpassword = (EditText) findViewById(R.id.editpassword);
        btnacessar = (Button) findViewById(R.id.btnacessar);

         // progrmando o cotao acessar
        btnacessar.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View view) {

            if (editlogin.getText().length() == 0 || editpassword.getText().length() == 0) {
                Toast.makeText(getApplication(), "Os campos de Login e Password são obrigatorios",
                        Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplication(), "Seja Bem Vindo " + editlogin.getText().toString() + " ! ",
                        Toast.LENGTH_LONG).show();
            }

            // Limpando os Dados digitados programaticamente
            editlogin.setText("");
            editpassword.setText("");

        }


    });

    }

}

