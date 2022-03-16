package com.example.tastyappclone.view.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.tastyappclone.R
import com.example.tastyappclone.view.LoginActivity

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var handler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        handler = Handler()
        handler.postDelayed({
          var intent = Intent(applicationContext, LoginActivity::class.java)
          startActivity(intent)
        }, 5000)
    }
}