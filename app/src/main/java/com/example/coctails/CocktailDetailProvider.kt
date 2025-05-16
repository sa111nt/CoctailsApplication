package com.example.coctails

object CocktailDataProvider {
    fun getCocktails(): List<Cocktail> {
        return listOf(
            Cocktail(
                name = "Mojito",
                imageResId = R.drawable.mojito,
                ingredients = "2 oz white rum, 1 oz lime juice, 2 teaspoons sugar, soda water, fresh mint leaves",
                preparation = "Muddle mint leaves with sugar and lime juice in a glass. Add rum and ice, then top with soda water. Stir and garnish with a sprig of mint.",
                category = "classic"
            ),
            Cocktail(
                name = "Margarita",
                imageResId = R.drawable.margarita,
                ingredients = "2 oz tequila, 1 oz lime juice, 1 oz triple sec, salt for rimming the glass",
                preparation = "Rub the rim of the glass with lime and dip in salt. Shake the tequila, lime juice, and triple sec with ice, then strain into the glass.",
                category = "classic"
            ),
            Cocktail(
                name = "Old Fashioned",
                imageResId = R.drawable.old_fashioned,
                ingredients = "2 oz bourbon, 1 sugar cube, 2 dashes Angostura bitters, orange peel",
                preparation = "Muddle the sugar and bitters in a glass. Add bourbon and ice, stir. Garnish with a twist of orange peel.",
                category = "classic"
            ),
            Cocktail(
                name = "Pina Colada",
                imageResId = R.drawable.pina_colada,
                ingredients = "2 oz rum, 1 oz coconut cream, 1 oz pineapple juice, pineapple slice",
                preparation = "Blend rum, coconut cream, and pineapple juice with ice until smooth. Serve in a glass and garnish with a pineapple slice.",
                category = "tropic"
            ),
            Cocktail(
                name = "Cosmopolitan",
                imageResId = R.drawable.cosmopolitan,
                ingredients = "1 1/2 oz vodka, 1 oz cranberry juice, 1/2 oz triple sec, 1/4 oz lime juice",
                preparation = "Shake all ingredients with ice and strain into a chilled martini glass. Garnish with a lime twist or a lemon twist.",
                category = "classic"
            ),
            Cocktail(
                name = "Gin and Tonic",
                imageResId = R.drawable.gin_and_tonic,
                ingredients = "2 oz gin, tonic water, lime wedge",
                preparation = "Fill a glass with ice, add gin, top with tonic water, and garnish with a lime wedge.",
                category = "tropic"
            ),
            Cocktail(
                name = "Bloody Mary",
                imageResId = R.drawable.bloody_mary,
                ingredients = "1 1/2 oz vodka, 3 oz tomato juice, 1/2 oz lemon juice, 2 dashes Tabasco, 2 dashes Worcestershire sauce, celery salt, black pepper, celery stalk",
                preparation = "Mix all ingredients in a shaker with ice. Shake gently and strain into a tall glass filled with ice. Garnish with a celery stalk.",
                category = "tropic"
            ),
            Cocktail(
                name = "Negroni",
                imageResId = R.drawable.negroni,
                ingredients = "1 oz gin, 1 oz Campari, 1 oz sweet vermouth",
                preparation = "Stir all ingredients with ice in a mixing glass. Strain into a glass filled with ice and garnish with an orange peel.",
                category = "classic"
            ),
            Cocktail(
                name = "Whiskey Sour",
                imageResId = R.drawable.whiskey_sour,
                ingredients = "2 oz bourbon, 3/4 oz lemon juice, 1/2 oz simple syrup, egg white (optional)",
                preparation = "Shake all ingredients with ice. Strain into a glass and garnish with a cherry or lemon twist.",
                category = "classic"
            ),
            Cocktail(
                name = "Mai Tai",
                imageResId = R.drawable.mai_tai,
                ingredients = "1 oz light rum, 1 oz dark rum, 1/2 oz lime juice, 1/2 oz orange curaçao, 1/2 oz orgeat syrup",
                preparation = "Shake light rum, lime juice, orange curaçao, and orgeat syrup with ice. Strain into a glass and float dark rum on top. Garnish with a cherry and mint.",
                category = "tropic"
            ),
            Cocktail(
                name = "Daiquiri",
                imageResId = R.drawable.daiquiri,
                ingredients = "2 oz white rum, 1 oz lime juice, 3/4 oz simple syrup",
                preparation = "Shake all ingredients with ice and strain into a chilled cocktail glass. Garnish with a lime wheel.",
                category = "classic"
            ),
            Cocktail(
                name = "Manhattan",
                imageResId = R.drawable.manchattan,
                ingredients = "2 oz rye whiskey, 1 oz sweet vermouth, 2 dashes Angostura bitters",
                preparation = "Stir all ingredients with ice and strain into a chilled martini glass. Garnish with a maraschino cherry.",
                category = "classic"
            ),
            Cocktail(
                name = "Espresso Martini",
                imageResId = R.drawable.espresso_martini,
                ingredients = "2 oz vodka, 1 oz espresso, 1/2 oz coffee liqueur, 1/4 oz simple syrup",
                preparation = "Shake all ingredients with ice and strain into a chilled martini glass. Garnish with coffee beans.",
                category = "tropic"
            ),
            Cocktail(
                name = "Tequila Sunrise",
                imageResId = R.drawable.tequila_sunrise,
                ingredients = "2 oz tequila, 4 oz orange juice, 1/2 oz grenadine",
                preparation = "Pour the tequila and orange juice into a glass with ice. Slowly add grenadine to create a sunrise effect. Garnish with an orange slice.",
                category = "tropic"
            ),
            Cocktail(
                name = "Rum Punch",
                imageResId = R.drawable.rum_punch,
                ingredients = "2 oz rum, 1 oz orange juice, 1 oz pineapple juice, 1/2 oz lime juice, 1/2 oz grenadine",
                preparation = "Shake all ingredients with ice and strain into a tall glass filled with ice. Garnish with a cherry and orange slice.",
                category = "tropic"
            ),
            Cocktail(
                name = "Long Island Iced Tea",
                imageResId = R.drawable.long_island,
                ingredients = "1/2 oz vodka, 1/2 oz tequila, 1/2 oz rum, 1/2 oz gin, 1/2 oz triple sec, 1 oz sour mix, cola",
                preparation = "Shake all ingredients (except cola) with ice and strain into a glass filled with ice. Top with cola and garnish with a lemon wedge.",
                category = "tropic"
            ),
            Cocktail(
                name = "Mint Julep",
                imageResId = R.drawable.mint_julep,
                ingredients = "2 oz bourbon, 1/2 oz simple syrup, fresh mint leaves",
                preparation = "Muddle mint leaves with simple syrup in a glass. Add bourbon and fill the glass with crushed ice. Stir and garnish with more mint leaves.",
                category = "classic"
            ),
            Cocktail(
                name = "Caipirinha",
                imageResId = R.drawable.caipirinha,
                ingredients = "2 oz cachaça, 1 lime (cut into wedges), 2 teaspoons sugar",
                preparation = "Muddle the lime and sugar in a glass. Add cachaça and ice, then stir well.",
                category = "tropic"
            ),
            Cocktail(
                name = "Zombie",
                imageResId = R.drawable.zombie,
                ingredients = "1 oz light rum, 1 oz dark rum, 1/2 oz lime juice, 1/2 oz apricot brandy, 1 oz pineapple juice, 1 oz grenadine, 2 dashes bitters",
                preparation = "Shake all ingredients with ice and strain into a tall glass filled with ice. Garnish with a cherry and a slice of pineapple.",
                category = "tropic"
            ),
            Cocktail(
                name = "Sazerac",
                imageResId = R.drawable.sazerac,
                ingredients = "2 oz rye whiskey, 1/4 oz absinthe, 1 sugar cube, 3 dashes Peychaud's bitters",
                preparation = "Muddle the sugar and bitters in a glass. Add rye whiskey and ice, stir, then strain into a glass rinsed with absinthe. Garnish with a lemon twist.",
                category = "classic"
            ),
            Cocktail(
                name = "French 75",
                imageResId = R.drawable.french_75,
                ingredients = "1 oz gin, 1/2 oz lemon juice, 1/2 oz simple syrup, 3 oz champagne",
                preparation = "Shake gin, lemon juice, and simple syrup with ice. Strain into a champagne flute and top with champagne. Garnish with a lemon twist.",
                category = "classic"
            ),
            Cocktail(
                name = "Vesper Martini",
                imageResId = R.drawable.vesper_martini,
                ingredients = "3 oz gin, 1 oz vodka, 1/2 oz Lillet Blanc",
                preparation = "Shake all ingredients with ice and strain into a chilled martini glass. Garnish with a lemon peel.",
                category = "classic"
            ),
            Cocktail(
                name = "Rob Roy",
                imageResId = R.drawable.rob_roy,
                ingredients = "2 oz Scotch whisky, 1 oz sweet vermouth, 2 dashes Angostura bitters",
                preparation = "Stir all ingredients with ice and strain into a chilled cocktail glass. Garnish with a maraschino cherry.",
                category = "classic"
            ),
            Cocktail(
                name = "Black Russian",
                imageResId = R.drawable.black_russian,
                ingredients = "2 oz vodka, 1 oz coffee liqueur",
                preparation = "Pour vodka and coffee liqueur into a glass with ice. Stir gently and serve.",
                category = "classic"
            ),
            Cocktail(
                name = "Amaretto Sour",
                imageResId = R.drawable.amaretto_sour,
                ingredients = "1 1/2 oz amaretto, 1 oz lemon juice, 1/2 oz simple syrup, egg white (optional)",
                preparation = "Shake all ingredients (including egg white if using) with ice. Strain into a glass and garnish with a maraschino cherry.",
                category = "classic"
            ),
            Cocktail(
                name = "Aviation",
                imageResId = R.drawable.aviation,
                ingredients = "2 oz gin, 1/2 oz maraschino liqueur, 1/4 oz crème de violette, 3/4 oz lemon juice",
                preparation = "Shake all ingredients with ice and strain into a chilled cocktail glass. Garnish with a cherry or a lemon twist.",
                category = "classic"
            ),
            Cocktail(
                name = "Boulevardier",
                imageResId = R.drawable.boulevardier,
                ingredients = "1 oz bourbon, 1 oz Campari, 1 oz sweet vermouth",
                preparation = "Stir all ingredients with ice and strain into a chilled cocktail glass. Garnish with an orange twist.",
                category = "classic"
            ),
            Cocktail(
                name = "Blue Lagoon",
                imageResId = R.drawable.blue_lagoon,
                ingredients = "1 oz vodka, 1 oz blue curaçao, 4 oz lemonade",
                preparation = "Fill a glass with ice. Add vodka and blue curaçao, then top with lemonade. Stir gently and garnish with a lemon slice.",
                category = "tropic"
            )


        )
    }
}
