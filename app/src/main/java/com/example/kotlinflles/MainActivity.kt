package com.example.kotlinflles

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var county=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val increase = findViewById<Button>(R.id.increase)
        val count: TextView = findViewById(R.id.count)
        val videre: Button = findViewById(R.id.videre)

        increase.setOnClickListener {
            change()
            val temp:String = county.toString()
            count.setText(temp)
            Toast.makeText(applicationContext, hentSvar(), Toast.LENGTH_SHORT).show()
        }
        videre.setOnClickListener {
            startActivity(Intent(this, HelloWorld::class.java))
        }
    }
    fun change() {
        county += 1
    }
    fun hentSvar() : String {
        val svar = when {
            county ==5 -> "så nåede vi 5"
            county <6 -> "så er det bare fremad"
            county == 10 -> "yeah 10"
            else -> "mon jeg virker" }
        return svar
    }
}