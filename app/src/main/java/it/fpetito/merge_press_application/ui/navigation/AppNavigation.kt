package it.fpetito.merge_press_application.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import it.fpetito.merge_press_application.ui.screens.home.HomeScreen
import it.fpetito.merge_press_application.ui.screens.pdfViewer.PdfViewerScreen

@Composable fun AppNavigation(navController : NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(Screen.Home.route) {
            HomeScreen(
                onOpenPdf = { uri ->
                    navController.navigate("viewer/$uri")
                }
            )
        }

        composable(Screen.Viewer.route) { backStackEntry ->
            val uri = backStackEntry.arguments?.getString("uri")
            PdfViewerScreen(
                uri = uri,
                onBack = { navController.popBackStack() }
            )
        }
    }
}


sealed class Screen(val route: String){
    object Home : Screen("home")
    object Viewer : Screen("viewer/{uri}")
}