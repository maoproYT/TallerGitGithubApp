package me.mauricio.tallergitgithubapp

import androidx.compose.foundation.layout.Column
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PantallaClase() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Image(
            painter = painterResource(id = R.drawable.perfil),
            contentDescription = "Mauricio Herrera",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )


        Text(
            text = "Mauricio Herrera",
            fontSize = 18.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 10.dp)
        )


        Text(
            text = "Desarrollador Móvil Jr",
            color = Color.Blue,
            fontSize = 10.sp
        )

        Spacer(modifier = Modifier.height(20.dp))


        HorizontalDivider(
            thickness = 1.dp,
            color = Color(0xFFD3D3D3)
        )

        Spacer(modifier = Modifier.height(10.dp))


        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {

            Text(
                text = "EDAD",
                fontSize = 9.sp,
                color = Color(0xFF90A4AE),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "20 años",
                fontSize = 11.sp,
                color = Color(0xFF607D8B)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))


        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {

            Text(
                text = "CORREO",
                fontSize = 9.sp,
                color = Color(0xFF90A4AE),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "[email protected]",
                fontSize = 11.sp,
                color = Color.Blue,
                textDecoration = TextDecoration.Underline
            )
        }

        Spacer(modifier = Modifier.height(10.dp))


        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {

            Text(
                text = "CIUDAD",
                fontSize = 9.sp,
                color = Color(0xFF607D8B),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Bucaramanga, Colombia",
                fontSize = 11.sp,
                color = Color(0xFF607D8B)
            )
        }

        Spacer(modifier = Modifier.height(15.dp))
    }
}