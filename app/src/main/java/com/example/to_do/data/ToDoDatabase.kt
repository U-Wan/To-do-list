package com.example.to_do.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.to_do.data.model.ToDoData

@Database(entities = [ToDoData::class], version = 1, exportSchema = false)
@TypeConverters(Converter::class)
abstract class ToDoDatabase:RoomDatabase() {
        abstract fun todoDao(): ToDoDAO

        companion object{
            @Volatile
            private var  INSTANCE:ToDoDatabase?=null

            fun getDatabase(context:Context):ToDoDatabase{
                val tempinstance= INSTANCE
                if(tempinstance !=null){
                    return tempinstance
                }
                synchronized(this){
                    val instance= Room.databaseBuilder(
                        context.applicationContext,
                        ToDoDatabase::class.java,
                        "todo_database"
                    ).build()
                    INSTANCE=instance
                    return instance
                }
            }

        }

}