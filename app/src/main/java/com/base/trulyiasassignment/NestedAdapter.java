package com.base.trulyiasassignment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;

public class NestedAdapter extends RecyclerView.Adapter<NestedAdapter.NestedViewHolder> {

   private List<String> mList;



    public NestedAdapter(List<String> mList){
        this.mList = mList;
    }
    @NonNull
    @Override
    public NestedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nested_item , parent , false);
        return new NestedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NestedViewHolder holder, int position) {
       //holder.mTv.setText(mList.get(position));

        String htmlContent = mList.get(position);
        holder.videoWebView.loadData(htmlContent, "text/html", "utf-8");

        holder.videolayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int onclickpostion = holder.getAdapterPosition();
                // Start the VideoPlayerActivity and pass the position as an extra
                Intent intent = new Intent(v.getContext(), VideoPlayerActivity.class);
                intent.putExtra("video_position", onclickpostion);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class NestedViewHolder extends RecyclerView.ViewHolder implements OnNoteListener{
        private TextView mTv;

        private Context context;
        WebView videoWebView;


        NestedAdapter.OnNoteListener onNoteListener;
        View videolayout;
        public NestedViewHolder(@NonNull View itemView) {
            super(itemView);

            videoWebView= (WebView)itemView.findViewById(R.id.videoWebView);
            this.onNoteListener = onNoteListener;
            this.context = context;
            videolayout=(View) itemView.findViewById(R.id.videolayout);

            videoWebView.getSettings().setJavaScriptEnabled(true);
            videoWebView.setWebChromeClient(new WebChromeClient());
            mTv = itemView.findViewById(R.id.nestedItemTv);
        }

        @Override
        public void onNoteClick(int position) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }
    public interface OnNoteListener{
        void onNoteClick(int position);

    }
}