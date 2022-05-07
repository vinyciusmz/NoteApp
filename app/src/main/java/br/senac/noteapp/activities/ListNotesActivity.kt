package br.senac.noteapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.noteapp.databinding.ActivityListNotesBinding
import br.senac.noteapp.databinding.NoteBinding
import br.senac.noteapp.model.NoteSingleton

class ListNotesActivity : AppCompatActivity() {
    lateinit var binding: ActivityListNotesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListNotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab.setOnClickListener {
            val intent = Intent(this, NewNoteActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()

        newNotes()
    }
    fun newNotes(){
        binding.container.removeAllViews()

        NoteSingleton.noteList.forEach {
            val cardBinding = NoteBinding.inflate(layoutInflater)

            cardBinding.txtTitle.text = it.title
            cardBinding.txtDesc.text = it.desc

            binding.container.addView(cardBinding.root)

        }
    }

}