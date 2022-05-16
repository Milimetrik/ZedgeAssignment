package com.engin.zedgeassignment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.engin.zedgeassignment.ui.FavouriteImagesFragment
import com.engin.zedgeassignment.ui.ImageListFragment

class MainPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle, private val numTabs: Int): FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return numTabs
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return ImageListFragment()
            1 -> return FavouriteImagesFragment()
        }
        return ImageListFragment()
    }
}