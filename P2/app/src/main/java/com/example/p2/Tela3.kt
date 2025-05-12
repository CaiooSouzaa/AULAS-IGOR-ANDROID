package com.example.p2

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nomeAluno = findViewById<EditText>(R.id.nomeAluno)
        val cpfAluno = findViewById<EditText>(R.id.cpfAluno)
        val instituicaoAluno = findViewById<EditText>(R.id.instituicaoAluno)
        val alturaAluno = findViewById<EditText>(R.id.alturaAluno)
        val pesoAluno = findViewById<EditText>(R.id.pesoAluno)
        val telefoneALuno = findViewById<EditText>(R.id.telefoneAluno)
        val idadeAluno = findViewById<EditText>(R.id.idadeAluno)

        val actionId = EditorInfo.IME_ACTION_NEXT

        nomeAluno.setOnEditorActionListener { _, actionId, _ ->
            when (actionId) {
                EditorInfo.IME_ACTION_NEXT -> {
                    cpfAluno.post { cpfAluno.requestFocus() }
                    true
                }
                EditorInfo.IME_ACTION_NEXT ->{
                    instituicaoAluno.post{instituicaoAluno.requestFocus()}
                    true
                }else -> {
                    false
                }
            }
        }
    }
}