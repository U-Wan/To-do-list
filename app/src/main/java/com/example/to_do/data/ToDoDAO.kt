package com.example.to_do.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.to_do.data.model.ToDoData

@Dao
interface ToDoDAO {

    @Query("SELECT * From tasks_table order by id ASC")
    fun getAllData(): LiveData<List<ToDoData>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertData(tododata: ToDoData)



}