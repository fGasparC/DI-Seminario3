package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main7)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val texto = findViewById<TextInputEditText>(R.id.tiiil2)
        val botInsertar= findViewById<MaterialButton>(R.id.botoncitoinsertadatos)
        val botPasar= findViewById<MaterialButton>(R.id.botonpasadatos)
        val textoMostrado=findViewById<MaterialTextView>(R.id.textetemostrador)

        botInsertar.setOnClickListener(){
            val textoActual= textoMostrado.text.toString()
            textoMostrado.setText(textoActual +texto.text.toString()+ "\n")
        }
        botPasar.setOnClickListener(){
            var intent = Intent(this, MainActivity10::class.java)
            val textoPasar=textoMostrado.text.toString()
            intent.putExtra("Texto",textoPasar)
            startActivity(intent)
        }

    }
}