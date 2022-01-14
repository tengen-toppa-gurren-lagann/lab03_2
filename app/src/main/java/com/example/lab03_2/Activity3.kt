package com.example.lab03_2

import android.os.Bundle

class Activity3 : BaseActivity(R.layout.activity_3) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bnToFirst?.setOnClickListener {
            setResult(RESULT_FIRST_USER)
            finish()
        }
        bnToSecond?.setOnClickListener {
            setResult(RESULT_CANCELED)
            finish()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Включаем кнопку "Назад" в верхней строке приложения
    }
}