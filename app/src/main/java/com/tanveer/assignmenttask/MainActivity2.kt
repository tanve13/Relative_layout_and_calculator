package com.tanveer.assignmenttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    var btnNumber: Button? = null
    var btnMul: Button? = null
    var btnDiv: Button? = null
    var btnAdd: Button? = null
    var btnSub: Button? = null
    var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnNumber = findViewById(R.id.btnNumber)
        btnMul = findViewById(R.id.btnMul)
        btnDiv = findViewById(R.id.btnDiv)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMul?.setOnClickListener {
            number *= 2
            btnNumber?.setText(number.toString())
        }
        btnDiv?.setOnClickListener {
            number /= 2
            btnNumber?.setText(number.toString())
        }
        btnAdd?.setOnClickListener {
                number += 2
                btnNumber?.setText(number.toString())
            }
            btnSub?.setOnClickListener {
                number -= 2
                btnNumber?.setText(number.toString())
            }
    }
}