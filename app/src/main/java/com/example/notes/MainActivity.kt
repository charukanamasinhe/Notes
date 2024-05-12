package com.example.notes

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Sms.Intents
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ReturnThis
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.notes.databinding.ActivityAddnotesBinding
import com.example.notes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)


        binding.addButton.setOnClickListener{
            val intent = Intent(this,AddnotesActivity::class.java)
            startActivity(intent)


        }



    }
}