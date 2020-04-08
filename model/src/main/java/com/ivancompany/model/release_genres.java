package com.ivancompany.model;

/**
 * @author Timothy
 */
public class release_genres {
    int genre;
    int release;

    public release_genres() {
    }

    public release_genres(int genre, int release) {
        this.genre = genre;
        this.release = release;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }
}
