package com.example.home

import com.example.dashboard.route.Dashboard
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class HomeViewModelTest {

    private lateinit var viewModel: HomeViewModel

    @Before
    fun setup() {
        Dispatchers.setMain(StandardTestDispatcher())
        viewModel = HomeViewModel()
    }

    @After
    fun teardown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `routeFlow emits Dashboard(button1) when onClickButton1 is called`() = runTest {
        viewModel.onClickButton1()
        val result = viewModel.routeFlow.first()
        assertEquals(Dashboard("button1"), result)
    }

    @Test
    fun `routeFlow emits Dashboard(button2) when onClickButton1 is called`() = runTest {
        viewModel.onClickButton2()
        val result = viewModel.routeFlow.first()
        assertEquals(Dashboard("button2"), result)
    }
}