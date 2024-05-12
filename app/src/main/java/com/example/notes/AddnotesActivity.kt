package com.example.notes

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

import com.example.notes.databinding.ActivityAddnotesBinding

class AddnotesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddnotesBinding
    private lateinit var db: Notedatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddnotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ensure that content is displayed edge-to-edge
        WindowCompat.setDecorFitsSystemWindows(window, false)

        db = Notedatabase(this)

        // Assuming your save button is named saveButton in your layout
        binding.saveBotton.setOnClickListener {
         val title = binding.titleEditText.text.toString()
     val content =binding.contentEditText.text.toString()
      val note = Note(0,title,content)
        db.insertNote(note)
       finish()
            Toast.makeText(this,"Note Saved",Toast.LENGTH_SHORT).show()
}
}
}








