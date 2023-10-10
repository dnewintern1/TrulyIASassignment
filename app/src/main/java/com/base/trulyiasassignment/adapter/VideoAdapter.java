package com.base.trulyiasassignment.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.base.trulyiasassignment.R;
import com.base.trulyiasassignment.VideoPlayerActivity;
import com.base.trulyiasassignment.YoutubeVideo;


import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoVideoViewHolder> {

    List<YoutubeVideo> youtubeVideoList;

    Context Context;
    private OnNoteListener onNoteListener;

    public VideoAdapter(List<YoutubeVideo> youtubeVideoList, Context Context,OnNoteListener onNoteListener) {
        this.youtubeVideoList = youtubeVideoList;
         this.Context = Context;
        this.onNoteListener = onNoteListener;
    }


    @NonNull
    @Override
    public VideoVideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.videoview,parent,false);
        return new VideoVideoViewHolder(view, onNoteListener);
    }


    @Override
    public void onBindViewHolder(@NonNull VideoVideoViewHolder holder, int position) {

        holder.videoWebView.loadData(youtubeVideoList.get(position).getVideoURL(),"text/html","utf-8");

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
        return youtubeVideoList.size();
    }

    public class VideoVideoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private Context context;
        WebView videoWebView;


        OnNoteListener onNoteListener;
        View videolayout;


        public VideoVideoViewHolder(View itemview , OnNoteListener onNoteListener){
            super(itemview);

            videoWebView= (WebView)itemview.findViewById(R.id.videoWebView);
            this.onNoteListener = onNoteListener;
            this.context = context;
            videolayout=(View) itemview.findViewById(R.id.videolayout);

           videoWebView.getSettings().setJavaScriptEnabled(true);
            videoWebView.setWebChromeClient(new WebChromeClient());
            videolayout.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            onNoteListener.onNoteClick(getAdapterPosition());

        }
    }

   public interface OnNoteListener{
        void onNoteClick(int position);

    }




}
