package com.demo.demolauncher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.show_hide_button)
        button.setOnClickListener(View.OnClickListener {
            showPanel(it)
            when(button.text){
                "Click Me" -> button.text = "Show"
                "Show" -> button.text = "Hide"
                "Hide" -> button.text = "Show"
            }
        })
    }

    private fun showPanel(view: View) {
        var intent = Intent(applicationContext, CustomPanel::class.java)
        startActivity(intent)
    }
}