package com.db.training.pokedex.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.db.training.pokedex.ui.screens.PokemonLazyGrid
import com.db.training.pokedex.ui.theme.PokedexTheme

class MainActivity : ComponentActivity() {

    val viewModel = PokemonViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokedexTheme {
                val pokemonList by viewModel.pokemonList.collectAsState()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        //PokemonList(pokemonList)
                        //PokemonLazyList(pokemonList)
                        PokemonLazyGrid(pokemonList)
                    }
                }
            }
        }
    }
}







