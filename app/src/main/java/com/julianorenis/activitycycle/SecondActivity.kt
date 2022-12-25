package com.julianorenis.activitycycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    lateinit var voltar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("LOG","onCreateSecondActivity")

    }

    override fun onStart() {
        super.onStart()
        voltar = findViewById<Button>(R.id.btn_voltar)
        Log.i("LOG","onStartSecondActivity")

    }

    override fun onResume() {
        super.onResume()

        voltar.setOnClickListener {
            var i = Intent(this@SecondActivity,MainActivity::class.java)
            startActivity(i)
            finish()
        }
        Log.i("LOG","onResumeSecondActivity")

    }

    override fun onPause() {
        super.onPause()
        Log.i("LOG","onPauseSecondActivity")

    }

    override fun onStop() {
        super.onStop()
        Log.i("LOG","onStopSecondActivity")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LOG","onDestroySecondActivity")

    }
}