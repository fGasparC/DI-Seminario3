package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val boton1=findViewById<Button>(R.id.b1)
        val boton2=findViewById<Button>(R.id.b2)
        val boton3=findViewById<Button>(R.id.b3)
        val boton4=findViewById<Button>(R.id.b4)
        val boton5=findViewById<Button>(R.id.b5)
        val boton6=findViewById<Button>(R.id.b6)
        val boton7=findViewById<Button>(R.id.b7)
        val boton8=findViewById<Button>(R.id.b8)
        val boton9=findViewById<Button>(R.id.b9)
        val boton10=findViewById<Button>(R.id.b10)

        boton1.setOnClickListener(){
            var intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
    }




    /*
    boton2.setOnClickListener(){
        var intent = Intent(this@MainActivity10, MainActivity2::class.java)
        startActivity(intent)
    }
    boton3.setOnClickListener(){
        var intent = Intent(this@MainActivity10, MainActivity3::class.java)
        startActivity(intent)
    }
    boton4.setOnClickListener(){
        var intent = Intent(this@MainActivity10, MainActivity4::class.java)
        startActivity(intent)
    }
    boton5.setOnClickListener(){
        var intent = Intent(this@MainActivity10, MainActivity5::class.java)
        startActivity(intent)
    }
    boton6.setOnClickListener(){
        var intent = Intent(this@MainActivity10, MainActivity6::class.java)
        startActivity(intent)
    }
    boton7.setOnClickListener(){
        var intent = Intent(this@MainActivity10, MainActivity7::class.java)
        startActivity(intent)
    }
    boton8.setOnClickListener(){
        var intent = Intent(this@MainActivity10, MainActivity8::class.java)
        startActivity(intent)
    }
    boton9.setOnClickListener(){
        var intent = Intent(this@MainActivity10, MainActivity9::class.java)
        startActivity(intent)
    }*/
}