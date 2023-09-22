package day05.poly.car;

public class Driver {
    public void drive(Car car) {
        System.out.println("운전을 시작합니다.");
        car.accelerate();
    }
    // 오버로딩 : 같은 이름의 베서드를 하나의 클래스에서 중복해서 작성하는 것
//    public void drive(Mustang car) {
//        System.out.println("운전을 시작합니다.");
//        car.accelerate();
//    }
}
