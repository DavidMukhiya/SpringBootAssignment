package com.genspark.SongManagementSystem.Service;

import com.genspark.SongManagementSystem.Entity.Song;
import com.genspark.SongManagementSystem.SongDao.SongDao;

import java.util.List;

public interface SongService{
    List<Song> getAllSong();
    Song getSongByID(int songID);
    Song addSong(Song song);
    Song updateSong(Song song);
    String deleteSongByID(int songID);
}
