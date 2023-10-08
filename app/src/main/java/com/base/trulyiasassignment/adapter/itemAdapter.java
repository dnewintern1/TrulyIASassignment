package com.base.trulyiasassignment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.base.trulyiasassignment.Chapters;
import com.base.trulyiasassignment.listener.ChapterClickedListener;
import com.base.trulyiasassignment.R;

public class itemAdapter extends RecyclerView.Adapter<ItemViewHolder> {


   String[] categorie ={"Chapter 1: Food: Where Does It Come From?" , "Chapter 2: Components Of Food",
            "Chapter 3:  Fibre to Fabric ", " Chapter 4: Sorting Material into Groups",
            "Chapter 6: Separation of Substance"};



    Context context;

    private ChapterClickedListener onClickListener;




    public itemAdapter(   Context context, String[] categorie , ChapterClickedListener onClickListener) {

        this.categorie=categorie;
        this.onClickListener = onClickListener;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemview,parent,false);

        ItemViewHolder categoryViewHolder= new ItemViewHolder(view);
        return categoryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        holder.getItemid().setText(categorie[position]);
        holder.randomlistContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int clickedPosition = holder.getAdapterPosition();
                onClickListener.onChapterClicked(String.valueOf(clickedPosition));

                Toast.makeText(view.getContext(), "Clicked item at position: " + clickedPosition, Toast.LENGTH_SHORT).show();
            }
        });
    }



    @Override
    public int getItemCount() {
        return categorie.length;
    }



}


