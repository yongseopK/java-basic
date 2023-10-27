package day11.stream;

import util.Utility;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day11.stream.Menu.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;
import static util.Utility.*;

public class Sorting {
    public static void main(String[] args) {

        // 음식목록 중 칼로리가 낮은 순으로 정렬
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);

        makeLine();

        // 칼로리로 내림차 정렬
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList())
                .forEach(System.out::println);

        makeLine();

        // 500칼로리보다 작은 요리중에 앞에서 top3 필터링
        menuList.stream()
                .filter(d -> d.getCalories() < 500)
                .sorted(comparing(Dish::getCalories).reversed())
                .limit(3)
                .collect(toList())
                .forEach(System.out::println);
    }
}










