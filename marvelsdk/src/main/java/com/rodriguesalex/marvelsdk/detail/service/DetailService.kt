package com.rodriguesalex.marvelsdk.detail.service

import com.rodriguesalex.marvelsdk.detail.data.MarvelCharacterDetailResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface DetailService {

    @GET("characters/characterId")
    fun fetchCharactersDetail(@Query("limit") limit: Int): Single<MarvelCharacterDetailResponse>
}