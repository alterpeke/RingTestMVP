package com.molochkov.ringtestmvp.core.di

import android.content.Context
import com.molochkov.ringtestmvp.core.RingApplication
import com.molochkov.ringtestmvp.core.di.annotations.ApplicationContext
import com.molochkov.ringtestmvp.utils.Workers
import dagger.Module
import dagger.Provides
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Singleton


@Module
class ApplicationModule(var application: RingApplication) {

    @Provides
    @ApplicationContext
    fun providesApplicationContext(): Context = application

    @Provides
    @Singleton
    fun provideWorkers(): Workers = Workers(Schedulers.io(), AndroidSchedulers.mainThread())
}