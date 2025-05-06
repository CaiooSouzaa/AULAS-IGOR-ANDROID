package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class Carregamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_carregamento)
    }
    fun CarregarImagem(view: View){
        val url = "https://dwglogo.com/wp-content/uploads/2016/04/emirates_arabic_emblem.png"
        var imagemCarregada = findViewById<ImageView>(R.id.imagemCarregada)
        Glide.with(this).load(url).into(imagemCarregada)

    }
}