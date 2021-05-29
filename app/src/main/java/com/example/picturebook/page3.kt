package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        var button3=findViewById<Button>(R.id.btnnext3)
        button3.setOnClickListener{
            var intent= Intent(baseContext,page4::class.java)
            startActivity(intent)
        }
        var button33=findViewById<Button>(R.id.btnback3)
        button33.setOnClickListener{
            var intent= Intent(baseContext,page2::class.java)
            startActivity(intent)
        }
    }
}

