package day01;

public class Casting {
    public static void main(String[] args) {
        byte a = 100; // 1byte
        int b = a; // 4byte

        System.out.println(b);

        int c = 1000; // 4
        // d : 1(음수)    1101000
        // 1의 보수 :      0010111
        // 2의 보수 :      +     1
        //               0011000 => 24
        byte d = (byte) c; // 1

        System.out.println("d = " + d);

        double n = 3.5;
        int m = (int) n;

        // 다운캐스팅은 데이터 소실이 일어날 수 있음
        System.out.println("m = " + m);

        // 연산 시 일어나는 자동 캐스팅
        int k = 100;
        double j = 5.6;

        double result = k + j;

        // 데이터 크기가 다른 데이터 끼리의 연산은
        // 작은 쪽을 큰 쪽으로 자동 변환 후 연산을 진행

        char x = 'A';
        int y = 3;
        int result2 = (char) (x + y);
        System.out.println(result2);


        // int보다 작은 데이터 (byte, short, char)의 연산은 결과가 자동으로 int로 처리됨
        byte b1 = 100;
        byte b2 = 120;

        int result3 = b1 + b2;

        System.out.println('A' + 'C');

        int g = 24;
        double r = (double) g / 5;
        System.out.println("r = " + r);
    }
}







