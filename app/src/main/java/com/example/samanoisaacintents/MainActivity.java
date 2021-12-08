package com.example.samanoisaacintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, phone, correo, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registrarAlumno(View v){
        name = findViewById(R.id.txtNombre);
        phone = findViewById(R.id.txtTelefono);
        correo = findViewById(R.id.txtEmail);
        pass = findViewById(R.id.txtPass);
        Intent i = new Intent();

        Alumno al = new Alumno(name.getText().toString(), phone.getText().toString(),
                correo.getText().toString(), pass.getText().toString());


        i.putExtra("alumno",al);
        setResult(RESULT_OK,i);
        finish();
        ;

    }

    public void cancelar(View view){
        Toast.makeText(MainActivity.this,"Operación cancelada", Toast.LENGTH_LONG).show();
        finish();
    }


}