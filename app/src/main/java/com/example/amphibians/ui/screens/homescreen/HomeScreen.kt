package com.example.amphibians.ui.screens.homescreen

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.amphibians.R
import com.example.amphibians.data.Amphibian


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    listAmphibian: List<Amphibian>
) {
    //Creating centre aligned top app bar
    Scaffold(
        topBar = { CenterAlignedTopAppBar(
            title = { Text(text = "Amphibians")}
            )
        },
        modifier = Modifier.fillMaxSize()

    ) {
        AmphibianScrollableList(listAmphibian = listAmphibian, modifier = Modifier
            .padding(it)
            .fillMaxSize())
    }
}



@Composable
fun AmphibianPreviewCard(
    amphibian: Amphibian,
    modifier: Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(R.dimen.card_elevation.dp),
        shape = CardDefaults.shape
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
        ) {
            AsyncImage(
                model = ImageRequest
                    .Builder(LocalContext.current)
                    .data(amphibian.imgSrc)
                    .crossfade(true)
                    .build(),
                contentDescription = amphibian.name,
                contentScale = ContentScale.Crop

            )
            Text(text = amphibian.name)
        }
    }

}

@Composable
fun AmphibianScrollableList(
    listAmphibian: List<Amphibian>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        items(listAmphibian){
            AmphibianPreviewCard(
                amphibian = it,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(listAmphibian =    listOf( Amphibian("Aman", "Reptile", "Gaida Sala", "https://images.rawpixel.com/image_png_400/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA5L3Jhd3BpeGVsb2ZmaWNlM19pbGx1c3RyYXRpb25fb2ZfYW5fZWxlcGhhbnRfX2lzb2xhdGVkX29uX3doaXRlX18xZjllNDY2Ni02OThiLTQzNjAtOGQwZS00NjU3N2IzMDIwOThfMS5wbmc.png"),
        Amphibian("Aman", "Reptile", "Gaida Sala", "https://images.rawpixel.com/image_png_400/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA5L3Jhd3BpeGVsb2ZmaWNlM19pbGx1c3RyYXRpb25fb2ZfYW5fZWxlcGhhbnRfX2lzb2xhdGVkX29uX3doaXRlX18xZjllNDY2Ni02OThiLTQzNjAtOGQwZS00NjU3N2IzMDIwOThfMS5wbmc.png"),
        Amphibian("Aman", "Reptile", "Gaida Sala", "https://images.rawpixel.com/image_png_400/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA5L3Jhd3BpeGVsb2ZmaWNlM19pbGx1c3RyYXRpb25fb2ZfYW5fZWxlcGhhbnRfX2lzb2xhdGVkX29uX3doaXRlX18xZjllNDY2Ni02OThiLTQzNjAtOGQwZS00NjU3N2IzMDIwOThfMS5wbmc.png")))
}