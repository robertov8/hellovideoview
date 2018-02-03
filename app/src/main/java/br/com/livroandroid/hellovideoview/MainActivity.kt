package br.com.livroandroid.hellovideoview

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoView.setMediaController(MediaController(this))
        val url = "http://livroandroid.com.br/livro/carros/esportivos/ferrari_ff.mp4"
        videoView.setVideoURI(Uri.parse(url))
        videoView.start()
    }
}
