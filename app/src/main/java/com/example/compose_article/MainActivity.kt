package com.example.compose_article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_article.ui.theme.Compose_ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_ArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /*MainPage(title = stringResource(R.string.titlte),
                        message1 = stringResource(R.string.message1),
                        message2 = stringResource(R.string.message2)
                    )*/
                    Quadrant()
                }
            }
        }
    }
}

/*
@Composable
fun MainPage(title: String, message1: String, message2: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Column() {
        Image(painter = image,
            contentDescription = null
        )
        Text(text = title, fontSize = 24.sp,modifier = Modifier.padding(16.dp))
        Text(text = message1, textAlign = TextAlign.Justify, modifier = Modifier.padding(start = 16.dp, end = 16.dp))
        Text(text = message2, textAlign = TextAlign.Justify,modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview(){
    Compose_ArticleTheme {
        MainPage(title = stringResource(R.string.titlte),
            message1 = stringResource(R.string.message1),
            message2 = stringResource(R.string.message2)
        )
    }
}*/
/*
@Composable
fun TaskButton(){
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = image, contentDescription = null)
        Text(text = "All Tasks completed", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 24.dp, bottom = 8.dp))
        Text(text = "Nice Work",fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun TaskButtonPreview(){
    Compose_ArticleTheme {
        TaskButton()
    }
}*/

@Composable
fun Quadrant(){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)){
            ComposableInfoCard(
                title = stringResource(R.string.first_title),
                description = stringResource(R.string.first_description),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.second_title),
                description = stringResource(R.string.second_description),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.third_title),
                description = stringResource(R.string.third_description),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.fourth_title),
                description = stringResource(R.string.fourth_description),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}
@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TaskButtonPreview(){
    Compose_ArticleTheme {
    Quadrant()
    }
}


