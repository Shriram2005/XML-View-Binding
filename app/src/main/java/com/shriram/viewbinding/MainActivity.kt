package com.shriram.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.shriram.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.helloText.setOnClickListener {
            binding.bg.setBackgroundColor(ContextCompat.getColor(this,R.color.red))
        }

        binding.bg.setOnClickListener {
            it.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        }



    }
}