package com.example.Firebasestorage.ui.theme.screens.clothing

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Firebasestorage.R
import com.example.Firebasestorage.ui.theme.fly23


@Composable
fun clothingscreen(navController: NavHostController){
Column(modifier = Modifier.fillMaxSize()) {
    TopAppBar(
        title = { Text(text = "clothes") },
        backgroundColor = fly23
    )


    var mContext = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        contentAlignment = Alignment.Center


    ) {
        Image(
            painter = painterResource(id = com.example.Firebasestorage.R.drawable.thrifts),
            contentDescription = "indonesia",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column {


            Text(
                text = "clothes",
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )

            Text(
                text = "winter collection",
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )

        }


    }



    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(start = 10.dp, end = 10.dp)

    ) {

        Row {
            Column {

Box (modifier = Modifier
    .height(150.dp)
    .width(150.dp)
) {


    Image(
        painter = painterResource(id = R.drawable.mini),
        contentDescription = "",
        modifier = Modifier
            .size(100.dp)
            .clickable {  Toast.makeText(mContext, "show image", Toast.LENGTH_SHORT).show()



            }
    )
}
            }

            Text(
                text = "SKIRT"
            )


            Text(text = "sh2500")







            Column {


                Image(
                    painter = painterResource(id = R.drawable.baggy),
                    contentDescription = "",
                    modifier = Modifier.size(100.dp)
                )

            }

            Text(
                text = "TROWSER"
            )
            Text(text = "sh.1320")

        }
        Column{


            Row {
                Column {
Box (modifier = Modifier
    .height(150.dp)
    .width(150.dp)
){


    Image(
        painter = painterResource(id = R.drawable.bbelt),
        contentDescription = "",
        modifier = Modifier.size(100.dp)
    )
}
                }

                Text(
                    text = "BELT"
                )
                Text(text = "sh.1500")

                Column {


                    Image(
                        painter = painterResource(id = R.drawable.bbelt),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )

                }

                Text(
                    text = "BELT"
                )
                Text(text = "sh.1500")

            }


        }
    }
    //end of row 1
}
}



@Preview(showBackground = true)
@Composable
fun clotingscreenpreview(){

    clothingscreen(rememberNavController())

}