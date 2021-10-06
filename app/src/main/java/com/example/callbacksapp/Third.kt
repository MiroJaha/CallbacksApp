package com.example.callbacksapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third)

        Log.d("My Location", "onCreate Activity 3")
        Toast.makeText(this, "onCreate Activity 3", Toast.LENGTH_LONG).show()

        val activity3B = findViewById<Button>(R.id.goTo1)
        activity3B.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("My Location", "onStart Activity 3")
        Toast.makeText(this, "onStart Activity 3", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("My Location", "onPause Activity 3")
        Toast.makeText(this, "onStart Activity 3", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("My Location", "onResume Activity 3")
        Toast.makeText(this, "onStart Activity 3", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("My Location", "onStop Activity 3")
        Toast.makeText(this, "onStart Activity 3", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("My Location", "onDestroy Activity 3")
        Toast.makeText(this, "onStart Activity 3", Toast.LENGTH_LONG).show()
    }

}