package it.fpetito.merge_press_application

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import it.fpetito.merge_press_application.ui.navigation.AppNavigation

@Composable @Preview(showBackground = true, showSystemUi = true) fun App() {

    val navController = rememberNavController()

    AppNavigation(navController)
}