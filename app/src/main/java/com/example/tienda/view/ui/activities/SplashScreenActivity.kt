package com.example.tienda.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tienda.R
import com.example.tienda.databinding.ActivitySplashScreenActivityBinding
import android.view.animation.AnimationUtils
import android.view.animation.Animation

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val animation=AnimationUtils.loadAnimation(this,R.anim.animation)
        binding.ivSplashScreen.startAnimation(animation)
        val intent = Intent(this,MainActivity::class.java)

        animation.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {
            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(intent)
                finish()
            }

            override fun onAnimationRepeat(animation: Animation?) {
            }
        })

    }
}