package com.example.navtest1

import androidx.navigation.NavController
import androidx.navigation.createGraph
import androidx.navigation.fragment.fragment
import com.example.home.HomeFragment
import kotlinx.serialization.Serializable

// https://developer.android.com/guide/navigation/design#dsl-views
fun createNavGraph(navController: NavController) {
    navController.graph = navController.createGraph(
        startDestination = Home
    ) {
        // Associate each destination with one of the route constants.
        fragment<com.example.home.HomeFragment, Home> {
            label = "Home"
        }
        fragment<com.example.mylibrary.dashboard.DashboardFragment, Dashboard> {
            label = "Dashboard"
        }
    }
}

@Serializable
object Home

@Serializable
data class Dashboard(val name: String)
