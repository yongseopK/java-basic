package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dongBang = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 변경 전 정보 : " + Arrays.toString(dongBang));
        System.out.println("- 수정할 멤버의 이름을 입력하세요.");
        // 배열 생성
        String[] newArr = new String[dongBang.length];

        // 값 복사
        for (int i = 0; i < dongBang.length; i++) {
            newArr[i] = dongBang[i];
        }

        while (true) {
            System.out.print(">> ");
            String target = sc.nextLine();
            // 탐색
            for (int i = 0; i < dongBang.length; i++) {
                if (target.equals(dongBang[i])) {
                    System.out.println(target + "의 별명을 변경합니다.");
                    System.out.print(">> ");
                    String fixName = sc.nextLine();
                    newArr[i] = fixName;
                    System.out.println("변경완료!!");
                    dongBang = newArr;
                    System.out.println("* 변경 후 정보 : " + Arrays.toString(dongBang));
                    break;
                } else if (i == dongBang.length - 1) {
                    System.out.println(target + "은(는) 없는 이름입니다.");
                    break;
                }
            }
        }
    }
}
