package com.example.cryptomvvmcompose.presentation.coin_detail

import com.example.cryptomvvmcompose.domain.model.Coin
import com.example.cryptomvvmcompose.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
