package com.example.meuprimeiroapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaDeLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var login: EditText
        lateinit var senha: EditText

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_de_login)

        login = findViewById(R.id.email)
        senha = findViewById(R.id.senha)

        val botaoLogar: Button = findViewById(R.id.botaoLogar)
        botaoLogar.setOnClickListener {
            var user = login.text.toString()
            var pass = senha.text.toString()

            if (verifica(user, pass)) {
                Toast.makeText(this, "Bem vindo admin", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Credencial não autorizada", Toast.LENGTH_LONG).show()
            }
        }
        val BotaoLimpar: Button = findViewById(R.id.botaoLimpar)
        BotaoLimpar.setOnClickListener {
            login.text.clear()
            senha.text.clear()
            Toast.makeText(this, "LIMPAR", Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

private fun verifica(user: String, pass: String): Boolean {
    return user == "admin" && pass == "1234"
}