package com.rodriguesalex.marvelsdk.di

import com.rodriguesalex.marvelsdk.characters.CharactersRepository
import com.rodriguesalex.marvelsdk.characters.CharactersRepositoryImpl
import com.rodriguesalex.marvelsdk.detail.DetailRepository
import com.rodriguesalex.marvelsdk.detail.DetailRepositoryImpl
import com.rodriguesalex.marvelsdk.di.network.NetworkModule
import dagger.Binds
import dagger.Module

@Module(includes = [NetworkModule::class])
abstract class MarvelSdkModule {

    @Binds
    abstract fun provideCharactersRepository(repositoryImpl: CharactersRepositoryImpl): CharactersRepository

    @Binds
    abstract fun provideDetailRepository(repositoryImpl: DetailRepositoryImpl): DetailRepository
}
