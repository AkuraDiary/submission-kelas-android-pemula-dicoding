package com.example.submissionkelasandroidpemula

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class SplashScreenActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceStates:Bundle?){
        super.onCreate(savedInstanceStates)
        setContentView(R.layout.splash_screen)

        val background = object : Thread(){
            override fun run(){
                try{
                    Thread.sleep(3500)

                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                }catch(e:Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}