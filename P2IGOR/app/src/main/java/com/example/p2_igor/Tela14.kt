package com.example.p2_igor

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import com.bumptech.glide.request.target.Target
import com.bumptech.glide.Glide


class Tela14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela14)

    }

    fun CarregarImagem(view: View) {
        var url = "https://dwglogo.com/wp-content/uploads/2016/04/emirates_arabic_emblem.png"
        val imagemCarregada = findViewById<ImageView>(R.id.carregarImagem)
        Glide.with(this)
            .load(url)
            .error(R.drawable.ic_launcher_background)
            .into(imagemCarregada)
    }

    fun editar(view: View) {
        var intent = Intent(this, Tela6::class.java)
        startActivity(intent)
    }
}