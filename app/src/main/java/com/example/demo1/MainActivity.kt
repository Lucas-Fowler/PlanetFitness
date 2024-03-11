package com.example.demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide()

        val username : TextView = findViewById(R.id.username)
        val password : TextView = findViewById(R.id.password)
        //admin and admin

        val loginbtn : MaterialButton = findViewById(R.id.loginbtn)

//        loginbtn.setOnClickListener {
//            if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
//                //correct
//                Toast.makeText(applicationContext, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show()
//            } else run {
//                //incorrect
//                Toast.makeText(applicationContext, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show()
//            }
//        }
    }
}