package com.example.amphibians.ui.screens.homescreen

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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.amphibians.R
import com.example.amphibians.model.Amphibian
import com.example.amphibians.ui.AmphibianAppUiState
import com.example.amphibians.ui.screens.AmphibianViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    amphibianViewModel: AmphibianViewModel,
) {
    val amphibianAppUiState by amphibianViewModel.uiState.collectAsState()
    //Creating centre aligned top app bar
    Scaffold(
        topBar = { CenterAlignedTopAppBar(
            title = { Text(text = "Amphibians")}
            )
        },
        modifier = Modifier.fillMaxSize()

    ) {
        AmphibianScrollableList(listAmphibian = amphibianAppUiState.listOfAmphibiansInformation, modifier = Modifier
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
                error = painterResource(id = R.mipmap.error_icon),
                contentDescription = amphibian.name,
                contentScale = ContentScale.Crop,
                placeholder = painterResource(id = R.drawable.downloading_icon_foreground)

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
    //HomeScreen()
}