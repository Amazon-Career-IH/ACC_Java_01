package com.ironhack.myfirstspringapp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "song_table")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String songTitle;
    private String albumTitle;
    private String artist;
    private Integer year;

    public Song() {
    }

    public Song(String songTitle, String albumTitle, String artist, Integer year) {
        this.songTitle = songTitle;
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.year = year;

    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
