package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.transition.Visibility


class One : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_one)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn1: Button = findViewById(R.id.btn_one)
        btn1.setOnClickListener{
            MainActivity.tColor.tColorOne = true
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.btnAn)
        val answer: ImageView = findViewById(R.id.imAn)
        btn2.setOnClickListener{
            answer.visibility = View.VISIBLE
        }
    }
}