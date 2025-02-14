package com.example.noteapp.data

import com.example.noteapp.model.Note

class NotesData {

    fun loadNotes(): List<Note>{
        return listOf(
            Note(title = "Good Day", description = "he hiring team may want to learn more about you. Your experiences, skills and summary."),
            Note(title = "Jetpack Compose", description = "he hiring team may want to learn more about you. Your experiences, skills and summary."),
            Note(title = "Vacation", description = "he hiring team may want to learn more about you. Your experiences, skills and summary."),
            Note(title = "HomeWork", description = "he hiring team may want to learn more about you. Your experiences, skills and summary."),
            Note(title = "Good Day", description = "he hiring team may want to learn more about you. Your experiences, skills and summary."),
            Note(title = "Good Day", description = "he hiring team may want to learn more about you. Your experiences, skills and summary."),
        )
    }
}