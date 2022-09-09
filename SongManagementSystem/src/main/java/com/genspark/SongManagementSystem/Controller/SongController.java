package com.genspark.SongManagementSystem.Controller;

import com.genspark.SongManagementSystem.Entity.Song;
import com.genspark.SongManagementSystem.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("/")
    public String home(){
        return "This is a simple REST API for song management System.";
    }

    @GetMapping("/songs")
    public List<Song> getAllSong(){
        return this.songService.getAllSong();
    }

    @GetMapping("/songs/{songID}")
    public Song getSongByID(@PathVariable String songID){
        return this.songService.getSongByID(Integer.parseInt(songID));
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return this.songService.addSong(song);
    }

    @PutMapping("/songs")
    public Song updateSong(@RequestBody Song song){
        return this.songService.updateSong(song);
    }

    @DeleteMapping("/songs/{songID}")
    public String deleteSong(@PathVariable String songID){
        return this.songService.deleteSongByID(Integer.parseInt(songID));
    }
}
