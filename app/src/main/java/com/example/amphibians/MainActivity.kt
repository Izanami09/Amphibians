package com.example.amphibians

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.amphibians.data.Amphibian
import com.example.amphibians.ui.screens.homescreen.HomeScreen
import com.example.amphibians.ui.theme.AmphibiansTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AmphibiansTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(listAmphibian = listOf(
                        Amphibian("Aman", "Reptile", "Gaida Sala", "https://images.rawpixel.com/image_png_400/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA5L3Jhd3BpeGVsb2ZmaWNlM19pbGx1c3RyYXRpb25fb2ZfYW5fZWxlcGhhbnRfX2lzb2xhdGVkX29uX3doaXRlX18xZjllNDY2Ni02OThiLTQzNjAtOGQwZS00NjU3N2IzMDIwOThfMS5wbmc.png"),
                        Amphibian("Aman", "Reptile", "Gaida Sala", "https://images.rawpixel.com/image_png_400/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA5L3Jhd3BpeGVsb2ZmaWNlM19pbGx1c3RyYXRpb25fb2ZfYW5fZWxlcGhhbnRfX2lzb2xhdGVkX29uX3doaXRlX18xZjllNDY2Ni02OThiLTQzNjAtOGQwZS00NjU3N2IzMDIwOThfMS5wbmc.png"),
                        Amphibian("Aman", "Reptile", "Gaida Sala", "https://images.rawpixel.com/image_png_400/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA5L3Jhd3BpeGVsb2ZmaWNlM19pbGx1c3RyYXRpb25fb2ZfYW5fZWxlcGhhbnRfX2lzb2xhdGVkX29uX3doaXRlX18xZjllNDY2Ni02OThiLTQzNjAtOGQwZS00NjU3N2IzMDIwOThfMS5wbmc.png"),
                        Amphibian("Aman", "Reptile", "Gaida Sala", "https://images.rawpixel.com/image_png_400/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA5L3Jhd3BpeGVsb2ZmaWNlM19pbGx1c3RyYXRpb25fb2ZfYW5fZWxlcGhhbnRfX2lzb2xhdGVkX29uX3doaXRlX18xZjllNDY2Ni02OThiLTQzNjAtOGQwZS00NjU3N2IzMDIwOThfMS5wbmc.png"),
                        Amphibian("Aman", "Reptile", "Gaida Sala", "https://images.rawpixel.com/image_png_400/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA5L3Jhd3BpeGVsb2ZmaWNlM19pbGx1c3RyYXRpb25fb2ZfYW5fZWxlcGhhbnRfX2lzb2xhdGVkX29uX3doaXRlX18xZjllNDY2Ni02OThiLTQzNjAtOGQwZS00NjU3N2IzMDIwOThfMS5wbmc.png"),
                        Amphibian("Aman", "Reptile", "Gaida Sala", "https://images.rawpixel.com/image_png_400/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA5L3Jhd3BpeGVsb2ZmaWNlM19pbGx1c3RyYXRpb25fb2ZfYW5fZWxlcGhhbnRfX2lzb2xhdGVkX29uX3doaXRlX18xZjllNDY2Ni02OThiLTQzNjAtOGQwZS00NjU3N2IzMDIwOThfMS5wbmc.png")
                    )
                    )
                }
            }
        }
    }
}

