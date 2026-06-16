package it.fpetito.merge_press_application.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel

@Composable @Preview(showBackground = true, showSystemUi = true) fun HomeScreen(
    onOpenPdf : (String) -> Unit = {},
    viewModel : HomeViewModel = hiltViewModel()
) {


    Column {
        Row{
            Surface(
                shape = MaterialTheme.shapes.medium,
                tonalElevation = 4.dp,
                onClick = {

                    onOpenPdf("")
                }
            ){
                Text(
                    text = "Open Pdf",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }



}