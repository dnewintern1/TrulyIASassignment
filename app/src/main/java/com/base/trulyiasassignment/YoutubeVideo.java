package com.base.trulyiasassignment;

public class YoutubeVideo {

    String videoURL;
    public YoutubeVideo(){};
    public YoutubeVideo(String videoURL){
        this.videoURL = videoURL;

    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public String getVideoURL() {
        return videoURL;
    }
}
