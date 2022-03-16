package com.example.tastyappclone

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_video.*

class MovieVideo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_video)

        var intent = intent
        var video = intent.getStringExtra("movieVideo").toString()
        var uri = Uri.parse(video)
        videoView.setVideoURI(uri)
    }
}