package com.base.trulyiasassignment;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ItemViewHolder extends RecyclerView.ViewHolder {



    TextView itemid;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        itemid = itemView.findViewById(R.id.itemid);
    }

    public TextView getItemid() {
        return itemid;
    }

}

