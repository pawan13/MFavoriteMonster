package com.pk.android.mfavoritemonster

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("StringFormatInvalid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button1.setOnClickListener {
            displayImageResources(R.drawable.monster01)
        }
        button2.setOnClickListener {
            displayImageResources(R.drawable.monster02)
        }
        button3.setOnClickListener {
            displayImageResources(R.drawable.monster03)
        }
    }

    private fun displayImageResources(resId: Int) {
        monsterimage.setImageResource(resId)
    }
}
