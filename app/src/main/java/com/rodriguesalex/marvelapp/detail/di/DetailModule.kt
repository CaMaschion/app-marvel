package com.rodriguesalex.marvelapp.detail.di

import androidx.lifecycle.ViewModel
import com.rodriguesalex.commoms.di.ViewModelKey
import com.rodriguesalex.marvelapp.detail.domain.DetailInteractor
import com.rodriguesalex.marvelapp.detail.domain.DetailInteractorImpl
import com.rodriguesalex.marvelapp.detail.viewmodel.DetailViewModel
import com.rodriguesalex.marvelapp.di.scope.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class DetailModule {

    @ActivityScope
    @Binds
    @IntoMap
    @ViewModelKey(DetailViewModel::class)
    abstract fun bindDetailViewModel(viewModel: DetailViewModel): ViewModel

    @Binds
    abstract fun provideDetailInteractor(interactor: DetailInteractorImpl): DetailInteractor

}
