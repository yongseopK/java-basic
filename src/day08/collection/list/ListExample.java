package day08.collection.list;

import day08.generic.Apple;
import util.Utility;

// 컬랙션들이 모여 있는 패키지
import java.util.*;

import static util.Utility.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // add(E e) : 맨 끝에 데이터 추가
        list.add("짜장면");
        list.add("짬뽕");
        list.add("파스타");
        list.add("리조또");
        list.add("치킨");

        System.out.println(list);

        // 중간삽입 add(index, element)
        list.add(2, "족발");
        System.out.println(list);
        
        int size = list.size();
        System.out.println("size = " + size);

        // indexOf(E e) : 해당 데이터의 index 반환
        int index = list.indexOf("파스타");
        System.out.println("index = " + index);

        // contains(E e) : 해당 데이터 저장 유무 반환
        System.out.println(list.contains("짜장면"));
        System.out.println(list.contains("마파두부"));

        // remove(index), remove(object)
        list.remove("파스타");
        list.remove(0);

        System.out.println("list = " + list);

        // set(index, newElement) : 수정
        list.set(0, "동파육");
        System.out.println("list = " + list);

        // get(index)
        String s = list.get(1);
        System.out.println("s = " + s);
        
        // 반복문 처리
        makeLine();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        makeLine();
        
        for (String ss : list) {
            System.out.println("ss = " + ss);
        }


        // clear() : 전체 삭제
        // isEmpty() : 리스트가 비어있는지 확인
        makeLine();
        System.out.println(list.isEmpty()); // false
        list.clear();
        System.out.println(list.isEmpty()); // true

        // 리스트에 초기값 넣고 시작하기
        List<Integer> numbers = new ArrayList<>(
                //List.of(5, 30, 7, 99, 3, 41)
                Arrays.asList(5, 30, 99, 11, 3, 2)
        );

        makeLine();
        System.out.println(numbers);

        // 오름차순 정렬 (퀵 정렬)
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        // 내림차순 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

        // 배열 리스트와 연결 리스트
        /*
                        탐색속도    삽입 삭제속도
            배열리스트      빠름         느림
            연결리스트      느림         빠름
        */

        List<Apple> appleList = new LinkedList<>();
        appleList.add(new Apple(18));

    }
}





