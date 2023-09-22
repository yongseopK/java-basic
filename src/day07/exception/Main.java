package day07.exception;

import util.Utility;

public class Main {
    public static void main(String[] args) {
        LoginUser user = new LoginUser("abc123", "1234");

        String id = Utility.input("ID : ");
        String pw = Utility.input("PW : ");

        try {
            String result = user.validate(id, pw);
        } catch (Exception e) {
            //e.printStackTrace();    // 에러 로그
            System.out.println(e.getMessage());
        }

    }
}
