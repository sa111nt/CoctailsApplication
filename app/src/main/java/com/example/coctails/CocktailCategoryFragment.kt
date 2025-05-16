package com.example.coctails

import CocktailViewModel
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coctails.databinding.FragmentCocktailCategoryBinding

class CocktailCategoryFragment : Fragment() {

    private val cocktailViewModel: CocktailViewModel by activityViewModels()
    private var _binding: FragmentCocktailCategoryBinding? = null
    private val binding get() = _binding!!

    private lateinit var category: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        category = arguments?.getString("category") ?: ""
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCocktailCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val filtered = CocktailDataProvider.getCocktails().filter { it.category == category }
        val adapter = CocktailAdapter(filtered) { selectedCocktail ->

            cocktailViewModel.selectedCocktail = selectedCocktail

            val detailFragment = activity
                ?.supportFragmentManager
                ?.findFragmentById(R.id.CocktailDetailFragment) as? CocktailDetailFragment

            if (detailFragment != null) {
                detailFragment.updateContent(
                    selectedCocktail.name,
                    selectedCocktail.ingredients,
                    selectedCocktail.preparation,
                    selectedCocktail.imageResId
                )
            } else {
                val intent = Intent(requireContext(), DetailActivity::class.java)
                intent.putExtra("cocktailName", selectedCocktail.name)
                intent.putExtra("cocktailIngredients", selectedCocktail.ingredients)
                intent.putExtra("cocktailPreparation", selectedCocktail.preparation)
                intent.putExtra("cocktailImageResId", selectedCocktail.imageResId)

                startActivity(intent)
            }
        }

        binding.cocktailRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.cocktailRecyclerView.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(category: String): CocktailCategoryFragment {
            val fragment = CocktailCategoryFragment()
            fragment.arguments = Bundle().apply {
                putString("category", category)
            }
            return fragment
        }
    }
}
