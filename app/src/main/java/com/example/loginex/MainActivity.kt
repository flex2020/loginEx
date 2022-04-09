package com.example.loginex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.loginex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // 뷰 바인딩 객체 선언
    private lateinit var binding: ActivityMainBinding
    private var id: String? = null
    private var pwd: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 뷰 바인딩 작업
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButton.setOnClickListener {
            Toast.makeText(this@MainActivity,"회원가입으로 이동합니다.", Toast.LENGTH_SHORT).show()
            goReg()
        }

    }

    fun goReg() {
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }


}