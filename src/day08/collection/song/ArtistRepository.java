package day08.collection.song;

import day10.io.rw.FilePath;

import java.io.*;
import java.util.*;

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


    // 노래 목록을 찾아서 출력하는 기능
    public void showSongList(String artistName) {
        Artist artist = findArtistByName(artistName);
        Set<String> songList = artist.getSongList();
        List<String> songs = new ArrayList<>(songList);

        for (int i = 0; i < songList.size(); i++) {
            System.out.printf("* %d. %s\n", i+1, songs.get(i));
        }
    }

    // 세이브 기능
    public void autoSave() {
        // 폴더 생성
        File f = new File(FilePath.path + "/music");
        if(!f.exists()) f.mkdir();

        try (FileOutputStream fos = new FileOutputStream(FilePath.path + "/music/song.sav")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(artistList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 로드 기능
    public void loadFile() {
        // 세이브 파일이 있는지 확인
        File f = new File(FilePath.path + "/music/song.sav");
        if(f.exists()) {    // 해당 세이브파일이 존재하면 로드 진행
            try (FileInputStream fis = new FileInputStream(FilePath.path + "/music/song.sav")) {
                ObjectInputStream ois = new ObjectInputStream(fis);

                artistList = (Map<String, Artist>) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}













