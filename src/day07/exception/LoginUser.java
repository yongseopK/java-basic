package day07.exception;

public class LoginUser {
    String userAccount;
    String userPassword;

    public LoginUser(String userAccount, String userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }

    public String validate(String inputAccount, String inputPassword) throws LoginFailException {
        if (userAccount.equals(inputAccount)) {
            if(userPassword.equals(inputPassword)) {
                // 로그인 성공
                return "SUCCESS";
            } else {
                // 비번 불일치
                throw new LoginFailException("비밀번호가 올바르지 않다");
            }
        } else {
            // 계정 정보 불일치
            throw new LoginFailException("이 계정은 뭐노ㅋㅋ");
        }
    }
}

















