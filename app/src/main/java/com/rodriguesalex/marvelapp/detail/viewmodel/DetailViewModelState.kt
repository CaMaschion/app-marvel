package com.rodriguesalex.marvelapp.detail.viewmodel

import com.rodriguesalex.marvelapp.detail.data.DetailCharacterDTO

sealed class DetailViewModelState {

    object Loading : DetailViewModelState()
    data class Loaded(val description: DetailCharacterDTO) : DetailViewModelState()
}
