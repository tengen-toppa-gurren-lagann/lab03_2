package com.example.lab03_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : BaseActivity(R.layout.activity_1) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bnToSecond?.setOnClickListener {
            startActivity(Intent(applicationContext, Activity2::class.java))
        }
    }
}

abstract class BaseActivity(private val layoutResID: Int) : AppCompatActivity() {
    var bnToFirst : View? = null
    var bnToSecond : View? = null
    var bnToThird : View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResID)
        bnToFirst = findViewById(R.id.btn2first)
        bnToSecond = findViewById(R.id.btn2second)
        bnToThird = findViewById(R.id.btn2third)
        val navBottom : BottomNavigationView = findViewById<View>(R.id.nav_bottom) as BottomNavigationView
        navBottom.setOnNavigationItemReselectedListener {
           startActivity(Intent(applicationContext, ActivityAbout::class.java))
        }
    }
}
