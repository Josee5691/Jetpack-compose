package com.example.compose

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessTaskViewModel: ViewModel() {
    private val _task = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
    get() = _task

    fun remove(item:WellnessTask){
        _task.remove(item)
    }
}

private fun getWellnessTasks() = List(30){i-> WellnessTask(i, "Task # $i") }