package day03;

import day03.juice.Banana;
import day03.juice.Mango;

public class PackageMain {
    public static void main(String[] args) {
        Mango mango = new Mango();
        Banana manana = new Banana();
        day03.fruit.Apple apple1 = new day03.fruit.Apple();  // fruit
        day03.juice.Apple apple2 = new day03.juice.Apple();  // juice
    }
}
