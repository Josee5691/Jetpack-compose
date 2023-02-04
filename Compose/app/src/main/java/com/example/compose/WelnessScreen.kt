package com.example.compose.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.compose.StatefulCounter
import com.example.compose.WellnessTask
import com.example.compose.WellnessTaskViewModel


@Composable
fun WellnessScreen(modifier: Modifier = Modifier,
wellnessViewModel:WellnessTaskViewModel = viewModel()){
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTaskList(list = wellnessViewModel.tasks, onCloseTask = {task->wellnessViewModel.remove(task)})
    }
}

