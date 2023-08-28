package com.cinar.intentandyasamdongusuaktiviti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cinar.intentandyasamdongusuaktiviti.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        MainActivity::test // referans veriliyor test fonksiyonuna


    }

    fun test(){

    }

    fun next(view: View){
        val intent = Intent(this@MainActivity,NextActivity::class.java)
        val user = binding.nameText2.text.toString()
        //Veri yollama
        intent.putExtra("user",user)
      //  intent.putExtra("username","Selim Çınar")
        intent.putExtra("number",1)
        startActivity(intent)
        finish() //aktiviteyi siler kapatır
    }
}

