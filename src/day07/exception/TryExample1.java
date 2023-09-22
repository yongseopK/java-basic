package day07.exception;

public class TryExample1 {
    public static void main(String[] args) {

        int n1 = 10, n2 = 0;    // 1

        System.out.println("나누기 시작!");  // 2

        try {
            int result = n1 / n2;   // 3
            System.out.printf("%d / %d = %d\n", n1, n2, result);    // 4
        } catch (Exception e) {
            System.out.println("0으로 못나눔;;");
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료!");  // 5
    }

}
