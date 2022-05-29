package com.rodriguesalex.marvelapp.di.module

import com.rodriguesalex.marvelapp.detail.di.DetailModule
import com.rodriguesalex.marvelapp.detail.presentation.DetailActivity
import com.rodriguesalex.marvelapp.di.scope.ActivityScope
import com.rodriguesalex.marvelapp.home.di.HomeModule
import com.rodriguesalex.marvelapp.home.presentation.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun homeActivity(): HomeActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [DetailModule::class])
    abstract fun detailActivity(): DetailActivity
}
