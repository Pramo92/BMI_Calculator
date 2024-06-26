package com.example.bmi_calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.interface2)

        val i=intent

        val name = i.getStringExtra("name")
        val age = i.getStringExtra("age")
        val bmi = i.getStringExtra("bmi")

        val getname = findViewById<View>(R.id.getname) as TextView
        val getage = findViewById<View>(R.id.getage) as TextView
        val getbmi = findViewById<View>(R.id.getbmi) as TextView

        getname.text = name
        getage.text = age
        getbmi.text=bmi
    }



}