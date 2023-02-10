package com.example.to_do.data.repository

import androidx.lifecycle.LiveData
import com.example.to_do.data.ToDoDAO
import com.example.to_do.data.model.ToDoData

class ToDoRepository(private val todoDao: ToDoDAO) {

    val getAllData: LiveData<List<ToDoData>> =todoDao.getAllData()

    suspend fun insertData(toDoData: ToDoData){
        todoDao.insertData(toDoData)
    }
}