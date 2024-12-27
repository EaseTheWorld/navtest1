package com.example.mylibrary.dashboard

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute
//import com.example.navtest1.Dashboard

class DashboardViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    init {
//        val route = savedStateHandle.toRoute<Dashboard>()
//        Log.i("Dukoo", "route=$route")
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text
}