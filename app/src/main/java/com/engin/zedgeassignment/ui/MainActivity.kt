package com.engin.zedgeassignment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.engin.zedgeassignment.adapters.MainPagerAdapter
import com.engin.zedgeassignment.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val tabTextArray = arrayOf(
        "All Images",
        "Favourites",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initPager()
        initTabs()
    }

    private fun initPager() {
        val adapter = MainPagerAdapter(supportFragmentManager, lifecycle, tabTextArray.size)
        binding.viewPager.adapter = adapter
    }

    private fun initTabs() {
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = tabTextArray[position]
        }.attach()
    }
}