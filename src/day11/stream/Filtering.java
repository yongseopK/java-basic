package day11.stream;

import util.Utility;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day11.stream.Menu.*;

public class Filtering {
    public static void main(String[] args) {

        // stream의 filtering
        // 필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환

        // 메뉴 중 채식주의자가 먹을 수 있는 요리를 필터링
        //List<Dish> dishInVegitarian = menuList.stream()
        //        .filter(dish -> dish.isVegeterian())
        //        .collect(Collectors.toList())
        //        ;

        //dishInVegitarian.forEach(dish -> System.out.println(dish));

        menuList.stream()
                .filter(Dish::isVegeterian)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("==== 육류이면서 600칼로리 미만 요리 필터링 ====");

        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT && dish.getCalories() < 600)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("=== 요리중에 요리이름이 4글자인 요리만 필터링 ===");

        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("=== 요리에서 300칼로리보다 큰 요리만 필터링 ===");

        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)   // 상위 Top3 추출
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Utility.makeLine();

        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("=== 메뉴 목록에서 처음 등장하는 2개의 생선요리 필터링 ==");

        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.FISH)
                .limit(2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 5, 6);

        // 짝수만 걸러내기
        List<Integer> filteredNumber = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(filteredNumber);

        // 중복 제거
        Set<Integer> distinctedNumbers = new HashSet<>(filteredNumber);
        System.out.println(distinctedNumbers);
    }
}















