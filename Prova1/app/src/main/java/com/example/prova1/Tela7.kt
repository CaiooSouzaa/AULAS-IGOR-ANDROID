package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela7)

        val saldo = intent.getStringExtra("saldo") ?: "R$0,00"
        val valorDigitado = intent.getStringExtra("valorDigitado") ?: "R$0,00"

        val textSaldo: TextView = findViewById(R.id.valorSerTransferido)
        textSaldo.text = "R$$valorDigitado?"

        val botaoTela8 : Button = findViewById(R.id.botaoTela8)
        botaoTela8.setOnClickListener{
            var intent = Intent(this, Tela8::class.java)
            intent.putExtra("saldo", saldo)
            intent.putExtra("valorDigitado", valorDigitado)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}