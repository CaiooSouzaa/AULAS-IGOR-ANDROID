package com.example.p2_igor

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent

class Tela14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela14)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun editar(view: View){
        var intent = Intent(this, Tela6::class.java)
        startActivity(intent)
    }


    fun CarregarImagem(view: View) {
        val url = "https://dwglogo.com/wp-content/uploads/2016/04/emirates_arabic_emblem.png"
        var imagemCarregada = findViewById<ImageView>(R.id.imagemCarregada)
        Glide.with(this).load(url).into(imagemCarregada)

    }
}