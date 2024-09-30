package com.example.sistemadeseguridad

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ConfigActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config)

        // Vinculamos el botón de guardar configuración
        val botonGuardar: Button = findViewById(R.id.botonGuardarConfig)

        // Al hacer clic en el botón, devolvemos un resultado a MainActivity
        botonGuardar.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("resultado_config", "Configuración Guardada")
            setResult(Activity.RESULT_OK, resultIntent)
            finish() // Finaliza ConfigActivity y regresa a MainActivity
        }

        // Botón para ir a la pantalla de historial
        val botonHistorial: Button = findViewById(R.id.botonHistorial)
        botonHistorial.setOnClickListener {
            val intent = Intent(this, HistorialActivity::class.java)
            startActivity(intent)  // Inicia la actividad HistorialActivity
        }

        // Botón para ir a la pantalla de ayuda
        val botonAyuda: Button = findViewById(R.id.botonAyuda)
        botonAyuda.setOnClickListener {
            val intent = Intent(this, AyudaActivity::class.java)
            startActivity(intent)  // Inicia la actividad AyudaActivity
        }

        // Botón para volver a la pantalla principal (MainActivity)
        val botonMain: Button = findViewById(R.id.botonMain)
        botonMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)  // Inicia la actividad MainActivity
        }
    }
}
