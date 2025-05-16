package com.example.coctails
import java.io.Serializable

data class Cocktail(
    val name: String,
    val imageResId: Int,
    val ingredients: String,
    val preparation: String,
    val category: String
) : Serializable


