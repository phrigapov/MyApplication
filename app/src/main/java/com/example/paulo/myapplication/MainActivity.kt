package com.example.paulo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
//teste
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

        var nota1 = editNota1.text.toString().toDouble()
        var nota2 = editNota2.text.toString().toDouble()
        var result = calcula(nota1,nota2).toString()

        //textView.text = Editable.Factory.getInstance().newEditable(result)
        textView.text = result

    }
}

