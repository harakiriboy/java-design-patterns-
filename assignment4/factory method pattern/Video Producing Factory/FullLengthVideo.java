package com.company;

public class FullLengthVideo implements Video {

    private final VideoType videoType;

    public FullLengthVideo(VideoType videoType) {
        this.videoType = videoType;
    }

    @Override
    public String toString() {
        return "The full-length " + videoType;
    }

    @Override
    public VideoType getVideoType() {
        return null;
    }
}
