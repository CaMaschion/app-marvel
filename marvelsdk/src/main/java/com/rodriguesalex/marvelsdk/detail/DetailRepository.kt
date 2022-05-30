package com.rodriguesalex.marvelsdk.detail

import com.rodriguesalex.marvelsdk.detail.data.MarvelCharacterDetail
import com.rodriguesalex.marvelsdk.detail.service.DetailService
import io.reactivex.Single
import javax.inject.Inject

interface DetailRepository {
    fun fetchCharactersDetail(): Single<MarvelCharacterDetail?>
}

class DetailRepositoryImpl @Inject constructor(
    private val service: DetailService
) : DetailRepository {

    override fun fetchCharactersDetail() =
        service.fetchCharactersDetail(LIMIT)
            .map {
                it.data?.results?.first()
            }

    companion object {
        private const val LIMIT = 20
    }
}