package com.company;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class ShortVideoDirector implements Director {

    private static final Map<VideoType, ShortVideo> SHORTVIDEOARCHIVE;

    static {
        SHORTVIDEOARCHIVE = new EnumMap<>(VideoType.class);
        Arrays.stream(VideoType.values()).forEach(type -> SHORTVIDEOARCHIVE.put(type, new ShortVideo(type)));
    }


    @Override
    public Video shotVideo(VideoType videoType) {
        return SHORTVIDEOARCHIVE.get(videoType);
    }

    @Override
    public String toString() {
        return "The Short Video Director ";
    }
}
