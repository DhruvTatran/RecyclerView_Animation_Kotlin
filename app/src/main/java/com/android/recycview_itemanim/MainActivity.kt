package com.android.recycview_itemanim

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.recycview_itemanim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MainAdapter()
        adapter.submitList(listOf(
                Color.BLUE,
                Color.RED,
                Color.YELLOW,
                Color.GREEN,
                Color.CYAN,
                Color.MAGENTA,
                Color.DKGRAY
        ))
        binding.rvColors.apply {
            this.adapter = adapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}