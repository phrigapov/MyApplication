package com.example.paulo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        buttonCalc.setOnClickListener(this)
    }

    fun calcula(nota1: Double, nota2: Double): Double {
        return (nota1+nota2)/2
    }

    override fun onClick(view: View?) {

        textView.text = calcula(10.0,5.0).toString()
    }
}

