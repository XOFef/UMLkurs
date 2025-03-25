package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    object tColor {
        public var tColorOne: Boolean = false
        public var tColorTwo: Boolean = false
        public var tColorTree: Boolean = false
        public var tColorFour: Boolean = false
        public var tColorFive: Boolean = false
        public var tColorSix: Boolean = false
        public var tColorSeven: Boolean = false
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.button_one)
        btn1.setOnClickListener{
            val intent = Intent(this, One::class.java)
            startActivity(intent)
        }
        if (tColor.tColorOne){
            btn1.setBackgroundColor(ContextCompat.getColor(this, R.color.blue))
        }

        val btn2: Button = findViewById(R.id.button_two)
        btn2.setOnClickListener{
            val intent = Intent(this, Two::class.java)
            startActivity(intent)
        }
        if (tColor.tColorTwo){
            btn2.setBackgroundColor(ContextCompat.getColor(this, R.color.blue))
        }

        val btn3: Button = findViewById(R.id.button_tree)
        btn3.setOnClickListener{
            val intent = Intent(this, Tree::class.java)
            startActivity(intent)
        }
        if (tColor.tColorTree){
            btn3.setBackgroundColor(ContextCompat.getColor(this, R.color.blue))
        }

        val btn4: Button = findViewById(R.id.button_four)
        btn4.setOnClickListener{
            val intent = Intent(this, Four::class.java)
            startActivity(intent)
        }
        if (tColor.tColorFour){
            btn4.setBackgroundColor(ContextCompat.getColor(this, R.color.blue))
        }

        val btn5: Button = findViewById(R.id.button_five)
        btn5.setOnClickListener{
            val intent = Intent(this, Five::class.java)
            startActivity(intent)
        }
        if (tColor.tColorFive){
            btn5.setBackgroundColor(ContextCompat.getColor(this, R.color.blue))
        }

        val btn6: Button = findViewById(R.id.button_six)
        btn6.setOnClickListener{
            val intent = Intent(this, Six::class.java)
            startActivity(intent)
        }
        if (tColor.tColorSix){
            btn6.setBackgroundColor(ContextCompat.getColor(this, R.color.blue))
        }

        val btn7: Button = findViewById(R.id.button_seven)
        btn7.setOnClickListener{
            val intent = Intent(this, Seven::class.java)
            startActivity(intent)
        }
        if (tColor.tColorSeven){
            btn7.setBackgroundColor(ContextCompat.getColor(this, R.color.blue))
        }




    }


}