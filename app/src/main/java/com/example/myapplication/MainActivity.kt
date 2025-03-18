package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.button_one)
        btn1.setOnClickListener{
            val intent = Intent(this, One::class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.button_two)
        btn2.setOnClickListener{
            val intent = Intent(this, Two::class.java)
            startActivity(intent)
        }

        val btn3: Button = findViewById(R.id.button_tree)
        btn3.setOnClickListener{
            val intent = Intent(this, Tree::class.java)
            startActivity(intent)
        }

        val btn4: Button = findViewById(R.id.button_four)
        btn4.setOnClickListener{
            val intent = Intent(this, Four::class.java)
            startActivity(intent)
        }

        val btn5: Button = findViewById(R.id.button_five)
        btn5.setOnClickListener{
            val intent = Intent(this, Five::class.java)
            startActivity(intent)
        }

        val btn6: Button = findViewById(R.id.button_six)
        btn6.setOnClickListener{
            val intent = Intent(this, Six::class.java)
            startActivity(intent)
        }

        val btn7: Button = findViewById(R.id.button_seven)
        btn7.setOnClickListener{
            val intent = Intent(this, Seven::class.java)
            startActivity(intent)
        }





    }



}