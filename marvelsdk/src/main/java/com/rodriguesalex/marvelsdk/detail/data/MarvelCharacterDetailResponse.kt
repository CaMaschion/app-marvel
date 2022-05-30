package com.rodriguesalex.marvelsdk.detail.data

import com.rodriguesalex.marvelsdk.characters.data.MarvelCharacterDataResponse

data class MarvelCharacterDetailResponse(
    val data: MarvelCharacterDetailDataResponse? = null
)

data class MarvelCharacterDetailDataResponse(
    val offset: Int? = null,
    val limit: Int? = null,
    val results: List<MarvelCharacterDetail>? = null
)