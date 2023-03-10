package com.example.compose.ui.theme

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WellnessTaskItem(
    taskName:String,
    onClose: ()->Unit,
    checked: Boolean,
    onCheckedChanged: (Boolean)->Unit,
    modifier: Modifier = Modifier
){
    Row(modifier=modifier, verticalAlignment = Alignment.CenterVertically) {
        Text(text = taskName, modifier = Modifier
            .weight(1f)
            .padding(start = 16.dp))
        Checkbox(checked = checked, onCheckedChange = onCheckedChanged)
        IconButton(onClick = onClose ) {
            Icon(Icons.Filled.Close, contentDescription = "Close")
        }
    }
}

@Composable
fun WellnessTaskItem(
    taskName: String,modifier: Modifier=Modifier, onClose: () -> Unit
){
    var checkedState by rememberSaveable{ mutableStateOf(false) }
    WellnessTaskItem(taskName = taskName, onClose = onClose,
        checked = checkedState,
        onCheckedChanged ={newValue->checkedState = newValue},
    modifier = modifier)
}