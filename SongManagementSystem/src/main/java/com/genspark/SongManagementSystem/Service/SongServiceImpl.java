package com.genspark.SongManagementSystem.Service;

import com.genspark.SongManagementSystem.Entity.Song;
import com.genspark.SongManagementSystem.SongDao.SongDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongServiceImpl implements SongService{

    @Autowired
    SongDao songDao;

    @Override
    public List<Song> getAllSong() {
        return this.songDao.findAll();
    }

    @Override
    public Song getSongByID(int songID) {
        Song song = null;
        Optional<Song> songOptional = this.songDao.findById(songID);
        if(songOptional.isPresent()) {
            song = songOptional.get();
        }else{
            throw new RuntimeException("Song with ID::"+songID+" not found.");
        }
        return song;
    }

    @Override
    public Song addSong(Song song) {
        return this.songDao.save(song);
    }

    @Override
    public Song updateSong(Song song) {
        return this.songDao.save(song);
    }

    @Override
    public String deleteSongByID(int songID) {
        this.songDao.deleteById(songID);
        return "Song with ID:: "+songID+" deleted successfully";
    }
}
