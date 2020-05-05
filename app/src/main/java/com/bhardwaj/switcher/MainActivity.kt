package com.bhardwaj.switcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bitvale.switcher.SwitcherX


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val switch: SwitcherX = findViewById(R.id.switcherCheck)
        val textView: TextView = findViewById(R.id.checkedTextView)

        switch.setOnCheckedChangeListener { checked ->
            if (checked){
                textView.setText("Hey! You switched to:\n             TRUE")
            }else{
                textView.setText("Hey! You switched to:\n             FALSE")
            }
        }
    }
}

