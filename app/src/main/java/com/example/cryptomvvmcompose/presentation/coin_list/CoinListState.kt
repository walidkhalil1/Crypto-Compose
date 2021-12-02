package com.example.cryptomvvmcompose.presentation.coin_list

import com.example.cryptomvvmcompose.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
