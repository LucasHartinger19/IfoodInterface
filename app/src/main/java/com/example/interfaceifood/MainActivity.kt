package com.example.interfaceifood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.interfaceifood.navegacao.AppNavigation
import com.example.interfaceifood.ui.theme.InterfaceIfoodTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InterfaceIfoodTheme {
                AppNavigation()
            }
        }
    }
}
