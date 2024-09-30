package com.example.sistemadeseguridad

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var estadoVentana: TextView
    private lateinit var estadoPuerta: TextView
    private lateinit var botonActivar: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vinculamos las vistas
        estadoVentana = findViewById(R.id.EstadoVentana)
        estadoPuerta = findViewById(R.id.EstadoPuerta)
        botonActivar = findViewById(R.id.botonActivar)

        // Acción de activar al presionar el botón
        botonActivar.setOnClickListener {
            estadoVentana.text = "Estado de la Ventana: Abierta"
            estadoPuerta.text = "Estado de la Puerta: Abierta"
        }

        // Configurar botón para abrir ConfigActivity
        val configButton: Button = findViewById(R.id.botonConfig)

        // Al hacer clic en el botón, se iniciará ConfigActivity esperando un resultado
        configButton.setOnClickListener {
            val intent = Intent(this, ConfigActivity::class.java)
            startActivityForResult(intent, 1) // "1" es el requestCode para identificar la actividad
        }
    }

    // Método que recibe el resultado de ConfigActivity
    @SuppressLint("SetTextI18n")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Comprobamos si la respuesta proviene de ConfigActivity
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                // Obtener los datos enviados desde ConfigActivity
                val nuevaConfiguracion = data?.getStringExtra("resultado_config")
                estadoVentana.text = "Nueva configuración: $nuevaConfiguracion"
            }
        }
    }
}
