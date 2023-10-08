package com.base.trulyiasassignment.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.base.trulyiasassignment.R;


public class ItemViewHolder extends RecyclerView.ViewHolder {


CardView randomlistContainer;
    TextView itemid;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        itemid = itemView.findViewById(R.id.itemid);
        randomlistContainer = itemView.findViewById(R.id.randomlistContainer);
    }

    public TextView getItemid() {
        return itemid;
    }

}

