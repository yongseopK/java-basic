package day08.collection.song;

public class Test {
    public static void main(String[] args) {
        ArtistRepository ar = new ArtistRepository();

        ar.addNewArtist("빅뱅", "거짓말");
        ar.addNewArtist("빅뱅", "하루하루");
        ar.addNewArtist("에스파", "도깨비불");

        System.out.println(ar.isRegistered("빅뱅"));
        System.out.println(ar.isRegistered("뉴진스"));
        System.out.println(ArtistRepository.getArtistList());
    }
}
