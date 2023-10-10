package com.base.trulyiasassignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


public class VideoPlayerActivity extends AppCompatActivity implements NestedAdapter.OnNoteListener {

    private VideoView idVideo;
    private Button btnHandout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(getString(R.string.actionbarColor)));
        actionBar.setBackgroundDrawable(colorDrawable);


            idVideo = findViewById(R.id.idVideo);
        MediaController  mediaController = new MediaController(this);


        mediaController.setAnchorView(idVideo);

            idVideo.setMediaController(mediaController);


        int position = getIntent().getIntExtra("video_position", 0);
        int videoResource;

        switch (position) {
            case 0:
                videoResource = R.raw.demovid;
                break;
            case 1:
                videoResource = R.raw.vidone;
                break;
            case 2:
                videoResource = R.raw.vidtwo;
                break;
            default:
                // Handle the case where an invalid position is returned by helper()
                videoResource = 0; // Set a default value or handle the error
                break;
        }

        if (videoResource != -1) {

            idVideo.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + videoResource));
            idVideo.start();
        } else {

            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
        }

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






    @Override
    public void onNoteClick(int position) {

    }
}