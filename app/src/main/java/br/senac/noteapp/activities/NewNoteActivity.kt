package br.senac.noteapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.noteapp.databinding.ActivityNewNoteBinding

class NewNoteActivity : AppCompatActivity() {
    lateinit var binding: ActivityNewNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}