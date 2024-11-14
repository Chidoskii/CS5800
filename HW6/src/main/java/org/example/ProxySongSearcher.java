package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxySongSearcher implements SongService{
    private final Map<Integer, Song> songIdCache = new HashMap<Integer, Song>();
    private final Map<String, List<Song>> songTitleCache = new HashMap<String, List<Song>>();
    private final Map<String, List<Song>> songAlbumCache = new HashMap<String, List<Song>>();
    private final SongService proxy = new SongSearcher();

    @Override
    public void addSong(Song song) {
        proxy.addSong(song);
    }

    @Override
    public Song searchByID(Integer songID) {
        if (!songIdCache.containsKey(songID)) {
            songIdCache.put(songID, proxy.searchByID(songID));
        }
        return songIdCache.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        if (!songTitleCache.containsKey(title)) {
            songTitleCache.put(title, proxy.searchByTitle(title));
        }
        return songTitleCache.get(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        if (!songAlbumCache.containsKey(album)) {
            songAlbumCache.put(album, proxy.searchByAlbum(album));
        }
        return songAlbumCache.get(album);
    }
}
