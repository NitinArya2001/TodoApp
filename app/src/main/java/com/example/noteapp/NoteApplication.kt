package com.example.noteapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class NoteApplication: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}