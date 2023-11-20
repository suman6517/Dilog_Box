package com.example.demohomeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import cn.pedant.SweetAlert.SweetAlertDialog

class aleart_dilog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aleart_dilog)

        val btn1 = findViewById<Button>(R.id.button_first)
        val btn2 = findViewById<Button>(R.id.button_secound)
        val btn3 = findViewById<Button>(R.id.button_thired)

        btn1.setOnClickListener {
            SweetAlertDialog(this,SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("This is Sucess SweetAlertDialog")
                .show()

        }
        btn2.setOnClickListener {
            SweetAlertDialog(this,SweetAlertDialog.ERROR_TYPE)
                .setTitleText("THERE IS AN ERROR")
                .show()
        }

        btn3.setOnClickListener {
            SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("THIS IS A WRANING")
                .show()

        }
    }
}