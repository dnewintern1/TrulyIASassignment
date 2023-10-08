package com.base.trulyiasassignment;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.base.trulyiasassignment.adapter.Experiment_Adapter;
import com.base.trulyiasassignment.adapter.itemAdapter;
import com.base.trulyiasassignment.listener.ChapterClickedListener;
import com.base.trulyiasassignment.listener.OnExperimentClickedListener;

public class ChapterDetailsActivity extends AppCompatActivity {

    private RecyclerView recycler_experiment;

    Experiment_Adapter mExperimentAdapter;

    ChapterClickedListener experimentClickedListener;

    String[] experiment ={"EXPERIMENT-1","EXPERIMENT-2","EXPERIMENT - 3","EXPERIMENT - 4",
            "EXPERIMENT - 5","EXPERIMENT - 6","EXPERIMENT - 7","EXPERIMENT - 8"};


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


        recycler_experiment = findViewById(R.id.recycler_experiment);
        recycler_experiment.setAdapter(new itemAdapter(getApplicationContext(),experiment,onChapterClicked));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recycler_experiment.setLayoutManager(layoutManager);

    }

    private final ChapterClickedListener onChapterClicked = new ChapterClickedListener() {
        @Override
        public void onChapterClicked(String id) {

            // Toast.makeText(MainActivity.this, id, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), VideoPlayerActivity.class)
                    .putExtra("id",id));


        }
    };
}