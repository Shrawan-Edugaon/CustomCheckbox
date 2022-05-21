package com.example.customcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var mCheckBoxJava:CheckBox
    lateinit var mCheckBoxKotlin:CheckBox
    lateinit var mSubmitBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mCheckBoxJava = findViewById(R.id.checkbox_java)
        mCheckBoxKotlin = findViewById(R.id.checkbox_kotlin)
        mSubmitBtn = findViewById(R.id.submit_button)

        mSubmitBtn.setOnClickListener {
            val sb:StringBuilder =java.lang.StringBuilder("")
            if (mCheckBoxJava.isChecked)
            {
                val str1 = mCheckBoxJava.text.toString()
                sb.append(str1)
            }
            if (mCheckBoxKotlin.isChecked)
            {
                val str2 = mCheckBoxKotlin.text.toString()
                sb.append("\n"+str2)
            }
            if (sb!=null && !sb.toString().equals(""))
            {
                Toast.makeText(this@MainActivity,sb,Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this@MainActivity,"Nothing Selected",Toast.LENGTH_LONG).show()
            }
        }
    }
}