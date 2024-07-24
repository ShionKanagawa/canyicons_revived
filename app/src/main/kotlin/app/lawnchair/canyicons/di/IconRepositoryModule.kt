package app.lawnchair.canyicons.di

import android.app.Application
import app.lawnchair.canyicons.repository.IconRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object IconRepositoryModule {

    @Provides
    @Singleton
    fun provideIconRepository(application: Application) = IconRepository(application)
}
