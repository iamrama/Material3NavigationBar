package com.rk.material3_navigationbar
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Black
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rk.material3_navigationbar.ui.theme.Material3NavigationBarTheme

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Material3NavigationBarTheme {
                materialComposeNavigation()
            }
        }
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun materialComposeNavigation(){
    val navController = rememberNavController()
    // A surface container using the 'background' color from the theme
    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { Column() {
                    Text("Location", fontSize = 18.sp)

                } },
// Chennai               navigationIcon = {
//                    IconButton(onClick = { /* doSomething() */ }) {
//                        Icon(
//                            imageVector = Icons.Filled.Menu,
//                            contentDescription = "Localized description"
//                        )
//                    }
//                },


            )
        },
        bottomBar = {
            navBaar(navController)
        }
    ) {

        NavigationGraph(navController = navController)
    }
}

@Composable
fun navBaar(navController: NavController){
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf(
        bottomBarNavItem.home,
        bottomBarNavItem.notes,
        bottomBarNavItem.chat,
        bottomBarNavItem.profile
    )

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = null) },
                label = { Text(item.title) },
                selected = selectedItem == index,
                onClick = {   navController.navigate(item.routes) {
                    selectedItem = index
                    navController.graph.startDestinationRoute?.let { screen_route ->
                        popUpTo(screen_route) {
                            saveState = true
                        }
                    }
                    launchSingleTop = true
                    restoreState = true
                } }
            )
        }
    }
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = bottomBarNavItem.home.routes) {
        composable(bottomBarNavItem.home.routes) {
            homeScreen()
        }
        composable(bottomBarNavItem.notes.routes) {
            noteScreen()
        }
        composable(bottomBarNavItem.chat.routes) {
            chatScreen()
        }
        composable(bottomBarNavItem.profile.routes) {
            profileScreen()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Material3NavigationBarTheme {
        materialComposeNavigation()
    }
}


sealed class bottomBarNavItem(var title: String, var icon: Int, var routes: String) {
    object home : bottomBarNavItem("Home", R.drawable.ic_baseline_home_24, "home")
    object notes : bottomBarNavItem("Notes", R.drawable.ic_baseline_notes_24, "notes")
    object chat : bottomBarNavItem("Chat", R.drawable.ic_baseline_chat_24, "chat")
    object profile :
        bottomBarNavItem("Profile", R.drawable.ic_baseline_person_outline_24, "profile")
}
