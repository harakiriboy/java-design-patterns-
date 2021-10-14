package com.company;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class FullLengthVideoDirector implements Director {

    private static final Map<VideoType, FullLengthVideo> FULLVIDEOARCHIVE;

    static {
        FULLVIDEOARCHIVE = new EnumMap<>(VideoType.class);
        Arrays.stream(VideoType.values()).forEach(type -> FULLVIDEOARCHIVE.put(type, new FullLengthVideo(type)));
    }

    @Override
    public Video shotVideo(VideoType videoType) {
        return FULLVIDEOARCHIVE.get(videoType);
    }

    @Override
    public String toString() {
        return "The Full Video Director ";
    }
}
