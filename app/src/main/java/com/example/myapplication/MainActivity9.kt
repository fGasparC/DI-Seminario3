package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textview.MaterialTextView

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main9)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textoLayout=findViewById<MaterialTextView>(R.id.mtvrecibidor1)
        val numLayout=findViewById<MaterialTextView>(R.id.mtvrecibidor2)
        val intent= intent
        val numRecibido= intent.getIntExtra("Numero",0)
        val textoRecibido= intent.getStringExtra("Texto")
        textoLayout.setText("El texto recibido es: " + textoRecibido)
        numLayout.setText("El numero recibido es: " + numRecibido.toString())

    }
}