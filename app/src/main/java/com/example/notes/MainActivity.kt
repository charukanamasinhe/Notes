package com.example.notes

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Sms.Intents
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ReturnThis
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.notes.databinding.ActivityAddnotesBinding
import com.example.notes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val start: Button =findViewById(R.id.startedbtn)

        start.setOnClickListener{
            val intent = Intent(this,AddnotesActivity::class.java)
            startActivity(intent)


        }



    }
}