package com.sangik.gitstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        Log.d("TEST", "TEST 입니다.")
        Log.d("TEST", "TEST TEST")
    }
}