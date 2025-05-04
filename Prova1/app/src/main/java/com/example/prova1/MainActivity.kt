package com.example.prova1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val botaoPix: Button = findViewById(R.id.botaoPix)

        botaoPix.setOnClickListener {
            var intent = Intent(this, AreaPix::class.java)
            intent.putExtra("saldo", "R$100,00")
            startActivity(intent)
        }

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Acesse botaoOlho corretamente
        val botaoOlho = toolbar.findViewById<ImageButton>(R.id.botaoOlho) // Se estiver na Toolbar

        val textView = findViewById<TextView>(R.id.valorConta)

        if (botaoOlho == null || textView == null) {
            Log.e("Erro", "Elemento não encontrado")
            return
        }

        var isVisible = true

        botaoOlho.setOnClickListener {
            isVisible = !isVisible
            textView.text = if (isVisible) "R$100,00" else "****"

            try {
                botaoOlho.setBackgroundResource(
                    if (isVisible) R.drawable.olho else R.drawable.olho_fechado
                )
            } catch (e: Exception) {
                Log.e("Erro", "Erro ao carregar drawable: ${e.message}")
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}



