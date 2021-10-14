package com.company;

public class ShortVideo implements Video {

    private final VideoType videoType;

    public ShortVideo(VideoType videoType) {
        this.videoType = videoType;
    }

    @Override
    public String toString() {
        return "The short " + videoType;
    }

    @Override
    public VideoType getVideoType() {
        return null;
    }
}
