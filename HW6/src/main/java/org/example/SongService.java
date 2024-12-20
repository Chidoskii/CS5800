package org.example;

import java.util.List;

public interface SongService {
    Song searchByID(Integer songID);
    List<Song> searchByTitle(String title);
    List<Song> searchByAlbum(String album);
    void addSong(Song song);
}
