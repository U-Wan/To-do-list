package com.example.to_do.data.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.to_do.data.ToDoDatabase
import com.example.to_do.data.model.ToDoData
import com.example.to_do.data.repository.ToDoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ToDoViewModel(application: Application):AndroidViewModel(application) {
    private val toDoDAO= ToDoDatabase.getDatabase(application).todoDao()
    private val repository:ToDoRepository
    private val getAllData:LiveData<List<ToDoData>>

    init {
        repository= ToDoRepository(toDoDAO)
        getAllData=repository.getAllData
    }

    fun insert(toDoData: ToDoData){
        viewModelScope.launch( Dispatchers.IO){
            repository.insertData(toDoData)
        }

    }


}
