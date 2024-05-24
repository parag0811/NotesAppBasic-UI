package parag.ui.notesappui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import parag.ui.notesappui.ui.theme.customColor1
import parag.ui.notesappui.ui.theme.customColor2
import parag.ui.notesappui.ui.theme.poppinsFontFamily

@Preview
@Composable
fun NotesDetails() {
    Row (
        modifier = Modifier
            .padding(top = 14.dp, start = 20.dp)
    ){
        Box(
            modifier = Modifier
                .height(200.dp)
                .width(170.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(customColor1)
                .clickable { }
        ){
            Column {
                Text(
                    text = "Buy Honey 100% Original",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 16.dp, start = 12.dp, end = 10.dp)
                )
                Text(
                    text = "Buy the new brand honey for my family from the grocery store.",
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 4.dp, start = 16.dp, end = 10.dp)
                )
            }
        }
        Spacer(modifier = Modifier.padding(9.dp))
        Box(
            modifier = Modifier
                .height(200.dp)
                .width(170.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(customColor2)
                .clickable { }

        ){
            Column {
                Text(
                    text = "Buy Honey 100% Original",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 16.dp, start = 12.dp, end = 10.dp)
                )
                Text(
                    text = "Buy the new brand honey for my family from the grocery store.",
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 4.dp, start = 16.dp, end = 10.dp)
                )
            }
        }
    }
}