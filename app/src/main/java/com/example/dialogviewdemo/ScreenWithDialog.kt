package com.example.dialogviewdemo

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@SuppressLint("UnrememberedMutableState")
@Composable
fun ScreenWithDialog(viewModel: MainActivityViewModel) {
    val dialogIsOpen = mutableStateOf(false)

    Surface(modifier = Modifier.fillMaxSize()) {
        Column {
            Button(
                onClick = {
                    dialogIsOpen.value = true
                },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Open dialog")
            }

            if (dialogIsOpen.value) {
                AlertDialog(
                    onDismissRequest = {
                        viewModel.nextState()
                    },
                    title = { Text(text = "Подтверждение действия") },
                    text = { Text("Демо диалог") },
                    confirmButton = {
                        viewModel.nextState()
                    },
                    dismissButton = {
                        viewModel.nextState()
                    }
                )
            }
        }
    }
}