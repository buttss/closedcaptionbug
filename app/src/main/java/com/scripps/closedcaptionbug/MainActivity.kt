package com.scripps.closedcaptionbug

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    lateinit var videoView : VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        videoView = findViewById(R.id.video_view)
        val videoPath = "https://content.uplynk.com/fdbb317afa4c46e183809b6206923154.m3u8"
        videoView.setOnPreparedListener {

        }
        videoView.setVideoURI(Uri.parse(videoPath))
    }

    override fun onStart() {
        super.onStart()
        videoView.start()
    }

    override fun onResume() {
        super.onResume()
        videoView.resume()
    }

    override fun onStop() {
        super.onStop()
        videoView.stopPlayback()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
