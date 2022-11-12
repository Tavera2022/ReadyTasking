package com.example.readytasking.viewmodel.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.readytasking.R
class LoginActivity : AppCompatActivity() {
      lateinit var iniciobutton:Button
      lateinit var registrobutton:Button
      lateinit var restaurarbutton: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        iniciobutton=findViewById(R.id.InicioButton)
        registrobutton=findViewById(R.id.RegistroButton)
        restaurarbutton=findViewById(R.id.RecuperarButton)
        iniciobutton.setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
        }
        registrobutton.setOnClickListener{
            startActivity(Intent(this,RegistroActivity::class.java))
            }
        restaurarbutton.setOnClickListener{
            startActivity(Intent(this,RecuperarActivity::class.java))
        }


     }
}