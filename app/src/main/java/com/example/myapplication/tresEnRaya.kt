package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class tresEnRaya : AppCompatActivity() {
    var lista= mutableListOf(0,0,0,0,0,0,0,0,0)
    var victoriaMaquina=false
    var victoriaHumano=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tres_en_raya)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val playagain=findViewById<Button>(R.id.playagain)
        val victoriaderrota=findViewById<TextView>(R.id.victoriaderrota)
        val recuadro0 = findViewById<ImageButton>(R.id.ib1)
        val recuadro1 = findViewById<ImageButton>(R.id.ib2)
        val recuadro2 = findViewById<ImageButton>(R.id.ib3)
        val recuadro3 = findViewById<ImageButton>(R.id.ib4)
        val recuadro4 = findViewById<ImageButton>(R.id.ib5)
        val recuadro5 = findViewById<ImageButton>(R.id.ib6)
        val recuadro6 = findViewById<ImageButton>(R.id.ib7)
        val recuadro7 = findViewById<ImageButton>(R.id.ib8)
        val recuadro8 = findViewById<ImageButton>(R.id.ib9)
        val listaRecuadros=listOf(recuadro0,recuadro1,recuadro2,recuadro3,recuadro4,recuadro5,recuadro6,recuadro7,recuadro8)
        var mapaDeRecuadros= mutableMapOf(0 to recuadro0,1 to recuadro1, 2 to recuadro2, 3 to recuadro3, 4 to recuadro4, 5 to recuadro5,6 to recuadro6, 7 to recuadro7, 8 to recuadro8)
        var click=0
        playagain.setOnClickListener(){
            victoriaderrota.setText("")
            for (i in listaRecuadros){
                i.setImageResource(0)
                i.isClickable=true
            }
            for (i in 0 until lista.size){
                lista[i]=0
            }
            click=0
            mapaDeRecuadros=mutableMapOf(0 to recuadro0,1 to recuadro1, 2 to recuadro2, 3 to recuadro3, 4 to recuadro4, 5 to recuadro5,6 to recuadro6, 7 to recuadro7, 8 to recuadro8)
        }
        mapaDeRecuadros.forEach { (pos, recuadro) ->
          recuadro.setOnClickListener(){
              recuadro.setImageResource(R.drawable.equis)
              recuadro.isClickable=false
              lista[pos]++
              click++
              victoriaHumano=victoria(1)
              if(victoriaHumano){
                  victoriaderrota.setText("GANASTE")
                  findeljuego(listaRecuadros)
                  victoriaderrota.setTextColor(Color.GREEN)
              }
              else if(click==5){
                  victoriaderrota.setText("Se ha producido un empate.")
                  victoriaderrota.setTextColor(Color.YELLOW)
              }
              else{
                  mapaDeRecuadros.remove(pos)
                  mapaDeRecuadros=clickMaquina(mapaDeRecuadros,victoriaderrota,listaRecuadros)
              }
          }
        }

    }
    fun clickMaquina(a: MutableMap<Int,ImageButton>, b:TextView, c: List<ImageButton>):MutableMap<Int,ImageButton>{
        val listaDeEntradas = a.entries.toList()
        val posMaquina = Random.nextInt(a.size)
        val posMapaMaquina = listaDeEntradas[posMaquina]
        val clave = posMapaMaquina.key
        val recuadro = posMapaMaquina.value
        recuadro.setImageResource(R.drawable.circulo)
        recuadro.isClickable = false
        lista[clave]--
        victoriaMaquina=victoria(-1)
        if(victoriaMaquina){
            b.setText("GANO LA MAQUINA")
            b.setTextColor(Color.RED)
            findeljuego(c)
            return a
        }
        else{
            a.remove(clave)
            return a
        }
    }
    fun victoria(b: Int):Boolean{
        if(lista[0]==lista[1]&& lista[1]==lista[2] && lista[2]==b) return true

        else if(lista[3]==lista[4]&& lista[4]==lista[5] && lista[5]==b) return true
        else if(lista[6]==lista[7]&& lista[7]==lista[8] && lista[8]==b) return true

        else if(lista[0]==lista[3]&& lista[3]==lista[6] && lista[6]==b) return true
        else if(lista[1]==lista[4]&& lista[4]==lista[7] && lista[7]==b) return true
        else if(lista[2]==lista[5]&& lista[5]==lista[8] && lista[8]==b) return true

        else if(lista[0]==lista[4]&& lista[4]==lista[8] && lista[8]==b) return true
        else if(lista[2]==lista[4]&& lista[4]==lista[6] && lista[6]==b) return true

        else return false
    }
    fun findeljuego(a:List<ImageButton>){
        for(i in a){
            i.isClickable=false
        }
    }

}