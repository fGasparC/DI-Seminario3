package com.example.myapplication

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tresEnRaya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tres_en_raya)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val recuadro1=findViewById<ImageButton>(R.id.ib1)
        val recuadro2=findViewById<ImageButton>(R.id.ib2)
        val recuadro3=findViewById<ImageButton>(R.id.ib3)
        val recuadro4=findViewById<ImageButton>(R.id.ib4)
        val recuadro5=findViewById<ImageButton>(R.id.ib5)
        val recuadro6=findViewById<ImageButton>(R.id.ib6)
        val recuadro7=findViewById<ImageButton>(R.id.ib7)
        val recuadro8=findViewById<ImageButton>(R.id.ib8)
        val recuadro9=findViewById<ImageButton>(R.id.ib9)
        recuadro1.isFocusable=false
    }
}