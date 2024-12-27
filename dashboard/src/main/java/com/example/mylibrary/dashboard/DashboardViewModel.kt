package com.example.mylibrary.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute
import com.example.common.nav.Dashboard

class DashboardViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        val route = savedStateHandle.toRoute<Dashboard>()
        value = "This is dashboard Fragment from ${route.name}"
    }
    val text: LiveData<String> = _text
}