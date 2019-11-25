package com.example.sumaapk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnOblicz.setOnClickListener(){
            var liczba1 = txtLiczba1.text.toString().toInt()
            var liczba2 = txtLiczba2.text.toString().toInt()
            var suma = 0

            for(x in liczba1 until liczba2+1){
                suma+=x
            }
            lblResult.text = suma.toString()
        }
    }
}
