package com.example.madpractical6_20012011137

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediacontroller = MediaController(this)
        val uri:Uri = Uri.parse("android.resource://"+ packageName + "/" + R.raw.thestoryoflight )
        val myvideoview = findViewById<VideoView>(R.id.video1)
        myvideoview.setMediaController(mediacontroller)
        mediacontroller.setAnchorView(myvideoview)
        myvideoview.setVideoURI(uri)
        myvideoview.requestFocus()
        myvideoview.start()

        val button = findViewById<FloatingActionButton>(R.id.float_b1)
        button.setOnClickListener{
            Intent(this,YoutubeActivity::class.java).apply {
                startActivity(this)
            }
        }

    }

}