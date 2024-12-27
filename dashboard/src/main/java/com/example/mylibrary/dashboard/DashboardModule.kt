package com.example.mylibrary.dashboard

import androidx.navigation.NavGraphBuilder
import com.example.common.nav.NavNode
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
internal interface DashboardModule {
    @IntoSet
    @Binds
    fun bindNavNode(impl: DashboardNavNode): NavNode<NavGraphBuilder>
}