package br.com.pranaamiko.komunat

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //abrir a login activity após 3 segundos
        Handler(Looper.getMainLooper()).postDelayed({
            //iniciar um intent
            val myIntent = Intent(this, LanguageActivity::class.java)
            startActivity(myIntent)
            finish()
        }, 5000)
    }
}