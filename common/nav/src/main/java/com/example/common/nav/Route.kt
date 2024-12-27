package com.example.common.nav

import kotlinx.serialization.Serializable

@Serializable
data object Home

@Serializable
data class Dashboard(val name: String)
