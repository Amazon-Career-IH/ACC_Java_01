package com.ironhack.myfirstspringapp.repositories;

import com.ironhack.myfirstspringapp.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

    Song findBySongTitle(String title);
    Song findBySongTitleAndAlbumTitle(String songTitle, String albumTitle);
    List<Song> findByYearBetween(Integer firstYear, Integer endYear);
}
