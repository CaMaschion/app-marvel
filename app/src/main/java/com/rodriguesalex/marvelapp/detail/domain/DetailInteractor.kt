package com.rodriguesalex.marvelapp.detail.domain

import com.rodriguesalex.marvelapp.detail.data.DetailCharacterDTO
import com.rodriguesalex.marvelapp.detail.domain.mapper.toDto
import com.rodriguesalex.marvelsdk.detail.DetailRepository
import io.reactivex.Single
import javax.inject.Inject

interface DetailInteractor {
    fun fetchCharactersDetail(): Single<DetailCharacterDTO>
}

class DetailInteractorImpl @Inject constructor(
    private val repository: DetailRepository
) : DetailInteractor {

    override fun fetchCharactersDetail() =
        repository.fetchCharactersDetail()
            .map {
                it.toDto()
            }
}
