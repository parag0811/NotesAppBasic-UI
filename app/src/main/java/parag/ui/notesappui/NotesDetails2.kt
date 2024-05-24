package parag.ui.notesappui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import parag.ui.notesappui.ui.theme.customColor3
import parag.ui.notesappui.ui.theme.customColor4
import parag.ui.notesappui.ui.theme.poppinsFontFamily

@Preview
@Composable
fun NotesDetails2() {
    Column (
        modifier = Modifier.padding(top = 8.dp, start = 20.dp, end = 16.dp),
    ) {
        Box(modifier = Modifier
            .padding(bottom = 8.dp)
            .height(160.dp)
            .width(400.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(customColor3)
            .clickable {  }
        ){
            Column (
                modifier = Modifier.padding(top = 14.dp, start = 18.dp, end = 10.dp)
            ) {
                Text(
                    text = "Tax payment before the end of the june",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "This is a reminder to pay my taxes before the end of June to avoid penalties. I'll complete the payment on time.",
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Medium,
                )
            }
        }
        Box(modifier = Modifier
            .padding(bottom = 8.dp)
            .height(160.dp)
            .width(400.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(customColor4)
            .clickable {  }
        ){
            Column (
                modifier = Modifier.padding(top = 14.dp, start = 18.dp, end = 10.dp)
            ) {
                Text(
                    text = "Tax payment before the end of the june",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "This is a reminder to pay my taxes before the end of June to avoid penalties. I'll complete the payment on time.",
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Medium,
                )
            }
        }
    }
}