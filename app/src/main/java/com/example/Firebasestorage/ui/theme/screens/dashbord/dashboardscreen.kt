package com.example.Firebasestorage.ui.theme.screens.dashbord

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Firebasestorage.DetailsActivity
import com.example.Firebasestorage.navigation.ROUT_CLOTHING
import com.example.Firebasestorage.ui.theme.fly23

@Composable
fun dashboardscreen(navController: NavHostController) {
Column (modifier = Modifier.fillMaxSize()) {
    TopAppBar(
        title = { Text(text = "Amazon shop") },
        backgroundColor = fly23
    )
    Spacer(modifier = Modifier.height(19.dp))
//ROW
    var mContext = LocalContext.current


    Row {
        Column {
            Text(text = "Amazon")
            Text(text = "shop fron A to Z")
        }
        Image(
            painter = painterResource(id = com.example.Firebasestorage.R.drawable.electic),
            contentDescription = "",
            modifier = Modifier
                .size(100.dp)
                .clickable {
                    mContext.startActivity(Intent(mContext, DetailsActivity::class.java))
                }
        )


    }
//END OF ROW
    Spacer(modifier = Modifier.height(19.dp))
    Column{
        //row 1
Row {


    Column {


        Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
            Column {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Image(
                        painter = painterResource(id = com.example.Firebasestorage.R.drawable.clothing),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )

                }

                Text(
                    text = "clothing",
                    modifier = Modifier.size(100.dp)
                )


            }
        }

        //end of row 1


        Row {
            Card(modifier = Modifier
                .size(width = 150.dp, height = 100.dp)
                .clickable {
                    navController.navigate(ROUT_CLOTHING)
                }

            ) {
                Column {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {

                        Image(
                            painter = painterResource(id = com.example.Firebasestorage.R.drawable.electic),
                            contentDescription = "",
                            modifier = Modifier.size(100.dp)
                        )

                    }

                    Text(
                        text = "clothing",
                        modifier = Modifier.size(100.dp)

                    )


                }
            }
        }

        //end of row 1


        Row {
            Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                Column {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {

                        Image(
                            painter = painterResource(id = com.example.Firebasestorage.R.drawable.electic),
                            contentDescription = "",
                            modifier = Modifier.size(100.dp)
                        )

                    }

                    Text(
                        text = "clothing",
                        modifier = Modifier.size(100.dp)

                    )


                }
            }
        }

        //end of row 1

        Row {
            Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                Column {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {

                        Image(
                            painter = painterResource(id = com.example.Firebasestorage.R.drawable.electic),
                            contentDescription = "",
                            modifier = Modifier.size(100.dp)
                        )

                    }

                    Text(
                        text = "clothing",
                        modifier = Modifier.size(100.dp)

                    )


                }
            }
        }

        //end of row 1

    }
    }

    }
}
}

@Preview(showBackground = true)
@Composable
fun dashboardscreenpreview() {
    dashboardscreen(rememberNavController())
}