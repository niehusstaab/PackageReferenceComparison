package com.joinhoney.dummyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joinhoney.depone.ViewOne
import com.joinhoney.deptwo.ViewTwo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val t1 = findViewById<ViewOne>(R.id.one)
        val t2 = findViewById<ViewTwo>(R.id.two)


    }

}