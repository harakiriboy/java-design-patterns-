package com.company;

public class Runner {
    public static void main(String[] args) {

        Director director = new FullLengthVideoDirector();
        Video video = director.shotVideo(VideoType.Series);
        LOGGER.info(" shotted ", director, video);
        video = director.shotVideo(VideoType.Movie);
        LOGGER.info(" shotted ", director, video);

        director = new ShortVideoDirector();
        video = director.shotVideo(VideoType.Clip);
        LOGGER.info(" shotted ", director, video);
        video = director.shotVideo(VideoType.Advertise);
        LOGGER.info(" shotted ", director, video);
    }
}
