package org.example;

public class Song {
    private String title;
    private String artist;
    private String album;
    private int duration;
    private Integer songID;

    public Song(String title, String artist, String album, Integer songID) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.songID = songID;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public String getAlbum() {
        return album;
    }
    public int getDuration() {
        return duration;
    }
    public int getSongID() {
        return songID;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setSongID(int songID) {
        this.songID = songID;
    }

    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", songID=" + songID +
                '}';
    }
}
