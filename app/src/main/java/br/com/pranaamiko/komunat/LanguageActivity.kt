package br.com.pranaamiko.komunat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text

class LanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        val english = findViewById<TextView>(R.id.lang_eng)

        english.setOnClickListener {
            val mIntent = Intent(this, ContextActivity::class.java)
            startActivity(mIntent)
        }
        val languages = resources.getStringArray(R.array.Languages)
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, languages)
            spinner.adapter = adapter
                }
    }
}