package com.example.sistemadeseguridad

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class HistorialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historial)

        // Vinculamos el ListView
        val listaHistorial: ListView = findViewById(R.id.listaHistorial)

        // Datos de ejemplo para llenar el historial
        val eventos = arrayOf(
            "Puerta abierta a las 08:30",
            "Ventana cerrada a las 09:15",
            "Puerta cerrada a las 10:00",
            "Ventana abierta a las 11:45",
            "Ventana Cerrada a las 12:00",
            "Puerta Abierta a las 11:00",
            "Puerta Cerrada a las 11:10",
        )

        // Adaptador para mostrar los eventos en el ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, eventos)
        listaHistorial.adapter = adapter
    }
}
