package com.example.activity_course

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

      val person: Person? =  intent.extras?.getParcelable ("key_person") as Person ?
        val textViwe: TextView = findViewById<TextView>(R.id.TextView)
        textViwe.text = "$person "

    }
}