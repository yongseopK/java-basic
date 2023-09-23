package day10.io.obj;

import day10.io.rw.FilePath;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadSnack {
    public static void main(String[] args) {

        // 세이브 파일 로딩하기
        try(FileInputStream fis = new FileInputStream(FilePath.path + "/snack.sav")) {

            // 객체를 불러올 보조스트림
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Snack> snackList = (List<Snack>) ois.readObject();

            for (Snack snack : snackList) {
                System.out.println("snack = " + snack);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
