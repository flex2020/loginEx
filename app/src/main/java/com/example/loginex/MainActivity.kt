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
    private val admin_ID: String = "admin"
    private val admin_PWD: String = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 뷰 바인딩 작업
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButton.setOnClickListener {
            Toast.makeText(this@MainActivity,"회원가입 화면으로 이동합니다.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
        binding.loginButton.setOnClickListener {
            if(binding.editTextId.text.toString().equals(admin_ID) && binding.editTextPw.text.toString().equals(admin_PWD)) {
                Toast.makeText(this@MainActivity, "관리자님, 어서오세요!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, afterLogin::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this@MainActivity, "아이디 또는 비밀번호가 틀렸습니다.", Toast.LENGTH_SHORT).show()
            }
        }

    }


}