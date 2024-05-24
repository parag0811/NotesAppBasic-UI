package parag.ui.notesappui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import parag.ui.notesappui.ui.theme.poppinsFontFamily

@Preview
@Composable
fun AppName() {
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(start = 20.dp, top = 60.dp)
    ){
    Text(
        text = "What's New",
        fontSize = 50.sp,
        fontFamily = poppinsFontFamily,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.onBackground
        )
    }
}