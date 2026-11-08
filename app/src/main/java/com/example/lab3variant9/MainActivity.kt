package com.example.lab3variant9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab3variant9.ui.theme.Lab3Variant9Theme
import androidx.compose.material3.Text as Text1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab3Variant9Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DemoScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }



}@Preview(showBackground = true)
@Composable
fun DemoScreen(modifier: Modifier = Modifier) {
    // Состояния (переменные) для хранения ввода и результата
    var inputText by remember { mutableStateOf("") }
    var resultText by remember { mutableStateOf("") }
    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Заголовок
        Text1(text = "Введите символ:", fontSize = 20.sp)

        // Поле ввода
        OutlinedTextField(
            value = inputText,
            onValueChange = { inputText = it },
            label = { Text1("Символ") },
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Кнопка OK
        Button(
            onClick = { /* Логика будет на следующем шаге */ },
            modifier = Modifier.padding(vertical = 16.dp)
        ) {
            Text1("OK")
        }

        // Вывод результата
        Text1(
            text = resultText,
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.primary
        )
    }
}


