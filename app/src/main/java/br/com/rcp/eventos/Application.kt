package br.com.rcp.eventos

import android.app.Application
import br.com.rcp.domain.di.domain
import br.com.rcp.home.di.home
import br.com.rcp.remote.di.remote
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Application : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@Application)
            modules(listOf(domain, remote, home))
        }
    }
}