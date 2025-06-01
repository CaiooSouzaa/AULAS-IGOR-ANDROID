package com.example.p2_igor

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.util.Log
import com.bumptech.glide.request.target.Target
import com.bumptech.glide.Glide


class Tela14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela14)

    }



    fun CarregarImagem(view: View) {
        var url = "https://upload.wikimedia.org/wikipedia/commons/4/47/PNG_transparency_demonstration_1.png"
        val imagemCarregada = findViewById<ImageView>(R.id.carregarImagem)
        Log.d("GlideDebug", "Carregando imagem: $url")

        Glide.with(view.context)
            .load(url)
            .error(R.drawable.ic_launcher_background)
            .into(imagemCarregada)
    }

    fun editar(view: View) {
        var intent = Intent(this, Tela6::class.java)
        startActivity(intent)
    }
}