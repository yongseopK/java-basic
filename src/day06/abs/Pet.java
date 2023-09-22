package day06.abs;

public abstract class Pet {

    // 공통 속성
    private String name;    // 이름
    private String kind;    // 품종
    private int age;        // 나이


    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    // 공통 기능
    // 낮잠 기능
    public abstract void takeNap();
    // 밥먹는 기능
    public abstract void eat();

    // 선택 기능
    public void walk() {

    }

    // 자식객체들은 이 내용을 바꾸지 말고 그냥 써라
    public final String info() {
        return "hello !!" + name;
    }
}












