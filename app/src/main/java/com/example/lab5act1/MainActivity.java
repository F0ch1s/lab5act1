package com.example.lab5act1;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText etNombre;
    private MaterialButton btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = etNombre.getText().toString().trim();
                if (TextUtils.isEmpty(nombre)) {
                    etNombre.setError("Por favor, ingresa tu nombre");
                } else {
                    Toast.makeText(MainActivity.this, "Bienvenido, " + nombre + "!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
