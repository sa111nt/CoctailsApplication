package com.example.coctails

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashImage: ImageView = findViewById(R.id.splashImage)

        val fadeIn = ObjectAnimator.ofFloat(splashImage, "alpha", 0f, 1f)
        fadeIn.duration = 3000

        val scaleUpX = ObjectAnimator.ofFloat(splashImage, "scaleX", 0.3f, 0.8f)
        val scaleUpY = ObjectAnimator.ofFloat(splashImage, "scaleY", 0.3f, 0.8f)
        scaleUpX.duration = 2500
        scaleUpY.duration = 2500

        fadeIn.start()
        scaleUpX.start()
        scaleUpY.start()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
