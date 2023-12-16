package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
private fun Quadrant(
    @StringRes title: Int,
    @StringRes textContent: Int,
    modifier: Modifier = Modifier
) {

    Column(
        modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = stringResource(id = title),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = stringResource(id = textContent))
    }

}

@Preview(showSystemUi = true)
@Composable
private fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Quadrant(
                title = R.string.text_comp,
                textContent = R.string.text_comp_content,
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                title = R.string.img_comp,
                textContent = R.string.img_comp_content,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Quadrant(
                title = R.string.row_comp,
                textContent = R.string.row_comp_content,
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                title = R.string.col_comp,
                textContent = R.string.col_comp_content,
                modifier = Modifier.weight(1f)
            )
        }
    }
}