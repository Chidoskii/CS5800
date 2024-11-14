package org.example;

import java.util.ArrayList;
import java.util.List;

public class SongServiceMain {
    public static void main(String[] args) {
        SongService napster = new ProxySongSearcher();

        Song debut = new Song("Wonderful", "TWayne", "Circus", 1);
        Song oneHit = new Song("One Hit", "TWayne", "Circus", 2);
        Song twoHit = new Song("Two Hit", "TWayne", "Im Home", 3);
        Song threeHit = new Song("Three Hit", "TWayne", "Lights Out", 4);
        Song fourHit = new Song("Four Hit", "TWayne", "World Tour", 5);
        Song fiveHit = new Song("Raindrops", "TWayne", "Circus", 6);
        Song sixHit = new Song("Money in my Pocket", "TWayne", "YSL", 7);
        Song sevenHit = new Song("By a Landslide", "TWayne", "YSL", 8);
        Song eightHit = new Song("Over the Hills", "TWayne", "Look Alive", 9);

        napster.addSong(debut);
        napster.addSong(oneHit);
        napster.addSong(twoHit);
        napster.addSong(threeHit);
        napster.addSong(fourHit);
        napster.addSong(fiveHit);
        napster.addSong(sixHit);
        napster.addSong(sevenHit);
        napster.addSong(eightHit);

        System.out.println("----- Before Caching (search by ID) -----");
        List<Song> downloads = new ArrayList<Song>();
        Song searchResult = napster.searchByID(1);
        System.out.println(searchResult);
        searchResult = napster.searchByID(2);
        System.out.println(searchResult);
        searchResult = napster.searchByID(3);
        System.out.println(searchResult);
        searchResult = napster.searchByID(4);
        System.out.println(searchResult);
        searchResult = napster.searchByID(5);
        System.out.println(searchResult);
        searchResult = napster.searchByID(6);
        System.out.println(searchResult);
        searchResult = napster.searchByID(7);
        System.out.println(searchResult);
        searchResult = napster.searchByID(8);
        System.out.println(searchResult);
        searchResult = napster.searchByID(9);
        System.out.println(searchResult);

        System.out.println("----- Before Caching (search by Title) -----");
        downloads = napster.searchByTitle("Wonderful");
        for (Song song : downloads) {
            System.out.println(song);
        }
        downloads = napster.searchByTitle("Hit");
        for (Song song : downloads) {
            System.out.println(song);
        }
        downloads = napster.searchByTitle("Over");
        for (Song song : downloads) {
            System.out.println(song);
        }

        System.out.println("----- Before Caching (search by Album) -----");
        downloads = napster.searchByAlbum("Circus");
        for (Song song : downloads) {
            System.out.println(song);
        }
        downloads = napster.searchByAlbum("World Tour");
        for (Song song : downloads) {
            System.out.println(song);
        }
        downloads = napster.searchByAlbum("YSL");
        for (Song song : downloads) {
            System.out.println(song);
        }

        System.out.println("----- After Caching (search by ID) -----");
        searchResult = napster.searchByID(1);
        System.out.println(searchResult);
        searchResult = napster.searchByID(2);
        System.out.println(searchResult);
        searchResult = napster.searchByID(3);
        System.out.println(searchResult);
        searchResult = napster.searchByID(4);
        System.out.println(searchResult);
        searchResult = napster.searchByID(5);
        System.out.println(searchResult);
        searchResult = napster.searchByID(6);
        System.out.println(searchResult);
        searchResult = napster.searchByID(7);
        System.out.println(searchResult);
        searchResult = napster.searchByID(8);
        System.out.println(searchResult);
        searchResult = napster.searchByID(9);
        System.out.println(searchResult);

        System.out.println("----- After Caching (search by Title) -----");
        downloads = napster.searchByTitle("Wonderful");
        for (Song song : downloads) {
            System.out.println(song);
        }
        downloads = napster.searchByTitle("Hit");
        for (Song song : downloads) {
            System.out.println(song);
        }
        downloads = napster.searchByTitle("Over");
        for (Song song : downloads) {
            System.out.println(song);
        }

        System.out.println("----- After Caching (search by Album) -----");
        downloads = napster.searchByAlbum("Circus");
        for (Song song : downloads) {
            System.out.println(song);
        }
        downloads = napster.searchByAlbum("World Tour");
        for (Song song : downloads) {
            System.out.println(song);
        }
        downloads = napster.searchByAlbum("YSL");
        for (Song song : downloads) {
            System.out.println(song);
        }

    }
}
