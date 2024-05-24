package parag.ui.notesappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import parag.ui.notesappui.ui.theme.poppinsFontFamily

@Preview
@Composable
fun HeadingName() {
    Row (
        modifier = Modifier.padding(top = 14.dp)
    ){
        Box(
            modifier = Modifier
                .padding(start = 20.dp)
                .width(90.dp)
                .height(35.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(MaterialTheme.colorScheme.onBackground)
        ){
            Text(
                text = "All (20)",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.align(Alignment.Center),
                color = MaterialTheme.colorScheme.onSecondary
                )
        }
        Box(
            modifier = Modifier
                .padding(start = 20.dp)
                .width(110.dp)
                .height(35.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(MaterialTheme.colorScheme.onBackground)
        ){
            Text(
                text = "Important",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.align(Alignment.Center),
                color = MaterialTheme.colorScheme.onSecondary
            )
        }
        Box(
            modifier = Modifier
                .padding(start = 20.dp)
                .width(140.dp)
                .height(35.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(MaterialTheme.colorScheme.onBackground)
        ){
            Text(
                text = "Bookmarked",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.align(Alignment.Center),
                color = MaterialTheme.colorScheme.onSecondary
            )
        }
    }
}