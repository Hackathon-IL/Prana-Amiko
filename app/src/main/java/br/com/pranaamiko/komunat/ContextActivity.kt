package br.com.pranaamiko.komunat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ContextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)

        val button_solution = findViewById<TextView>(R.id.button_help)

        button_solution.setOnClickListener {
            val mIntent = Intent(this, SpeechActivity::class.java)
            startActivity(mIntent)
        }
    }
}