package com.base.trulyiasassignment.adapter;

import static androidx.browser.customtabs.CustomTabsClient.getPackageName;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.base.trulyiasassignment.ChapterDetailsActivity;
import com.base.trulyiasassignment.R;
import com.base.trulyiasassignment.listener.OnExperimentClickedListener;

public class Experiment_Adapter extends RecyclerView.Adapter<Experiment_Item_Holder> {




    String[] experiment ={"EXPERIMENT-1","EXPERIMENT-2","EXPERIMENT - 3","EXPERIMENT - 4",
        "EXPERIMENT - 5","EXPERIMENT - 6","EXPERIMENT - 7","EXPERIMENT - 8"};


    Context context;

    private OnExperimentClickedListener experimentClickedListener;




    @NonNull
    @Override
    public Experiment_Item_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.experiment_item,parent,false);
        Experiment_Item_Holder experimentItemHolder= new Experiment_Item_Holder(view);
        return experimentItemHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Experiment_Item_Holder holder, int position) {

        holder.getExperiment_id().setText(experiment[position]);
        holder.cardView_experiment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int clickedPosition = holder.getAdapterPosition();
                experimentClickedListener.onExperimentClicked(String.valueOf(clickedPosition));

                Toast.makeText(view.getContext(), "Clicked item at position: " + clickedPosition, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return experiment.length;
    }
}
