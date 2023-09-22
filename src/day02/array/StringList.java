package day02.array;

import java.util.Arrays;

public class StringList {

    // 스트링 배열을 필드로 등록
    String[] sArr;

    // 생성자를 통해 배열을 초기화

    public StringList() {
        sArr = new String[0];
    }

    StringList(String... initData) {
        sArr = new String[initData.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];
        }
    }

    // 배열 맨 끝 데이터 제거
    public void pop() {
        String[] temp = new String[sArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
    }

    public void push(String newData) {
        String[] temp = new String[sArr.length + 1];

        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }

        temp[temp.length - 1] = newData;

        sArr = temp;
//        temp = null;  메서드에서는 한 번 호출되고 동작이 끝나면 메모리에서 지워지기 때문에 안 비워도 됨
    }

    void insert(int idx, String value) {
        String[] temp = new String[sArr.length + 1];

        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        for (int i = sArr.length; i > idx; i--) {
            temp[i] = temp[i - 1];
        }

        temp[idx] = value;

        sArr = temp;
        temp = null;
    }

    void remove(String targetVal) {
        int indexToRemove = -1;

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].equals(targetVal)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < sArr.length - 1; i++) {
                sArr[i] = sArr[i + 1];
            }
            String[] temp = new String[sArr.length - 1];

            for (int i = 0; i < temp.length; i++) {
                temp[i] = sArr[i];
            }

            sArr = temp;
            temp = null;
        }
    }

    void remove(int targetIdx) {
        for (int i = targetIdx; i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }

        String[] temp = new String[sArr.length - 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }

        sArr = temp;
        temp = null;
    }

    boolean includes(String targetVal) {
        return indexOf(targetVal) != -1 ? true : false;
    }

    int indexOf(String targetName) {
        for (int i = 0; i < sArr.length; i++) {
            if (targetName.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }

    boolean isEmpty() {
        return sArr.length == 0 ? true : false;
    }

    void clear() {
        sArr = new String[0];
    }

    int size() {
        return sArr.length;
    }

    void printArray() {
        System.out.println(Arrays.toString(sArr));
    }

    public String[] getsArr() {return sArr; }
}





