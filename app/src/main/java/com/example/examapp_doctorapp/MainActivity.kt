package com.example.examapp_doctorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examapp_doctorapp.adapter.Adapter
import com.example.examapp_doctorapp.adapter.OnItemClickListener
import com.example.examapp_doctorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var list = mutableListOf<Int>(
        R.drawable.doctor_example,
        R.drawable.doctor_example,
        R.drawable.doctor_example,
        R.drawable.doctor_example,
        R.drawable.doctor_example,
        R.drawable.doctor_example,
        R.drawable.doctor_example,
        R.drawable.doctor_example,
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = Adapter(list, object : OnItemClickListener {
            override fun onItemClick() {
                val intent =
                    Intent(this@MainActivity, DetailActivity::class.java)
                startActivity(intent)
            }
        })
    }
}