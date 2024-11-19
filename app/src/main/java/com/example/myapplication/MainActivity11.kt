package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textview.MaterialTextView

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main11)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nombrePais=findViewById<MaterialTextView>(R.id.nombrepais)
        val poblacionPais=findViewById<MaterialTextView>(R.id.poblacionpais)
        val foto=findViewById<ImageView>(R.id.fotopais)
        val paisRecibido = intent.getParcelableExtra<Pais>("pais")
        nombrePais.setText(paisRecibido?.nombre.toString())
        poblacionPais.setText(paisRecibido?.poblacion.toString())
        if (paisRecibido != null) {
            foto.setImageResource(paisRecibido.bandera)
        }



    }
}