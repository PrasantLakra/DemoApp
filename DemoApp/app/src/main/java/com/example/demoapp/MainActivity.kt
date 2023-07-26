package com.example.demoapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username = findViewById<View>(R.id.username) as TextView
        val password = findViewById<View>(R.id.password) as TextView
        val login = findViewById<View>(R.id.login) as MaterialButton

        //admin and admin

        login.setOnClickListener {
            if (username.text.toString() == "admin" && password.text.toString() == "admin") {
                //correct
                Toast.makeText(this@MainActivity, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show()
            } else  //incorrect
                Toast.makeText(this@MainActivity, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show()


        }
    }
}

