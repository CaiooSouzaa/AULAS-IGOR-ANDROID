package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import java.util.TimeZone

class Tela9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela9)

        val saldo = intent.getStringExtra("saldo") ?: "R$0,00"
        val valorDigitado = intent.getStringExtra("valorDigitado") ?: "R$0,00"

        val textSaldo: TextView = findViewById(R.id.valorFinal)
        textSaldo.text = "R$$valorDigitado?"

        // Configura o fuso horário para Brasília (UTC-3)
        val timeZone = TimeZone.getTimeZone("America/Sao_Paulo")
        val calendar = Calendar.getInstance(timeZone)

        // Formata a hora no formato desejado
        val horaBrasilia = SimpleDateFormat("HH:mm", Locale.getDefault())
        horaBrasilia.timeZone = timeZone
        val horaAtual = horaBrasilia.format(calendar.time)

        // Exibe a hora no TextView
        val textHora: TextView = findViewById(R.id.textHora)
        textHora.text = "Agora mesmo • $horaAtual"


        val inicial : Button = findViewById(R.id.inicial)
        inicial.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)
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