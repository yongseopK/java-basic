package day09.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {

    public static void main(String[] args) {

        // 바이트기반 스트림 - 이미지, 영상, 텍스트, 기타파일 전부
        // 텍스트기반 스트림 - 텍스트 특화

        String msg = "멍멍이는~~~왈왈~\n하하호호히히";

//        new FileOutputStream("D:/hello/dog.txt");

        // try with resources : auto close 기능
        try (FileOutputStream fos = new FileOutputStream("/Users/yongseopkim/Desktop/hello/dog.txt")) {
            fos.write(msg.getBytes()); // 세이브파일을 생성
            System.out.println("파일 저장 성공!");
        } catch (FileNotFoundException e) {
            System.out.println("해당 경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("출력 시스템에 장애가 발생했습니다.");
        }



        /*finally {
            try {
                if (fos != null ) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

    }
}
