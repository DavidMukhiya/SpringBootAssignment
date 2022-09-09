package com.genspark.SongManagementSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Song")
public class Song {
    @Id
    private int songID;
    private String title;
    private String singerName;
    private String composerName;
    private int releaseDate;

    public Song() {
    }

    public Song(int songID, String title, String singerName, String composerName, int releaseDate) {
        this.songID = songID;
        this.title = title;
        this.singerName = singerName;
        this.composerName = composerName;
        this.releaseDate = releaseDate;
    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getComposerName() {
        return composerName;
    }

    public void setComposerName(String composerName) {
        this.composerName = composerName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
