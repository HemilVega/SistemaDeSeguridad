package com.example.sistemadeseguridad

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AyudaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda)

        // Vinculamos el botón de contacto
        val botonContacto: Button = findViewById(R.id.botonContacto)

        // Acción para enviar un correo o abrir una página de contacto
        botonContacto.setOnClickListener {
            // Aquí puedes abrir una página web o enviar un email
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("+569 10101010 😊"))
            startActivity(intent)
        }
    }
}
