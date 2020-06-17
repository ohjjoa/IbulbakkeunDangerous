package com.archive.ibulbakkeundangerous.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.archive.ibulbakkeundangerous.databinding.ActivityMovieRecommendBinding

class MovieRecommendActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMovieRecommendBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieRecommendBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
