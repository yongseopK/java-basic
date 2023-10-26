package day11.stream;

import util.Utility;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static day11.stream.Menu.*;

public class Mapping {

    // 이름과 칼로리만 가진 클래스 설계
    private static class SimpleDish {
        private String name;
        private int calories;

        public SimpleDish(Dish dish) {
            this.name = dish.getName();
            this.calories = dish.getCalories();
        }

        public SimpleDish(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        @Override
        public String toString() {
            return "SimpleDish{" +
                    "name='" + name + '\'' +
                    ", calories=" + calories +
                    '}';
        }
    }

    private static class FilterDish {
        private String name;
        private Enum type;


        public FilterDish(Dish dish) {
            this.name = dish.getName();
            this.type = dish.getType();
        }

        public FilterDish(String name, Enum type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return "FilterDish{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }

    public static void main(String[] args) {

        // stream의 map : 컬렉션(리스트, 셋, 맵...)에서 원하는 정보만
        //                추출하여 새로운 컬렉션으로 반환해줌

        List<Integer> nameList = menuList.stream()
                .map(Dish::getCalories)
                .collect(Collectors.toList());

        System.out.println(nameList);

        /*
             요리목록에서 메뉴 이름과 칼로리를 추출하고 싶다.
         */

        Utility.makeLine();

        menuList.stream()
                .map(SimpleDish::new)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력
         */

        Utility.makeLine();
        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(FilterDish::new)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}













