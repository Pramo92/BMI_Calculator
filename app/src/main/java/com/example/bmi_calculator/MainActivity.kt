package com.example.bmi_calculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun visitNext(view: View?){
        val inputName = findViewById<View>(R.id.editName) as EditText
        val inputAge  = findViewById<View>(R.id.editAge) as EditText
        val inputWeight  = findViewById<View>(R.id.editWeight) as EditText
        val inputHeight  = findViewById<View>(R.id.editHeight) as EditText

        println(inputWeight.text)
        println(inputHeight.text)


        val bmi = (inputWeight.text.toString().toDouble()/ ((inputHeight.text.toString().toDouble())*(inputHeight.text.toString().toDouble())))
        println(bmi)
        //val bmi=15.548743249874865
        val roundedBmi = String.format("%.2f", bmi)
        val bundle = Bundle()
        bundle.putString("name",inputName.text.toString())
        bundle.putString("age",inputAge.text.toString())
        bundle.putString("bmi",roundedBmi.toString())
        val gotoNextScreen = Intent(applicationContext,SecondScreen::class.java)
        gotoNextScreen.putExtras(bundle)
        startActivity(gotoNextScreen)
    }
}