package day01;

import java.util.Date;

public class DataType {
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {

        // 1byte == 8bit
        // -128 ~ 127
        byte a = 127;

        // 2byte == 16bit
        short b = 32767;

        // 4byte
        int c = 2147483647;

        // 8byte
        long d = 2_147_483_648L;

        float e = 3.1432131233213231F;    // 4byte - 소수점 7자리
        System.out.println("e = " + e);

        boolean b1 = true;
        boolean b2 = false;

        if (1 > 2) {

        }

        // 2byte
        char cc = '가';
        System.out.println("cc = " + cc);

        // 문자열 (문자 배열)
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("str = " + new String(str));

        // String은 기본(원시)타입이 아님
        String s = "hello";

        Date dddd = new Date();
    }
}
































