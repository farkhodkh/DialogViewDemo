package com.example.dialogviewdemo

sealed class MainActivityViewState {

    object DefaultState: MainActivityViewState()

    object OpenDialogState: MainActivityViewState()
}