package com.asmaa.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.asmaa.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            val password = binding.text3.text.toString()
            val confirmPassword = binding.text4.text.toString()
            if (password == confirmPassword && password.isNotEmpty()&&confirmPassword.isNotEmpty()) {
                Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Registration failed", Toast.LENGTH_SHORT).show()
            }
        }
        binding.image2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(intent)
        }
        binding.image3.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"))
            startActivity(intent)
        }
        binding.image4.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com"))
            startActivity(intent)
        }

    }
}