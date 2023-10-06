package com.base.trulyiasassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private VideoView idVideo;
    private Button btnHandout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idVideo = findViewById(R.id.idVideo);
        MediaController mediaController = new MediaController(this);
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