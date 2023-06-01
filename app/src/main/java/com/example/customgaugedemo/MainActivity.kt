package com.example.customgaugedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.customgaugedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gaugeView.setShowRangeValues(true);
        binding.gaugeView.setTargetValue(100F);
        binding.gaugeView.setProgressColor(ContextCompat.getColor(this, R.color.lemon_green))
        binding.gaugeView.setNeedleColor(ContextCompat.getColor(this, R.color.lemon_green))
    }
}