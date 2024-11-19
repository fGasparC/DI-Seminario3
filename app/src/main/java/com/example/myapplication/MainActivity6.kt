package com.example.myapplication

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView
import kotlin.random.Random

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val texto=findViewById<EditText>(R.id.tiet)
        val boton=findViewById<MaterialButton>(R.id.botoncetepasadatos)
        val numero=findViewById<MaterialTextView>(R.id.numerilloaleatorio)
        var textillo=numero.text.toString()
        val numaleatorio=Random.nextInt(10)
        textillo+=" " +numaleatorio.toString()
        numero.setText(textillo)
        boton.setOnClickListener(){

        }
    }
}