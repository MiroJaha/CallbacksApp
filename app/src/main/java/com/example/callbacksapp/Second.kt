package com.example.callbacksapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        Log.d("My Location", "onCreate Activity 2")
        Toast.makeText(this, "onCreate Activity 2", Toast.LENGTH_LONG).show()

        val activity2B = findViewById<Button>(R.id.goTo3)
        activity2B.setOnClickListener {
            startActivity(Intent(this, Third::class.java))
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("My Location", "onStart Activity 2")
        Toast.makeText(this, "onStart Activity 2", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("My Location", "onPause Activity 2")
        Toast.makeText(this, "onStart Activity 2", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("My Location", "onResume Activity 2")
        Toast.makeText(this, "onStart Activity 2", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("My Location", "onStop Activity 2")
        Toast.makeText(this, "onStart Activity 2", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("My Location", "onDestroy Activity 2")
        Toast.makeText(this, "onStart Activity 2", Toast.LENGTH_LONG).show()
    }
}