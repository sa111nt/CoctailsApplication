package com.example.coctails

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.coctails.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navigationView.setNavigationItemSelectedListener(this)

        if (resources.configuration.smallestScreenWidthDp >= 600) {
            if (savedInstanceState == null) {
                val homeTabsFragment = HomeTabsFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.HomeTabsFragment, homeTabsFragment)
                    .commit()

                val cocktailDetailFragment = CocktailDetailFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.CocktailDetailFragment, cocktailDetailFragment)
                    .commit()
            }
        } else {
            if (savedInstanceState == null) {
                val homeTabsFragment = HomeTabsFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.HomeTabsFragment, homeTabsFragment)
                    .commit()
            }
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val fragment: Fragment = when (item.itemId) {
            R.id.nav_about -> AboutFragment()
            R.id.nav_settings -> SettingsFragment()
            else -> HomeTabsFragment()
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.HomeTabsFragment, fragment)
            .commit()

        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
