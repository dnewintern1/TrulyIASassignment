package com.base.trulyiasassignment;

import android.content.ClipData;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class itemAdapter extends RecyclerView.Adapter<itemViewHolder> {

    Context mContext;
    List<ClipData.Item> items;

    public itemAdapter(Context context, List<ClipData.Item> items) {
        mContext = context;
        this.items = items;
    }

    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new itemViewHolder(LayoutInflater.from(mContext).inflate(R.layout.itemview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {

      //  holder.itemid.setText(items.get(position).get);

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}