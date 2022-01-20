package com.example.a11ylabeledbytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroupLabel = findViewById<TextView>(R.id.group_label_text)
        val radioButtonIds = listOf<Int>(
            R.id.radio_button_1,
            R.id.radio_button_2,
            R.id.radio_button_3,
            R.id.radio_button_4,
        )
        val radioButtons = radioButtonIds.map { id: Int ->
            findViewById<RadioButton>(id)
        }
        radioButtons.forEach { button: RadioButton ->
            button.accessibilityDelegate = object : View.AccessibilityDelegate() {
                override fun onInitializeAccessibilityNodeInfo(
                    host: View?,
                    info: AccessibilityNodeInfo?
                ) {
                    super.onInitializeAccessibilityNodeInfo(host, info)
                    info?.setLabeledBy(radioGroupLabel)
                }
            }
        }
    }
}