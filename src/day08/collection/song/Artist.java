package day08.collection.song;

import java.util.*;

public class Artist {

    private String name;    // 가수명
    private Set<String> songList;  // 노래목록

    public Artist(String name, Set<String> songList) {
        this.name = name;
        this.songList = songList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSongList() {
        return songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }

    public void info() {
        System.out.println("가수명 : " + name);
        System.out.println("노래 목록 : " + songList);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", songList=" + songList +
                '}';
    }
}











