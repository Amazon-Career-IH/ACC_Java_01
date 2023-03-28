package com.ironhack.myfirstspringapp.models;

import com.ironhack.myfirstspringapp.models.*;
import com.ironhack.myfirstspringapp.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class SongTest {

    @Autowired
    private SongRepository songRepository;


    @BeforeEach
    public void setUp() {
        Song song = new Song("Creep",  "OK Computer", "Radiohead", 1995);
        Song song2 = new Song("Man in the mirror", "Michael Jackson", "Discon de michael", 2001);
        Song song3 = new Song("Money", "Dark Side of the Moon",  "Pink Floyd", 1986);
        Song song4 = new Song("Do has", "Rammsteim", "Rammsteim", 2003);
        Song song5 = new Song("Do has", "Another Album", "Jaume y su acordeón", 2022);

        songRepository.save(song);
        songRepository.saveAll(List.of(song2, song3, song4, song5));

    }



    @AfterEach
    public void teardown() {
        songRepository.deleteAll();
    }

    @Test
    public void shouldAddSong() {
        assertEquals(4, songRepository.findAll().size());
    }

    @Test
    public void shouldFindById() {
        Song song = songRepository.findAll().get(0);
        assertEquals("Creep", song.getSongTitle());
    }

    @Test void shouldFindBySongTitle() {
        Song song  = songRepository.findBySongTitle("Money");

        assertEquals("Dark Side of the Moon", song.getArtist());

    }

    @Test
    void shouldFindByYear() {
        List<Song> songs = songRepository.findByYearBetween(2000, 2023);

        assertEquals(3, songs.size());
    }

}
