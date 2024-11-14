package org.example;

import java.util.ArrayList;
import java.util.List;

public class SongSearcher implements SongService{
    private List<Song> songList = new ArrayList<Song>();

    public void addSong(Song song) {
        songList.add(song);
    }

    public List<Song> getSongList() {
        return songList;
    }

    @Override
    public Song searchByID(Integer songID){
        Song searchResult = null;
        try {
            Thread.sleep(1000);
            for (Song song : songList) {
                if (song.getSongID() == songID) {
                    searchResult = song;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return searchResult;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        List<Song> songTitles = new ArrayList<>();

        try {
            Thread.sleep(1000);
            for (Song song : songList) {
                if (song.getTitle().contains(title)){
                    songTitles.add(song);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return songTitles;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        List<Song> songAlbums = new ArrayList<>();

        try {
            Thread.sleep(1000);
            for (Song song : songList) {
                if (song.getAlbum().equals(album)){
                    songAlbums.add(song);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return songAlbums;
    }

    public void printSongList(){
        for (Song song : songList){
            System.out.println(song);
        }
    }
}
