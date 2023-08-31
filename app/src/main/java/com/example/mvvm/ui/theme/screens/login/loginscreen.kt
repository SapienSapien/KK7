package com.example.mvvm.ui.theme.screens.login

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.mvvm.Greeting
import com.example.mvvm.navigation.ROUT_HOME
import com.example.mvvm.navigation.ROUT_LOGIN
import com.example.mvvm.navigation.ROUT_REGISTRATION
import com.example.mvvm.ui.theme.MVVMTheme


@ExperimentalMaterial3Api
@Composable
fun loginscreen(navController: NavHostController) {
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login here",
            color = Color.DarkGray,
            fontSize = 45.sp,
            fontFamily = FontFamily.Cursive
        )
        OutlinedTextField(value = name, onValueChange = { name = it })
        OutlinedTextField(value = email, onValueChange = { email = it })
        OutlinedTextField(value = pass, onValueChange = { pass = it })

        Button(
            onClick = {
                      navController.navigate(ROUT_LOGIN)

                      },
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = CircleShape

        ) {
            Text(text = "Login")


        }
        Button(
            onClick = {
                      navController.navigate(ROUT_REGISTRATION)

                      },
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = CircleShape

        ) {
            Text(text = "No Account? Register here")


        }
        Button(
            onClick = {
                navController.navigate(ROUT_HOME)

            },
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = CircleShape

        ) {
            Text(text = "Have an Account, Login Here")


        }


    }
}

