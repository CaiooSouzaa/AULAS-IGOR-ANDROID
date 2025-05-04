package com.example.meuprimeiroapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var valor1: EditText //o lateinit começa com o null
        lateinit var valor2: EditText

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculadora)

        valor1 = findViewById(R.id.valor1)
        valor2 = findViewById(R.id.valor2)

        //fazer a operação
        val BotaoSomar: Button = findViewById(R.id.BotaoSomar)
        BotaoSomar.setOnClickListener {
            var numero1 = valor1.text.toString().toInt()
            var numero2 = valor2.text.toString().toInt()
            val resultado = numero1 + numero2
            Toast.makeText(
                this,
                "Resultado: $resultado", Toast.LENGTH_SHORT
            ).show()
        }

        val BotaoSubtrair: Button = findViewById(R.id.BotaoSubtrair)
        BotaoSubtrair.setOnClickListener {
            var numero1 = valor1.text.toString().toInt()
            var numero2 = valor2.text.toString().toInt()
            val resultado = numero1 - numero2
            Toast.makeText(
                this,
                "Resultado: $resultado", Toast.LENGTH_SHORT
            ).show()
        }

        val BotaoMultiplicar: Button = findViewById(R.id.BotaoMultiplicar)
        BotaoMultiplicar.setOnClickListener {
            var numero1 = valor1.text.toString().toInt()
            var numero2 = valor2.text.toString().toInt()
            val resultado = numero1 * numero2
            Toast.makeText(
                this,
                "Resultado: $resultado", Toast.LENGTH_SHORT
            ).show()
        }

        val BotaoDividir: Button = findViewById(R.id.BotaoDivisao)
        BotaoDividir.setOnClickListener {
            var numero1 = valor1.text.toString().toFloat()
            var numero2 = valor2.text.toString().toFloat()
            val resultado = numero1 / numero2
            Toast.makeText(
                this,
                "Resultado: $resultado", Toast.LENGTH_SHORT
            ).show()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Toast.makeText(this, "O valor calculado e: ", Toast.LENGTH_LONG).show()

    }
}