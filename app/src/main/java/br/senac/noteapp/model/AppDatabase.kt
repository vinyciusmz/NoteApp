package br.senac.noteapp.model

import androidx.room.Database
import androidx.room.RoomDatabase

class AppDatabase {

    @Database(entities = [Note::class],version = 1)
    abstract class AppDatabase : RoomDatabase(){
        abstract fun noteDao(): NoteDao
    }
}