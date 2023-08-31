package com.example.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.login.ui.theme.LoginTheme

class LoggedInActivity : ComponentActivity() {
    // Menyimpan username yang diterima dari MainActivity
    private var username: String = ""
    private var password: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Mendapatkan username dari intent
        username = intent.getStringExtra("username") ?: ""
        password = intent.getStringExtra("password") ?: ""

        setContent {
            LoginTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(username,password)
                }
            }
        }
    }
}

@Composable
fun Greeting(username: String, password: String) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Welcome, $username!")
        Text(text = "Your Password is $password!")
    }
}
