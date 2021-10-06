package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("My Location","onCreate Activity 1")
        Toast.makeText(this,"onCreate Activity 1",Toast.LENGTH_LONG).show()

        val activity1B = findViewById<Button>(R.id.goTo2)
        activity1B.setOnClickListener{
            startActivity(Intent(this,Second::class.java))
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("My Location","onStart Activity 1")
        Toast.makeText(this,"onStart Activity 1",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("My Location","onPause Activity 1")
        Toast.makeText(this,"onStart Activity 1",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("My Location","onResume Activity 1")
        Toast.makeText(this,"onStart Activity 1",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("My Location","onStop Activity 1")
        Toast.makeText(this,"onStart Activity 1",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("My Location","onDestroy Activity 1")
        Toast.makeText(this,"onStart Activity 1",Toast.LENGTH_LONG).show()
    }

}