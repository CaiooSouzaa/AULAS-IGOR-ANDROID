package com.example.projetomusica

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela4)

        val arrayAdapter: ArrayAdapter<*>
        val musicas = arrayOf(
            "Sweet Child O' Mine",
            "November Rain",
            "Knockin' On Heaven's Door",
            "Patience",
            "Don't Cry",
            "Welcome To The Jungle",
            "This I Love",
            "Estranged",
            "Paradise City",
            "Civil War",
            "Garden Of Eden",
            "Since I Don't Have You"
        )

        val lista = findViewById<ListView>(R.id.lista)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, musicas)
        lista.adapter = arrayAdapter
    }
}