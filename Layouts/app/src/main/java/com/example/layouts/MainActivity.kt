package com.example.layouts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearButton: Button = findViewById(R.id.linearButton)
        val relativeButton: Button = findViewById(R.id.relativeButton)
        val gridButton: Button = findViewById(R.id.gridbutton)

        linearButton.setOnClickListener { // Creating Intent Object
            // Intent is Message
            //      From    : LayoutActivity
            //      To      : LinearLayoutActivity

            // startActivity Method Will Send Intent
            startActivity(
                Intent(
                    this@MainActivity,
                    LinearLayoutActivity::class.java
                )
            )
        }

        relativeButton.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    RelativeLayoutActivity::class.java
                )
            )
        }


        gridButton.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    GridLayoutActivity::class.java
                )
            )
        }
    }
}