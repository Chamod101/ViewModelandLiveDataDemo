package com.cdp.viewmodelproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    var count=0

    private lateinit var viewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val output = findViewById<TextView>(R.id.txtOutput)
        val btn = findViewById<Button>(R.id.btnCount)
        viewModel.count.observe(this, Observer {
            output.text = it.toString()
        })


        btn.setOnClickListener(){
            viewModel.increment()

        }
    }
}