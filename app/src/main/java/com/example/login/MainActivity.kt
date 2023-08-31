package com.example.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.login.ui.theme.LoginTheme
import android.content.Intent
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.activities.ProfileScreen


@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    private var loggedIn by mutableStateOf(false)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
//                if (loggedIn) {
//                    val intent = Intent(this@MainActivity, LoggedInActivity::class.java)
//                    intent.putExtra("username", username)
//                    startActivity(intent)
//                    finish()
//                } else {
//                    LoginScreen { enteredUsername, password ->
//                        if (enteredUsername == "admin" && password == "admin") {
//                            loggedIn = true
//                        } else {
//                            // Tindakan jika login gagal
//                        }
//                    }
//                }
                var username by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center
                ) {

                    Text(
                        text = "Login Screen",
                        fontSize = 40.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    OutlinedTextField(
                        value = username,
                        onValueChange = { username = it },
                        label = { Text("Username") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        visualTransformation = PasswordVisualTransformation(),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            val intent = Intent(this@MainActivity, LoggedInActivity::class.java)
                            intent.putExtra("username", username)
                            intent.putExtra("password", password)
                            startActivity(intent)
                            finish()
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Login")
                    }
            }
        }
    }
}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun LoginScreen(onLoginClick: (username: String, password: String) -> Unit) {
//    var username by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center
//    ) {
//
//        Text(
//            text = "Login Screen",
//            fontSize = 40.sp,
//            fontFamily = FontFamily.Monospace,
//            fontWeight = FontWeight.Bold
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        OutlinedTextField(
//            value = username,
//            onValueChange = { username = it },
//            label = { Text("Username") },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp)
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        OutlinedTextField(
//            value = password,
//            onValueChange = { password = it },
//            label = { Text("Password") },
//            visualTransformation = PasswordVisualTransformation(),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp)
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Button(
//            onClick = {
//                onLoginClick(username, password)
//            },
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text("Login")
//        }
//
//    }
}




