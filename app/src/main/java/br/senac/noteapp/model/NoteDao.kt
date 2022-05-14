package br.senac.noteapp.model

import androidx.room.*


@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note)

    @Query(value = "SELECT * FROM Note")
    fun list() : List<Note>

}