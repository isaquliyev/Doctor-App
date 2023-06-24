package com.example.examapp_doctorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examapp_doctorapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onPress()
    }

    fun onPress() {
        binding.backArrow.setOnClickListener {
            val intent =
                Intent(this@DetailActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}