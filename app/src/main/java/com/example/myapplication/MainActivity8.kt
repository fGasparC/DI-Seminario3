package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main8)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val banderaEspana=R.drawable.espanita
        val banderaFrancia=R.drawable.francia
        val espana=Pais("España",banderaEspana,48000000)
        val francia=Pais("Francia",banderaFrancia,68000000)
        val botonEs = findViewById<MaterialButton>(R.id.botonEspaña)
        val botonFr = findViewById<MaterialButton>(R.id.botonFrancia)
        botonEs.setOnClickListener(){
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
            intent.putExtra("pais", espana)
            startActivity(intent)
        }
        botonFr.setOnClickListener(){
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
            intent.putExtra("pais", francia)
            startActivity(intent)
        }

    }
}