package com.example.jetpack.compose.state.ui.screen

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

class WellnessViewModel : ViewModel() {
  private val _task = getWellnessTasks().toMutableStateList()

  val tasks :List<WellnessTask>  = _task

  fun remove(item :WellnessTask) {
      _task.remove(item)
  }

  fun changeTaskChecked(item: WellnessTask, checked: Boolean) {
      tasks.find { it.id ==item.id }?.let { task->
          task.checked = checked
      }
  }
}