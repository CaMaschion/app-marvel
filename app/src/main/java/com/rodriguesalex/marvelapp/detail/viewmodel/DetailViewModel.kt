package com.rodriguesalex.marvelapp.detail.viewmodel

import androidx.lifecycle.MutableLiveData
import com.rodriguesalex.commoms.base.BaseViewModel
import com.rodriguesalex.commoms.di.AppSchedulers
import com.rodriguesalex.marvelapp.detail.domain.DetailInteractor
import com.rodriguesalex.marvelapp.home.domain.HomeInteractor
import com.rodriguesalex.marvelapp.home.viewmodel.HomeViewModelState
import javax.inject.Inject

class DetailViewModel @Inject constructor(
    private val interactor: DetailInteractor,
    private val appSchedulers: AppSchedulers

) : BaseViewModel() {

    val state = MutableLiveData<DetailViewModelState>()
    val progressIsVisible = MutableLiveData<Boolean>()

    override fun onCreate() {
        fetchDetailCharacters()
    }

    private fun fetchDetailCharacters() {
        compositeDisposable.add(
            interactor.fetchCharactersDetail()
                .subscribeOn(appSchedulers.io)
                .observeOn(appSchedulers.main)
                .doOnSubscribe {
                    progressIsVisible.value = true
                }
                .doFinally {
                    progressIsVisible.value = false
                }
                .subscribe({
                    state.value = DetailViewModelState.Loaded(it)
                }, {
                    it.printStackTrace()
                })
        )
    }
}