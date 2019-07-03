package com.example.firebasedatabase;

public class Track {
    String id;
    String trackName;
    int rating;

    public Track(String id, String trackName, int rating) {
        this.id = id;
        this.trackName = trackName;
        this.rating = rating;
    }


    public String getId() {
        return id;
    }

    public String getTrackName() {
        return trackName;
    }

    public int getRating() {
        return rating;
    }
}
