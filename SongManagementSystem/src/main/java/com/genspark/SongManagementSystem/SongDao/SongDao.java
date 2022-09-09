package com.genspark.SongManagementSystem.SongDao;

import com.genspark.SongManagementSystem.Entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongDao extends JpaRepository<Song, Integer> {

}
