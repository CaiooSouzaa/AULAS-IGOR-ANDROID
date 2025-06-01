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
        var url = "https://media.istockphoto.com/id/183758172/pt/foto/retrato-feminino.jpg?s=612x612&w=0&k=20&c=f9bRMjLCZqL9zPoUTftMoKw8ST66mfTpmOIVmOwM_UY="
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