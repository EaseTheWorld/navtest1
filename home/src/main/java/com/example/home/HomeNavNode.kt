package com.example.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.fragment.fragment
import com.example.common.nav.Home
import com.example.common.nav.NavNode
import javax.inject.Inject

internal class HomeNavNode @Inject constructor(): NavNode {
    override fun NavGraphBuilder.add() {
        fragment<HomeFragment, Home>()
    }
}