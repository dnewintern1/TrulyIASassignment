package com.base.trulyiasassignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class itemAdapter extends RecyclerView.Adapter<ItemViewHolder> {


    String[] categorie ={"Chapter 1: Food: Where Does It Come From?" , "Chapter 2: Components Of Food",
            "Chapter 3:  Fibre to Fabric ", " Chapter 4: Sorting Material into Groups",
            "Chapter 6: Separation of Substance"};


    public itemAdapter(String[] categorie) {
        this.categorie = categorie;
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

    }

    @Override
    public int getItemCount() {
        return categorie.length;
    }
}


