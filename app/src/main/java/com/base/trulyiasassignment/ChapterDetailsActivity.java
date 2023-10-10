package com.base.trulyiasassignment;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.base.trulyiasassignment.adapter.VideoAdapter;

import java.util.List;
import java.util.Vector;

public class ChapterDetailsActivity extends AppCompatActivity implements VideoAdapter.OnNoteListener {

    private RecyclerView recycler_experiment;

    Vector<YoutubeVideo>youtubeVideos =new Vector<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_details);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor(getString(R.string.actionbarColor)));
        actionBar.setBackgroundDrawable(colorDrawable);

        recycler_experiment = findViewById(R.id.recycler_experiment);
        recycler_experiment.setHasFixedSize(true);
        recycler_experiment.setLayoutManager(new LinearLayoutManager(this));

        youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gHbLqYMpW94\" frameborder=\"0\" allowfullscreen></iframe>"));
       youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/i7w29DUI6y4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Z1jFXrOLHRA\" frameborder=\"0\" allowfullscreen></iframe>"));

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos,getApplicationContext(),this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recycler_experiment.setLayoutManager(layoutManager);
        recycler_experiment.setAdapter(videoAdapter);

    }


    @Override
    public void onNoteClick(int position) {

        Intent i = new Intent(ChapterDetailsActivity.this,VideoPlayerActivity.class)
                .putExtra("id",position);
        startActivity(i);

    }
}