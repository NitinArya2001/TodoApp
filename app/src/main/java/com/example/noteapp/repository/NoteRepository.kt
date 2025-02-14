package com.example.noteapp.repository

import android.util.Log
import com.example.noteapp.data.NoteDataBaseDao
import com.example.noteapp.model.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import okhttp3.Dispatcher
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDataBaseDao: NoteDataBaseDao) {

    suspend fun addNote(note: Note) = noteDataBaseDao.insert(note)

    suspend fun updateNote(note: Note) = noteDataBaseDao.update(note)

    suspend fun deleteNote(note: Note) {
        try {
            noteDataBaseDao.deleteNote(note)
        } catch (e: Exception) {
            Log.e("NoteRepository", "Error deleting note: ${e.message}")
        }
    }


    suspend fun deleteAllNote() = noteDataBaseDao.deleteAll()

    fun getAllNotes(): Flow<List<Note>> = noteDataBaseDao.getNotes().flowOn(Dispatchers.IO).conflate()


}