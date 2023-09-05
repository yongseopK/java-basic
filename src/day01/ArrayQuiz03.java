package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dongBang = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호" };

        System.out.println("* 우리반 학생들의 별명 : " + Arrays.toString(dongBang));
        System.out.println("- 삭제할 멤버의 이름을 입력하세요.");

        while (true) {
            System.out.print(">> ");
            String target = sc.nextLine();
            for (int i = 0; i < dongBang.length; i++) {
                if (target.equals(dongBang[i])) {
                    String[] temp = new String[dongBang.length - 1];
                    System.out.println(target + "의 별명을 삭제합니다.");
                    System.out.print("> ");

                    for (int j = i; j < dongBang.length - 1; j++) {
                        dongBang[j] = dongBang[j + 1];
                    }
                    for (int j = 0; j < dongBang.length - 1; j++) {
                        temp[j] = dongBang[j];
                    }

                    dongBang = temp;
                    System.out.println("* 삭제 후 정보 : " + Arrays.toString(dongBang));
                    break;
                } else if (i == dongBang.length - 1) {
                    System.out.println("해당 별명(" + target + ")은 존재하지 않습니다.");
                    break;
                }
            }
        }

    }
}
