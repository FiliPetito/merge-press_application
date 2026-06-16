package it.fpetito.merge_press_application.ui.screens.pdfViewer

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel

@Composable @Preview(showBackground = true, showSystemUi = true) fun PdfViewerScreen(
    uri: String? = null,
    onBack: () -> Unit = {},
    viewerViewModel: PdfViewerViewModel = hiltViewModel()
) {

    if(uri.isNullOrEmpty()) {
        onBack()
        return
    }

    Column{
        Text(uri)
    }
}