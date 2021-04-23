package com.example.t_smth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class second_q_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_q_activity)

        var second_page_text = findViewById<TextView>(R.id.page2)
        second_page_text.setOnClickListener {
            var turn_the_page1 = Intent(this, third_q_activity::class.java)
            startActivity(turn_the_page1)
        }
    }
}