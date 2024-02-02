package com.example.retrofit_calling

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var dotsIndicator: DotsIndicator

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        dotsIndicator = findViewById(R.id.dotsIndicator)

        val items = listOf("Page 1", "Page 2", "Page 3") // Replace with your actual data
        val adapter = ViewPagerAdapter(items)
        viewPager.adapter = adapter

        dotsIndicator.setViewPager2(viewPager)

        // Optional: Set up a ViewPager2.OnPageChangeCallback to listen for page changes
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                // Handle page selection
            }
        })
    }
}