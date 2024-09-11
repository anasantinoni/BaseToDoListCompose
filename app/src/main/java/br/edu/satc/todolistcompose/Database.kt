package br.edu.satc.todolistcompose

import androidx.room.Database

@Database(entities = [Task::class], version = 1)
abstract class TaskDatabase : Database() {
    abstract fun taskDao(): TaskDao
}