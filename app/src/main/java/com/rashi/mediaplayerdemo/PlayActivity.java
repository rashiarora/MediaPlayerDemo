package com.rashi.mediaplayerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity  implements View.OnClickListener{
    TextView txtSongName;
    Button btnPlay, btnStop;
    String songName;

    void initViews(){
        txtSongName = (TextView)findViewById(R.id.textView);
        btnPlay = (Button)findViewById(R.id.buttonPlay);
        btnStop = (Button)findViewById(R.id.buttonStop);

        Intent rcv = getIntent();
        songName = rcv.getStringExtra("keySong");
        txtSongName.setText(songName);

        btnPlay.setOnClickListener(this);
        btnStop.setOnClickListener(this);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        initViews();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.buttonPlay){
        Intent intent = new Intent(PlayActivity.this,MyMusicService.class);
            intent.putExtra("keySong",songName);
            startService(intent);
        }else{
            Intent intent = new Intent(PlayActivity.this,MyMusicService.class);
            stopService(intent);
        }
    }
}
