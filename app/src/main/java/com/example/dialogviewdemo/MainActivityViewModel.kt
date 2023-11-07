package com.example.dialogviewdemo

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

object MainActivityViewModel {
    private val _viewState: MutableStateFlow<MainActivityViewState> by lazy { MutableStateFlow(MainActivityViewState.DefaultState) }
    val viewState: StateFlow<MainActivityViewState> = _viewState

    fun nextState() {
        val newState = if( _viewState.value == MainActivityViewState.DefaultState) {
                MainActivityViewState.OpenDialogState
        } else {
            MainActivityViewState.DefaultState
        }

        _viewState.value = newState
    }
}