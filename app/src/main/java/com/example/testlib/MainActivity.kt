package com.example.testlib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.library.reverseMe
import com.example.mytestlibrary.reverseUs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        "karlo".reverseMe()
        "karlo".reverseUs()
    }
}
