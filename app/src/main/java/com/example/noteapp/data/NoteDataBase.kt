package com.example.noteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.noteapp.di.Converters
import com.example.noteapp.model.Note


@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class NoteDataBase: RoomDatabase() {

    abstract fun noteDao(): NoteDataBaseDao
}