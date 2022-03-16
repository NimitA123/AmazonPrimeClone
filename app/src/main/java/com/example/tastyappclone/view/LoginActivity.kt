package com.example.tastyappclone.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tastyappclone.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var email = amazonEmail.text.toString()
        val emailPattern:String = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

        SignInButton.setOnClickListener {
                if(!email.isEmpty()  || !amazonPassword.text.toString().isEmpty()) {
                    var intent = Intent(this@LoginActivity, MainActivity::class.java)
                    startActivity(intent)
                }
            else{
                Toast.makeText(this@LoginActivity, "Invalid Address", Toast.LENGTH_LONG).show()
                }

        }
    }
}