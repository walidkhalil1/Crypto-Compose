package com.example.cryptomvvmcompose.data.remote.dto

import com.example.cryptomvvmcompose.domain.model.CoinDetail

data class CoinDetailDto(
    val contract: String,
    val contracts: List<Contract>,
    val description: String,
    val developmentStatus: String,
    val firstDataAt: String,
    val hardwareWallet: Boolean,
    val hashAlgorithm: String,
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val last_data_at: String,
    val links: Links,
    val links_extended: List<LinksExtended>,
    val message: String,
    val name: String,
    val open_source: Boolean,
    val org_structure: String,
    val parent: Parent,
    val platform: String,
    val proof_type: String,
    val rank: Int,
    val started_at: String,
    val symbol: String,
    val tags: List<Tag>,
    val team: List<TeamMember>,
    val type: String,
    val whitepaper: Whitepaper
)

fun CoinDetailDto.toCoinDetail(): CoinDetail {
    return CoinDetail(
        coin_id = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        is_active = is_active,
        tags = tags.map { it.name },
        team = team
    )
}


