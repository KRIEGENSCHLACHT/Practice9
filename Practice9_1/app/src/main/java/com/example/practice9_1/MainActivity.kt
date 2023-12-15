package com.example.practice9_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }
    fun randomSlide(view: View) {
        val randomIntent = Intent(this, RandomActivity::class.java)
        startActivity(randomIntent)
    }
}