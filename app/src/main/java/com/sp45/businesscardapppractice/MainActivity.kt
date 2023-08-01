package com.sp45.businesscardapppractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sp45.businesscardapppractice.ui.theme.BusinessCardAppPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppPracticeTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardAppPracticeTheme {
        BusinessCardApp()
        TopAppBar(
            title = { Text("Profile App") },
            Modifier.background(colorResource(id = R.color.content))
        )
    }
}

@Composable
fun BusinessCardApp() {
    Profile1(
        name = stringResource(id = R.string.name),
        title = stringResource(id = R.string.title)
    )
    Profile2(
        contact = stringResource(id = R.string.contact),
        linkedIn = stringResource(id = R.string.linkedin),
        email = stringResource(id = R.string.email)
    )
}

@Composable
private fun Profile1(
    name: String,
    title: String
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.screenshot_2023_07_01_18_07_06_95_254de13a4bc8758c9908fff1f73e3725),
            contentDescription = "Profile Image",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .clip(CircleShape)
                .size(280.dp)
        )
        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
        Text(
            text = title,
            fontStyle = FontStyle.Italic,
            fontSize = 20.sp,
            color = colorResource(id = R.color.content)
        )
    }
}

@Composable
private fun Profile2(
    contact: String,
    linkedIn: String,
    email: String
) {
    Row(
        Modifier
            .padding(bottom = 30.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .padding(end = 4.dp)
                .padding(bottom = 15.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_contact_page_24),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.icons8_linkedin_50),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.email),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(end = 4.dp)
                .padding(bottom = 15.dp)
        ) {
            Text(
                text = contact,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = linkedIn,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = email,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            )
        }

    }
}


