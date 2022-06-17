package com.example.myapplication.materi

import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.R
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_video_gui.*

class VideoGuiActivity : YouTubeBaseActivity() {

    val VIDEO_ID = "fYeUEXuNLbQ"

    private lateinit var youtubePlayerInit : YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_gui)

        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                p1?.loadVideo(VIDEO_ID)
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(applicationContext, "Failed", Toast.LENGTH_SHORT).show()
            }
        }

        btnPlay.setOnClickListener {
            ytGui.initialize(R.string.YOUTUBE_API.toString(),youtubePlayerInit)
        }

    }
}