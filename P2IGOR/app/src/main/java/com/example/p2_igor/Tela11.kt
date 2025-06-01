package com.example.p2_igor

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela11)

        val arrayAdapter: ArrayAdapter<*>
        val listHistorico = arrayOf(
            "1) INSTITUIÇÃO: Universidade Internacional do Conhecimento\nDATA: 25/05/2024 - \nQTD: 489 - \nVALOR: R$12.225,00",
            "2) INSTITUIÇÃO: Faculdade Nova Mente\nDATA: 13/05/2024 - \nQTD: 370 - \nVALOR: R$9.250,00",
            "3) INSTITUIÇÃO: Instituto Global de Ensino\nDATA: 06/05/2024 - \nQTD: 132 - \nVALOR: R$3.300,00",
            "4) INSTITUIÇÃO: Instituto Nacional Alfa\nDATA: 26/04/2024 - \nQTD: 604 - \nVALOR: R$15.100,00",
            "5) INSTITUIÇÃO: Universidade Nacional de Educação Profissional\nDATA: 23/04/2024 - \nQTD: 276 - \nVALOR: R$6.900,00",
            "6) INSTITUIÇÃO: Universidade Horizonte Aberto\nDATA: 11/04/2024 - \nQTD: 117 - \nVALOR: R$2.925,00",
            "7) INSTITUIÇÃO: Centro de Ensino Superior da Integração\nDATA: 11/04/2024 - \nQTD: 390 - \nVALOR: R$9.750,00",
            "8) INSTITUIÇÃO: Faculdade Técnica do Interior\nDATA: 03/04/2024 - \nQTD: 199 - \nVALOR: R$4.975,00",
            "9) INSTITUIÇÃO: Centro Educacional Renova\nDATA: 14/03/2024 - \nQTD: 205 - \nVALOR: R$5.125,00",
            "10) INSTITUIÇÃO: Centro Universitário Futuro Brilhante\nDATA: 17/03/2024 - \nQTD: 447 - \nVALOR: R$11.175,00",
            "11) INSTITUIÇÃO: Universidade Real de Educação\nDATA: 10/03/2024 - \nQTD: 73 - \nVALOR: R$1.825,00",
            "12) INSTITUIÇÃO: Faculdade de Ciências Integradas Solaris\nDATA: 11/03/2024 - \nQTD: 264 - \nVALOR: R$6.600,00",
            "13) INSTITUIÇÃO: Faculdade Prisma\nDATA: 02/03/2024 - \nQTD: 383 - \nVALOR: R$9.575,00",
            "14) INSTITUIÇÃO: Faculdade Líder\nDATA: 28/02/2024 - \nQTD: 88 - \nVALOR: R$2.200,00",
            "15) INSTITUIÇÃO: Centro de Estudos Humanistas\nDATA: 15/02/2024 - \nQTD: 139 - \nVALOR: R$3.475,00",
            "16) INSTITUIÇÃO: Universidade Livre da Inovação\nDATA: 09/02/2024 - \nQTD: 476 - \nVALOR: R$11.900,00",
            "17) INSTITUIÇÃO: Faculdade Visionária do Saber\nDATA: 18/01/2024 - \nQTD: 211 - \nVALOR: R$5.275,00",
            "18) INSTITUIÇÃO: Escola Superior de Ciências Aplicadas\nDATA: 30/01/2024 - \nQTD: 540 - \nVALOR: R$13.500,00",
            "19) INSTITUIÇÃO: Instituto de Formação Acadêmica Integrada\nDATA: 06/02/2024 - \nQTD: 128 - \nVALOR: R$3.200,00",
            "20) INSTITUIÇÃO: Faculdade Brasileira de Inovação\nDATA: 07/01/2024 - \nQTD: 315 - \nVALOR: R$7.875,00"
        )
        var lista = findViewById<ListView>(R.id.listHistorico)
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, listHistorico
        )

        lista.adapter = arrayAdapter

    }
}