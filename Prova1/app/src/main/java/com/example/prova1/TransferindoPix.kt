package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TransferindoPix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transferindo_pix)

        val saldo = intent.getStringExtra("saldo") ?: "R$0,00"
        val valorDigitado = intent.getStringExtra("valorDigitado") ?: "R$0,00"

        val textSaldo: TextView = findViewById(R.id.valorSerTransferido)
        textSaldo.text = "R$$valorDigitado?"

        val botaoTela6 : Button = findViewById(R.id.botaoTela6)
        botaoTela6.setOnClickListener{
            var intent = Intent(this, Tela6::class.java)
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