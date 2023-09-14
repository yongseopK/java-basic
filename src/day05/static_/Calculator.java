package day05.static_;

public class Calculator {

    String color;
    static double pi; // 원주율

    // 원의 넓이를 구하는 메서드
    static double calcAreaCircle(int r) {
        return pi * r * r;
    }

    // 계산기에 색깔을 칠하는 기능
    void paint(String color) {
        this.color = color;
    }

}
