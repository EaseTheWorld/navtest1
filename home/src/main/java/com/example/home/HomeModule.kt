package com.example.home

import com.example.common.nav.NavNode
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
internal interface HomeModule {
    @IntoSet
    @Binds
    fun bindNavigationNode(impl: HomeNavNode): NavNode
}