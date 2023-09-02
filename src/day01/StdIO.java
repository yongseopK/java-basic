package day01;

import java.util.Scanner;

public class StdIO {
    public static void main(String[] args) {

        // 자바에서 입력을 처리하는 객체
        // 입력이 필요한 상황에서 1번 선언하면 됨
        Scanner sc = new Scanner(System.in);

        // 문자를 입력
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        int birthYear = 2023 - age + 1;

        System.out.printf("이름 : %s, 출생년도 : %d년\n", name, birthYear);

        // 메모리 자원 해제 (하드웨어, 네트워크, 데이터베이스 외부장치접근)
        sc.close();
    }
}




