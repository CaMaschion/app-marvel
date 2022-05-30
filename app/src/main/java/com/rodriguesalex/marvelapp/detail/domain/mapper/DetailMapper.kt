package com.rodriguesalex.marvelapp.detail.domain.mapper

import com.rodriguesalex.marvelapp.detail.data.DetailCharacterDTO
import com.rodriguesalex.marvelsdk.detail.data.MarvelCharacterDetail

fun List<MarvelCharacterDetail>.toDto(): DetailCharacterDTO = first().toDto()

fun MarvelCharacterDetail.toDto(): DetailCharacterDTO =
    DetailCharacterDTO(
        description = description ?: ""
    )
