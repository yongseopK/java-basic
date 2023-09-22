package day08.collection.song;

import book.BookUser;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArtistRepository {

    // key : 가수이름, value : 가수객체
    private static Map<String, Artist> artistList;

    static {
        artistList = new HashMap<>();
    }

    // 신규 가수를 map에 추가하는 기능
    public void addNewArtist(String artistName, String songName) {
        // 1. 신규가수 정보 생성
        Artist artist = new Artist(artistName, new HashSet<>());

        // 2. 생성된 노래 목록에 전달받은 노래를 추가
        artist.getSongList().add(songName);

        // 3. 가수 정보를 Map에 저장
        artistList.put(artistName, artist);
    }

    // 현재 등록된 가수의 수 변환
    public int count() {
        return artistList.size();
    }

    // 가수명을 전달받아 현재 등록된 가수인지 확인하는 기능
    public boolean isRegistered(String artistName) {
        return artistList.containsKey(artistName);
    }

    /** 기존 가수정보에 노래만 추가하는 기능
     * @param artistName - 사용자의 입력 가수이름
     * @param songName - 사용자의 입력 노래이름
     * @return - 곡명이 중복되었으면 false,
     *           곡이 정상적으로 추가되면 true
     * */
    public boolean addNewSong(String artistName, String songName) {
        // 1. Map에서 기존 가수 객체를 가져와야 함.
        Artist artist = findArtistByName(artistName);
        boolean flag = artist.getSongList().add(songName);
        return flag;
    }

    private static Artist findArtistByName(String artistName) {
        return artistList.get(artistName);
    }

    public static Map<String, Artist> getArtistList() {
        return artistList;
    }


}













