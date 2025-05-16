package com.example.coctails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CocktailAdapter(
    private val cocktails: List<Cocktail>,
    private val onItemClick: (Cocktail) -> Unit
) : RecyclerView.Adapter<CocktailAdapter.CocktailViewHolder>() {

    inner class CocktailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.cocktailName)
        val image: ImageView = itemView.findViewById(R.id.cocktailImage)

        fun bind(cocktail: Cocktail) {
            name.text = cocktail.name
            image.setImageResource(cocktail.imageResId)
            itemView.setOnClickListener { onItemClick(cocktail) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CocktailViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cocktail_card_item, parent, false)
        return CocktailViewHolder(view)
    }

    override fun onBindViewHolder(holder: CocktailViewHolder, position: Int) {
        holder.bind(cocktails[position])
    }

    override fun getItemCount(): Int = cocktails.size
}
