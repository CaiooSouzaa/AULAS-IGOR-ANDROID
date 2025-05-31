package com.example.p2_igor

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ListView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela5)

        val arrayAdapter: ArrayAdapter<*>
        val listaAlunos = arrayOf(
            "Júlia Monteverde", "Rafael Castanho", "Mariana Silveira", "Caio Ventura", "Lívia Dornelles", "Lucas Barreto", "Bianca Figueiró", "Gustavo Alencar", "Tainá Melo", "Enzo Sampaio", "Larissa Vilar", "Pedro Antunes", "Camila Vasques", "Diego Mourão", "Isabela Fontes", "Vinícius Prado", "Amanda Rios", "Bruno Tavares", "Natália Serpa", "Felipe Amarantes"
        )
        var lista = findViewById<ListView>(R.id.listaAlunos)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, listaAlunos)

        lista.adapter = arrayAdapter

        lista.setOnItemClickListener{ parent, view, position, id ->
            val nomeSelecionado = listaAlunos[position]

            val intent = Intent(this, Tela14::class.java)
            intent.putExtra("nome", nomeSelecionado)
            startActivity(intent)
        }
    }
}