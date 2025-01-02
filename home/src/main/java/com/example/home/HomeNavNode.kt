package com.example.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.fragment.fragment
import com.example.common.nav.NavNode
import com.example.home.route.Home
import javax.inject.Inject

internal class HomeNavNode @Inject constructor(): NavNode<NavGraphBuilder> {
    override fun NavGraphBuilder.add() {
        fragment<HomeFragment, Home>()
    }
}