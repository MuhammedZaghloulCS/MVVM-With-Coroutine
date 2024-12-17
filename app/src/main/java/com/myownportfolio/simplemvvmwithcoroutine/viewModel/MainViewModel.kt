package com.myownportfolio.simplemvvmwithcoroutine.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {
    private val _quoteLiveData= MutableStateFlow<String>("0")
    val quoteLiveData: StateFlow<String>
            get()=_quoteLiveData

    fun start()
    {
        viewModelScope.launch {
            for (i in 0..10) {
                _quoteLiveData.emit (i.toString())
                delay(1000)

            }
        }

    }

}