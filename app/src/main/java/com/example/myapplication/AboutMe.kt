package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutMe : AppCompatActivity() {

    companion object
    {
        const val myName = "name"
        const val myEmail = "email"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        val dataReceived: TextView = findViewById(R.id.textAboutMe)
        val name = intent.getStringExtra(myName)
        val email = intent.getStringExtra(myEmail)

        val text = """
                    $name
            $email
        """.trimIndent()
        dataReceived.text = text
    }
}
