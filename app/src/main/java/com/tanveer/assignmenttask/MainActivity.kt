package com.tanveer.assignmenttask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var next : Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "on create called", Toast.LENGTH_SHORT).show()
        next = findViewById(R.id.next)
        next?.setOnClickListener{
            var intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }override fun onResume() {
        super.onResume()
        Toast.makeText(this, "on resume called", Toast.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "on start called", Toast.LENGTH_SHORT).show()    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "on pause called", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "on Stop called", Toast.LENGTH_LONG).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "on Destroy called", Toast.LENGTH_LONG).show()
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "on Restart called", Toast.LENGTH_LONG).show()
    }
}

