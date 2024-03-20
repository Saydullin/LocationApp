package com.saydullin.locationapp.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun Header(
    title: String,
    subTitle: String,
    onSubTitleChange: (subTitle: String) -> Unit
) {

    val subTitleField = remember { mutableStateOf(subTitle) }

    Column(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 20.dp,
                bottomEnd = 20.dp
            ))
    ) {
        Text(
            text = title
        )
        TextField(
            value = subTitleField.value,
            onValueChange = {
                subTitleField.value = it
                onSubTitleChange(subTitleField.value)
            }
        )
    }

}