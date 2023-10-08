package com.base.trulyiasassignment.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.base.trulyiasassignment.R;
import com.base.trulyiasassignment.listener.ChapterClickedListener;

public class Experiment_Item_Holder extends RecyclerView.ViewHolder {

    CardView cardView_experiment;
    TextView experiment_id;

    VideoView videoView;




    public Experiment_Item_Holder(@NonNull View itemView) {
        super(itemView);

        experiment_id = itemView.findViewById(R.id.experiment_id);
        cardView_experiment = itemView.findViewById(R.id.cardView_experiment);
        videoView = itemView.findViewById(R.id.videoView);

    }

    public CardView getRecycler_experiment() {
        return cardView_experiment;
    }

    public TextView getExperiment_id() {
        return experiment_id;
    }

    public VideoView getVideoView() {
        return videoView;
    }
}
