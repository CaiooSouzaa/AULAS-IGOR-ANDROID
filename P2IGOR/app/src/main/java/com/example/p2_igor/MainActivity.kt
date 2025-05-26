package com.example.p2_igor

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var login: EditText
    lateinit var senha: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.login)
        senha = findViewById(R.id.senha)

        val logar: Button = findViewById(R.id.logarConta)
        logar.setOnClickListener {
            var user = login.text.toString()
            var pass = senha.text.toString()

            if (logar(user, pass)) {
                val entrar = Intent(this, Tela2::class.java)
                startActivity(entrar)
                Toast.makeText(this, "Usuario logado com sucesso", Toast.LENGTH_SHORT).show()
            } else if (logar(user, pass) != logar(user, pass)){
                Toast.makeText(this, "Usuario não encontrado", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Por favor colocra suas credenciais", Toast.LENGTH_SHORT).show()
            }
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun logar(user: String, pass: String) : Boolean {
        return user == "admin01" && pass == "1234"
    }
}