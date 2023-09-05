package day01;

import java.util.Scanner;


public class ArrayQuiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요");

        String[] foodList = new String[]{};

        while (true) {
            System.out.print(">> ");
            String foods = sc.nextLine();

            if (foods.equals("그만")) {
                break;
            } else {
                String[] newArr = new String[foodList.length + 1];
                for (int i = 0; i < foodList.length; i++) {
                    newArr[i] = foodList[i];
                }
                newArr[newArr.length - 1] = foods;
                foodList = newArr;
            }
        }


    }
}





