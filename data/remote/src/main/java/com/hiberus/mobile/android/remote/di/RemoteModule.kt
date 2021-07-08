package com.hiberus.mobile.android.remote.di

import com.hiberus.mobile.android.data.datasource.characters.CharactersRemoteDataSource
import com.hiberus.mobile.android.remote.characters.CharactersRemoteDataSourceImpl
import com.hiberus.mobile.android.remote.characters.CharactersServiceFactory
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val remoteModule = module {
    single { CharactersServiceFactory.makeCharactersService() }
    single<CharactersRemoteDataSource> { CharactersRemoteDataSourceImpl(charactersService = get()) }
}