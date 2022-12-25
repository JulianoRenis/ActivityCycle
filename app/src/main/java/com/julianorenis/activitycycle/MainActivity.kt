package com.julianorenis.activitycycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var segundaTela : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("LOG","onCreateMainActivity")
        //Mostra a terla construida
        // colocar os codigos leves aqui

    }

    override fun onStart() {
        super.onStart()
        //Ler  banco de dados , consumo de API
       segundaTela = findViewById<Button>(R.id.btn_sengunda_tela)
        Log.i("LOG","onStartMainActivity")
    }

    override fun onResume() {
        super.onResume()

        // maioria do código deve ser escrita no onResume, pois aqui é onde
        // o Andorid esta aguardando ma interção do usuario
        segundaTela.setOnClickListener {
            var i = Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(i)
        }
        Log.i("LOG","onResumeMainActivity")

    }

    override fun onPause() {
        super.onPause()
        Log.i("LOG","onPauseMainActivity")

    }

    override fun onStop() {
        super.onStop()
        // Voce pode interromper resquisições ao banco de dados, pode parar
        // toda atividade para economizar recursos do aparelho
        Log.i("LOG","onStopMainActivity")

    }

    override fun onDestroy() {
        super.onDestroy()
        //Garantir que todos os dados serão fechados, garantir que não terão dados em cache
        Log.i("LOG","onDestroyMainActivity")

    }
}