package day01;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {

        int[] arr = {10, 20, 90, 100, 999, 2000};
        int newData = 50;
        int targetIndex = 2;

//        int[] temp = Arrays.copyOf(arr, arr.length + 1);
//
//        for (int i = targetIndex; i < temp.length - 1; i++) {
//            temp[i + 1] = arr[i];
//        }
//
//        temp[2] = newData;
//
//        arr = temp;
//        temp = null;
//
//        System.out.println(Arrays.toString(arr));

        // 20과 90사이에 50을 넣어야함
        // [10, 20, 50, 90, 100]

        // 1. 사이즈가 1개 더 큰 새 배열을 생성
        int[] temp = new int[arr.length + 1];

        // 2. temp에 원본 배열의 데이터를 전부 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // 3. 맨 뒤부터 한 칸씩 뒤로 이동
        for (int i = arr.length; i > targetIndex; i--) {
            temp[i] = temp[i - 1];
        }

        // 4. 타켓인덱스에 새 데이터를 추가
        temp[targetIndex] = newData;

        // 5. 주소값 변경
        arr = temp;
        temp = null;

        System.out.println("arr : " + Arrays.toString(arr));
    }
}
