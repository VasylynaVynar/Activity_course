package com.example.activity_course

import android.app.Person
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.support.constraint.ConstraintLayout
import kotlinx.parcelize.Parcelize

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val constraintLayout: ConstraintLayout = findViewById<ConstraintLayout>(R.id.mainConstraintLayout)
        constraintLayout.setOnClickListener {
            val person = com.example.activity_course.Person(
                firstName = "Oleo",
                lastName = "Marsian",
                age = 345,
                prof = "Nevro technique")


         val   intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key_person", person )


            startActivity(intent)

        }

    }
}
@Parcelize
data class Person (
    val firstName: String,
    val lastName: String,
    val age : Int,
    val prof : String
    ) : Parcelable