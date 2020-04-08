package com.ivancompany.model;

/**
 * @author Timothy
 */
public class song_usage_data {
    int song;
    String user;

    /**
     * empty constructor
     */
    public song_usage_data() {
    }

    /**
     * constructor with full parameters
     * @param song the ID of the song
     * @param user the name of the user
     */
    public song_usage_data(int song, String user) {
        this.song = song;
        this.user = user;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
