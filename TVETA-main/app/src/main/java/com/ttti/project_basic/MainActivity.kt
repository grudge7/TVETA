package com.ttti.project_basic

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    var pageadd: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mybutton = findViewById<Button>(R.id.mybutton)
        val mybuttontv = findViewById<Button>(R.id.mybuttontv)
        val answer = findViewById<TextView>(R.id.answer)
        val edittext = findViewById<EditText>(R.id.edittext)
        val edittext2 = findViewById<EditText>(R.id.edittext2)
        edittext.hint = "Enter Your Name"
        edittext2.hint = "Enter Your Age"
        mybutton.setOnClickListener { Toast.makeText(applicationContext, "Android Is Fun", Toast.LENGTH_SHORT)
            .show() }
        mybuttontv.setOnClickListener {
            if (edittext.text.toString().isEmpty() || edittext2.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Please enter your name and age", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, """Your Name - ${edittext.text} Your Age - ${edittext2.text}""",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun pageadd(view: View?) {
        val intent = Intent(this, PageAdd::class.java)
        startActivity(intent)
    }
}

