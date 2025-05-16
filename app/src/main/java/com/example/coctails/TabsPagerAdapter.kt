package com.example.coctails

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabsPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AppInfoFragment()
            1 -> CocktailCategoryFragment.newInstance("classic")
            2 -> CocktailCategoryFragment.newInstance("tropic")
            else -> throw IllegalArgumentException("Invalid tab position")
        }
    }
}
