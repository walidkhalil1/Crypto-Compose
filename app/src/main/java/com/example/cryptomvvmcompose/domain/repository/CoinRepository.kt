package com.example.cryptomvvmcompose.domain.repository

import com.example.cryptomvvmcompose.data.remote.dto.CoinDetailDto
import com.example.cryptomvvmcompose.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}