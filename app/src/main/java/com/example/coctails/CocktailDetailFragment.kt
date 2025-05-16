package com.example.coctails

import CocktailViewModel
import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.coctails.databinding.FragmentCocktailDetailBinding

import androidx.fragment.app.activityViewModels

class CocktailDetailFragment : Fragment() {

    private val cocktailViewModel: CocktailViewModel by activityViewModels()
    private var _binding: FragmentCocktailDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCocktailDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        cocktailViewModel.selectedCocktail?.let {
            updateContent(it.name, it.ingredients, it.preparation, it.imageResId)
        }

        // jesli argumenty zostaly przekazane (telefon)
        arguments?.let {
            val cocktailName = it.getString("cocktailName")
            val cocktailIngredients = it.getString("cocktailIngredients")
            val cocktailPreparation = it.getString("cocktailPreparation")
            val cocktailImageResId = it.getInt("cocktailImageResId", R.drawable.placeholder_cocktail)

            updateContent(cocktailName, cocktailIngredients, cocktailPreparation, cocktailImageResId)
        }

        // timer
        if (savedInstanceState == null) {
            val timerFragment = TimerFragment()
            childFragmentManager.beginTransaction()
                .replace(R.id.timerFragmentContainer, timerFragment)
                .commit()
        }

        binding.fabSendSms.setOnClickListener {
            val cocktailIngredients = binding.cocktailIngredientsTextView.text.toString()
            Toast.makeText(requireContext(), "SMS sent", Toast.LENGTH_LONG).show()

            AlertDialog.Builder(requireContext())
                .setTitle("SMS Preview")
                .setMessage("Cocktail ingredients:\n$cocktailIngredients")
                .setPositiveButton("OK", null)
                .show()
        }
    }

    fun updateContent(name: String?, ingredients: String?, preparation: String?, imageResId: Int) {
        binding.cocktailNameTextView.text = name ?: ""
        binding.cocktailIngredientsTextView.text = ingredients ?: ""
        binding.cocktailPreparationTextView.text = preparation ?: ""
        binding.cocktailImageView.setImageResource(imageResId)

        binding.ingredientsLabelTextView.visibility = View.VISIBLE
        binding.preparationLabelTextView.visibility = View.VISIBLE
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

