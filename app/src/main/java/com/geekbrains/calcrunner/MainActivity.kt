package com.geekbrains.calcrunner

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            val uri = Uri.parse("calcscheme://calchost")
            intent = Intent(Intent.ACTION_VIEW, uri)
            val data = findViewById<EditText>(R.id.edit_text).text.toString()
            intent.putExtra("data", data)
            startActivity(Intent.createChooser(intent, "Open it"))
        }
    }
}