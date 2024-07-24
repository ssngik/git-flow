package com.sangik.gitstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class TestActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)

        Log.d("TEST", "TEST LOG")
    }
}