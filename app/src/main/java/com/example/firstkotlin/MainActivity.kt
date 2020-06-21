package com.example.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener({
            val yearOfBirth:Int = ageEdit.text.toString().toInt()
            val theyear = Calendar.getInstance().get(Calendar.YEAR)
            val age = theyear - yearOfBirth
            textView2.text="your age is " + age + " years"
        })
    }
}