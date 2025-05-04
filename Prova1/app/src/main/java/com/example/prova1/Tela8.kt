package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela8 : AppCompatActivity() {

    lateinit var senha: EditText
    lateinit var senha2: EditText
    lateinit var senha3: EditText
    lateinit var senha4: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela8)

        val saldo = intent.getStringExtra("saldo") ?: "R$0,00"
        val valorDigitado = intent.getStringExtra("valorDigitado") ?: "R$0,00"

        senha = findViewById(R.id.digito)
        senha2 = findViewById(R.id.digito2)
        senha3 = findViewById(R.id.digito3)
        senha4 = findViewById(R.id.digito4)

        avancaAutomatico(senha, senha2)
        avancaAutomatico(senha2, senha3)
        avancaAutomatico(senha3, senha4)

        senha4.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s?.length == 0){
                    senha3.requestFocus()
                }
            }
        })

        val botaoTela9: Button = findViewById(R.id.botaoTela9)
        botaoTela9.setOnClickListener {
            var pass = senha.text.toString()
            var pass2 = senha2.text.toString()
            var pass3 = senha3.text.toString()
            var pass4 = senha4.text.toString()

            if (pass.isEmpty() && pass2.isEmpty() && pass3.isEmpty() && pass4.isEmpty()) {
                Toast.makeText(this, "Por favor digite sua senha", Toast.LENGTH_SHORT).show()
            } else if (verifica(pass, pass2, pass3, pass4)) {
                var intent = Intent(this, Tela9::class.java)
                intent.putExtra("saldo", saldo)
                intent.putExtra("valorDigitado", valorDigitado)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Senha incorreta", Toast.LENGTH_SHORT).show()
            }

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun verifica(pass: String, pass2: String, pass3: String, pass4: String): Boolean {
        return pass == "1" && pass2 == "2" && pass3 == "3" && pass4 == "4"
    }

    private fun avancaAutomatico(current: EditText, next: EditText){
        current.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s?.length == 1){
                    next.requestFocus()
                }
            }
        })
    }
}