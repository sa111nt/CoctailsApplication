package com.example.coctails

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.coctails.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Cocktail details"


        if (savedInstanceState == null) {

            val cocktailName = intent.getStringExtra("cocktailName")
            val cocktailIngredients = intent.getStringExtra("cocktailIngredients")
            val cocktailPreparation = intent.getStringExtra("cocktailPreparation")
            val cocktailImageResId = intent.getIntExtra("cocktailImageResId", R.drawable.placeholder_cocktail)

            binding.toolbarCocktailImage.setImageResource(cocktailImageResId)


            val cocktailDetailFragment = CocktailDetailFragment()

            val bundle = Bundle().apply {
                putString("cocktailName", cocktailName)
                putString("cocktailIngredients", cocktailIngredients)
                putString("cocktailPreparation", cocktailPreparation)
                putInt("cocktailImageResId", cocktailImageResId)
            }

            cocktailDetailFragment.arguments = bundle

            supportFragmentManager.beginTransaction()
                .replace(R.id.CocktailDetailFragment, cocktailDetailFragment)
                .commit()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
