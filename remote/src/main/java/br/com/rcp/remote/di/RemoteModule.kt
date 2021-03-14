package br.com.rcp.remote.di

import br.com.rcp.remote.BASE_URL
import br.com.rcp.remote.repository.EventRepository
import br.com.rcp.remote.repository.EventRepositoryImpl
import br.com.rcp.remote.service.APIService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

// TODO: Remove interceptor
val remote = module {
    val interceptor   = HttpLoggingInterceptor()
    val builder       = OkHttpClient.Builder().addInterceptor(interceptor).build()

    interceptor.level = HttpLoggingInterceptor.Level.BODY

    single<Retrofit>        { Retrofit.Builder().client(builder).baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build() }
    single<EventRepository> { EventRepositoryImpl(get()) }
    single<APIService>      { get<Retrofit>().create() }
}