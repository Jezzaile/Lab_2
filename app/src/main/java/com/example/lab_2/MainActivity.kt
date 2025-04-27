package com.example.lab_2

import android.os.Bundle

import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var a:Float = 3.0F
    var b:Float = 0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        b = calcNumb(a)
        Log.d("numb", a.toString())
        Log.d("numb", b.toString())
    }

    fun calcNumb(a:Float): Float {
        var b = 0F
        var c = 0F
        while (b < a){
            c += 1F
            b += 1/c
        }
        return b
    }
}