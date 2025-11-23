package com.db.training.pokedex.domain

/**
 * Copyright © 2025. All rights reserved.
 **/
interface PokemonRepository {
    fun getPokemon(): List<Pokemon>
}