package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ValorPix : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_valor_pix)

        var valorTransferir: EditText = findViewById(R.id.valorTransferir)
        var botaoValorPix: Button = findViewById(R.id.botaoValorPix)

        val saldo = intent.getStringExtra("saldo") ?: "R$0,00"
        val textSaldo: TextView = findViewById(R.id.saldoConta )
        textSaldo.text = "Saldo disponivel é $saldo"

        botaoValorPix.setOnClickListener {
            val valor = valorTransferir.text.toString().trim()
            if (valor.isEmpty()) {
                Toast.makeText(this, "Digite um valor", Toast.LENGTH_LONG).show()
            } else {
                valorTransferir = findViewById(R.id.valorTransferir)
                var intent = Intent(this, ContatoPix::class.java)
                intent.putExtra("valorDigitado", valor)
                intent.putExtra("", valorTransferir.text.toString())
                startActivity(intent)
            }

        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}