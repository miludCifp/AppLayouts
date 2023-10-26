package com.cifpceuta.applayout;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class ActivityFrame extends AppCompatActivity {
    private VideoView velas;
    private ImageButton btnPlay, btnPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame2);

        velas = (VideoView) findViewById(R.id.videoView);

        velas.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.velas));

        btnPlay = (ImageButton) findViewById(R.id.imageButton);

        btnPause = (ImageButton) findViewById(R.id.imageButtonPause);

    }
    public void btnPlay(View v){
        //Si el video esta en marcha le damos el estado de Pause.
        // en caso contrario ponemos en start.

        if (velas.isPlaying()){
            velas.resume();
        }else {
            velas.start();
        }
        btnPlay.setVisibility(View.INVISIBLE);

        btnPause.setVisibility(View.VISIBLE);

    }
    public void btnPause(View v){
        //Si el video esta en marcha le damos el estado de Pause.
        // en caso contrario ponemos en start.

        velas.pause();
        btnPlay.setVisibility(View.VISIBLE);

        btnPause.setVisibility(View.INVISIBLE);

    }
}