package com.example.lab03_2

import android.content.Intent
import android.os.Bundle

class Activity2 : BaseActivity(R.layout.activity_2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bnToFirst?.setOnClickListener { finish() }
        bnToThird?.setOnClickListener {
            startActivityForResult(Intent(applicationContext, Activity3::class.java), 0)
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Включаем кнопку "Назад" в верхней строке приложения
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == 1) { finish() }
    }
}