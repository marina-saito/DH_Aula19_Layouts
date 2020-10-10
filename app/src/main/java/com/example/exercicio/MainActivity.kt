package com.example.exercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val valorGasolina = Integer.parseInt(text_gasolina.text.toString())
            val valorEtanol = Integer.parseInt(text_etanol.text.toString())

            if (valorEtanol < valorGasolina*0.7) imagem.setImageResource(R.drawable.abasteca_etanol)
            else imagem.setImageResource(R.drawable.abasteca_gasolina)
        }
    }
}