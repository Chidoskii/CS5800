import org.example.Song;
import org.example.SongSearcher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongSearcherTest {
    SongSearcher searcher = new SongSearcher();
    Song testSong = new Song("Just a Test", "JBoogie", "Still Here", 1);
    Song testSong2 = new Song("Country Roads", "Chris Rock", "Mountain Mama", 2);
    Song testSong3 = new Song("Turn Off the Fear", "Jim Wylde", "Mud Water", 3);
    Song testSong4 = new Song("Give Me A Sign", "Brent Miller", "Sweet Love", 4);
    List<Song> testSongs = new ArrayList<Song>();

    @Test
    public void testAddSong() {
        List<Song> expected = new ArrayList<>();
        expected.add(testSong);
        expected.add(testSong2);
        List<Song> actual = new ArrayList<>();
        searcher.addSong(testSong);
        searcher.addSong(testSong2);
        actual = searcher.getSongList();
        assertEquals(expected, actual);
    }

    @Test
    public void testSearchByID() {
        Song expected = testSong;
        searcher.addSong(testSong);
        Song actual = searcher.searchByID(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testSearchByTitle() {
        testSongs.add(testSong2);
        searcher.addSong(testSong);
        searcher.addSong(testSong2);
        searcher.addSong(testSong3);
        searcher.addSong(testSong4);
        List<Song> expected = testSongs;
        List<Song> actual = searcher.searchByTitle("Country Roads");
        assertEquals(expected, actual);
    }

    @Test
    public void testSearchByAlbum() {
        testSongs.clear();
        testSongs.add(testSong3);
        searcher.addSong(testSong);
        searcher.addSong(testSong2);
        searcher.addSong(testSong3);
        searcher.addSong(testSong4);
        List<Song> expected = testSongs;
        List<Song> actual = searcher.searchByAlbum("Mud Water");
        assertEquals(expected, actual);
    }

}
