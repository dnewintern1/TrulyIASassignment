package com.base.trulyiasassignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

public class VideoPlayerActivity extends AppCompatActivity {

    private VideoView idVideo;
    private Button btnHandout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);


        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor(getString(R.string.actionbarColor)));
        actionBar.setBackgroundDrawable(colorDrawable);


            idVideo = findViewById(R.id.idVideo);
        MediaController  mediaController = new MediaController(this);


        mediaController.setAnchorView(idVideo);

            idVideo.setMediaController(mediaController);
            idVideo.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.studyiq));

            btnHandout = findViewById(R.id.btnHandout);


            btnHandout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getApplicationContext(), PDFView.class);
                    intent.putExtra("pdf_url", "https://upsc.gov.in/sites/default/files/CutOff_SO_Steno_LDCE_2018_Eng_08082023.pdf");
                    startActivity(intent);



                }
            });


    }


}