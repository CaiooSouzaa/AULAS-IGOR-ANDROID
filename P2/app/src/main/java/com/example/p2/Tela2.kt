package com.example.p2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela2)

        setSupportActionBar(findViewById(R.id.toolbar))
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.btn1 -> {
                val tela3 = Intent(this, Tela7::class.java)
                startActivity(tela3)
            }
        }
        return true
    }

    fun Tela3(view: View){
        var tela3 = Intent(this, Tela3::class.java)
        startActivity(tela3)
    }

    fun Tela4(view: View){
        var tela4 = Intent(this, Tela4::class.java)
        startActivity(tela4)
    }

    fun Tela6(view: View){
        var tela4 = Intent(this, Tela6::class.java)
        startActivity(tela4)
    }

}