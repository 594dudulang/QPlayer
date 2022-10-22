package com.leo.qplayer

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.leo.qplayer.databinding.ActivityMainBinding
import com.nuonuo.qplayer.QPlayer


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val player = QPlayer()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        player.setSurface(binding.surface)
        //player.setPath("rtmp://media3.scctv.net/live/scctv_800")
        player.setPath("rtmp://void.75755.com/liverepeater/500106?wsSecret=fbc187bda06c3af2f6bda001d339277d&wsTime=634fbba9")
        lifecycle.addObserver(player)
        binding.start.setOnClickListener {
            player.start()
        }


    }


}