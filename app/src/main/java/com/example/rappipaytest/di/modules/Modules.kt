package com.example.rappipaytest.di.modules

import android.content.Context
import com.example.rappipaytest.network.api.ApiClient
import com.example.rappipaytest.network.interceptor.ConnectivityInterceptor
import com.example.rappipaytest.network.interceptor.ConnectivityInterceptorImpl
import com.example.rappipaytest.network.interceptor.RequestInterceptor
import com.example.rappipaytest.network.interceptor.RequestInterceptorImpl
import com.example.rappipaytest.util.ImageLoader
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val networkModule = module {
    single { ApiClient.invoke() }
    single<ConnectivityInterceptor> { ConnectivityInterceptorImpl(get()) }
    single<RequestInterceptor> { RequestInterceptorImpl() }
}

val repositoryModule = module {

}

val localModule = module {
}

val dataModule = module {
    single { androidContext().getSharedPreferences("Prefs", Context.MODE_PRIVATE) }
}

val databaseModule = module {

    /*// DB Binding
    single { CompanionFouDatabase.invoke(androidContext()) }

    fun provideApiInfoDao(database: CompanionFouDatabase): ApiInfoDao {
        return database.getApiInfoDao()
    }

    // DAO Providers
    fun provideBasicServantDao(database: CompanionFouDatabase): BasicServantDao {
        return database.getBasicServantDao()
    }

    fun provideBasicEquipDao(database: CompanionFouDatabase): BasicEquipDao {
        return database.getBasicEquipDao()
    }

    fun provideBasicCommandCodeDao(database: CompanionFouDatabase): BasicCommandCodeDao {
        return database.getBasicCommandCodeDao()
    }

    fun provideBasicMysticCodeDao(database: CompanionFouDatabase): BasicMysticCodeDao {
        return database.getBasicMysticCodeDao()
    }

    fun provideBasicWarDao(database: CompanionFouDatabase): BasicWarDao {
        return database.getBasicWarDao()
    }

    fun provideBasicEventDao(database: CompanionFouDatabase): BasicEventDao {
        return database.getBasicEventDao()
    }

    // DAO Binding
    single { provideApiInfoDao(get()) }

    single { provideBasicServantDao(get()) }
    single { provideBasicEquipDao(get()) }
    single { provideBasicCommandCodeDao(get()) }
    single { provideBasicMysticCodeDao(get()) }
    single { provideBasicWarDao(get()) }
    single { provideBasicEventDao(get()) }*/
}

val serviceModule = module {

}

val workerModule = module {

}

val viewModelModule = module {
    /*viewModel { BasicServantViewModel(get()) }
    viewModel { BasicEquipViewModel(get()) }
    viewModel { LocalDataViewModel(get()) }*/
}

val utilsModule = module {
    // factory { (context: Context) -> AppLoader(context) }
    factory { ImageLoader(get()) }
}
