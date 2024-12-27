package com.example.mylibrary.dashboard

import androidx.navigation.NavGraphBuilder
import androidx.navigation.fragment.fragment
import com.example.common.nav.Dashboard
import com.example.common.nav.NavNode
import javax.inject.Inject

internal class DashboardNavNode @Inject constructor(): NavNode<NavGraphBuilder> {
    override fun NavGraphBuilder.add() {
        fragment<DashboardFragment, Dashboard>()
    }
}