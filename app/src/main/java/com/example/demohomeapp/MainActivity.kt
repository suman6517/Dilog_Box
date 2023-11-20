package com.example.demohomeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    val customMenu = com.example.demohomeapp.CustomMenu()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val showPopUp = findViewById<Button>(R.id.button)
        val showAleartDilog = findViewById<Button>(R.id.button1)
        val customAleart = findViewById<Button>(R.id.button2)
        val webview = findViewById<Button>(R.id.button3)


        showPopUp.setOnClickListener {
            customMenu.showMenu(this,it)
        }

        showAleartDilog.setOnClickListener {
            val dilog = AlertDialog.Builder(this)

            dilog.setTitle(R.string.aleart_title)
            dilog.setMessage(R.string.aleart_message)
            dilog.setIcon(R.drawable.delete_for_aleartdilog)

            dilog.setPositiveButton(R.string.aleart_possitive){ dilog, which ->

                Toast.makeText(this,R.string.aleart_possitive,Toast.LENGTH_LONG).show()

            }
            dilog.setNegativeButton(R.string.aleart_negative){dilog,which ->
                Toast.makeText(this,R.string.aleart_negative,Toast.LENGTH_LONG).show()
            }

            dilog.setNeutralButton(R.string.aleart_nutural){dilog , which->

                Toast.makeText(this,R.string.aleart_nutural,Toast.LENGTH_LONG).show()
            }

            dilog.setCancelable(false)
            dilog.show()

        }
      customAleart.setOnClickListener {

          val intent = Intent(this,aleart_dilog::class.java)
          startActivity(intent)
      }
        webview.setOnClickListener {
            val intent = Intent(this,web_view::class.java)
            startActivity(intent)
        }

    }
}