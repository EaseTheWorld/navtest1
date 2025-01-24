package com.example.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dashboard.route.Dashboard
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val _routeChannel = Channel<Any>()
    val routeFlow = _routeChannel.receiveAsFlow()

    fun onClickButton1() {
        navigateTo(Dashboard("button1"))
    }

    fun onClickButton2() {
        navigateTo(Dashboard("button2"))
    }

    private fun navigateTo(route: Any) {
        viewModelScope.launch {
//            delay(5000)
            _routeChannel.send(route)
        }
    }

    /*
    private val _textLiveData = MutableLiveData<String>()
    val textLiveData: LiveData<String> = _text

    private val _textSharedFlow = MutableSharedFlow<String>()
    val textSharedFlow = _textSharedFlow

    private val _textChannel = Channel<String>()
    val textChannel = _textChannel.receiveAsFlow()

    fun emitText(text: String) {
        viewModelScope.launch {
            Log.i("Log", "before delay")
            delay(5000)
            Log.i("Log", "before LiveData")
            // if emit in stopped and observer came back to started

            // LiveData can be observed when back
            // LiveData supports multiple observer
            _textLiveData.value = text
            Log.i("Log", "before SharedFlow")

            // SharedFlow cannot be observed when back
            // SharedFlow supports multiple observer(if set replay=1, then it will work like StateFlow)
            _textSharedFlow.emit(text)
            Log.i("Log", "before Channel")

            // Channel cannot be observed when back
            // Channel supports single observer(if multiple, only one will receive)
            // navigation should be single observed
            _textChannel.send(text)
        }
    }
     */
}