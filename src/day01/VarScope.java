package day01;

public class VarScope {
    public static void main(String[] args) {

        // 자바는 블록 단위 스코프를 가짐
        int number1 = 1010;
        int number2 = 2020;

        // 자바에서는 변수가 생성된 블록을 나가면 메모리에서 자동삭제

        if (true) {
            int number3 = 3030;
            System.out.println("number1 = " + number1);
        }
//        System.out.println("number3 = " + number3);
        int number3 = 4040;
    } // end main
    
//    int number4 = number1 + number2;
}
