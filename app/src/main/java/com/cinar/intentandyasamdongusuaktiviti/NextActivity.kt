package com.cinar.intentandyasamdongusuaktiviti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cinar.intentandyasamdongusuaktiviti.databinding.ActivityMainBinding
import com.cinar.intentandyasamdongusuaktiviti.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityNextBinding
        var name : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        MainActivity::test // Referans veriliyor MainActivity'de test fonksiyonuna

       //Veri alma
        val intentFromMain = intent // getIntent()
        name = intentFromMain.getStringExtra("user")
        val myInteger = intentFromMain.getIntExtra("number",-1)

        if (name !=null && myInteger!=-1){
            binding.nameText2.setText("${name}")
            println(myInteger)

        }



    println("onCreate executed")  // oluşturuldu sadece ilk açıldığında çalışır
    }

    fun previous(view:View){
        val intent = Intent(this@NextActivity,MainActivity::class.java)
        startActivity(intent)
        finish() //Aktiviteyi siler kapatır
    }

    override fun onStart() {
        super.onStart()
        println("onStart executed") //başladı aktivitede sürekli çalışır
    }

    override fun onResume() {
        super.onResume()
        println("onResume executed") // devam etti  aktivitede sürekli çalışır
    }

    override fun onPause() {
        super.onPause()
        println("OnResume executed") //duraklatıldı
    }

    override fun onStop() {
        super.onStop()
        println("OnStop executed")  //durduruldu
    }

    override fun onDestroy() {
        super.onDestroy()
        println("On destroy executed") //yokedildi aktivite destroy edildi
    }

}