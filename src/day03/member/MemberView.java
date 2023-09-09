package day03.member;

import java.util.Scanner;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberView {

    // 상수 만들기
    public static final int MAX_REGISTER = 10;

    Scanner sc;
    MemberRepository mr;

    public MemberView() {
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
        viewProcess();
    }

    /**
     * 초기 메인 화면을 출력
     */
    void mainView() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        if (mr.getNumberOfMembers() < MAX_REGISTER) {
            System.out.println("* 1. 회원 정보 등록하기");
        }
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 프로그램 끝내기");
        System.out.println("* 7. 삭제회원 복구하기");
        System.out.println("=============================");

        // 1. 2번 메뉴를 선택하면, 이메일을 받아서 일치하는 회원이 발견되면
        //    회원의 패스워드를 포함한 모든 정보를 세로로 출력 - 완

        // 2. 가입된 회원이 10명이 넘으면 1번 메뉴를 숨김처리 - 완

        // 3-1. 회원 탈퇴기능 구현, 5번을 누르면 이메일과 패스워드를 입력받고,
        //      일치하면 회원배열에서 제거 - 완

        // 3-1. 탈퇴처리를 한 후 탈퇴대기 배열에 추가 - 완

        // 4. 추가 메뉴번호를 활성화하여 예를들어 7. 회원 복구하기
        //    회원의 이메일과 패스워드를 입력받아 복구시켜주고, 만약 10명이 가입된 상태면
        //    복구를 할 수 없다는 로그를 띄움 - 완
    }

    /**
     * 프로그램 화면 흐름을 제어하는 기능
     */
    void viewProcess() {
        while (true) {
            mainView();
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    if (mr.getNumberOfMembers() < MAX_REGISTER) {
                        SignUp();
                    } else {
                        System.out.println("# 현재 회원수가 10명을 초과하여 회원가입 기능이 중지되었습니다.");
                        continue;
                    }
                    break;
                case "2":
                    particularMember();
                    break;
                case "3":
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    changePassword();
                    break;
                case "5":
                    removeMember();
                    break;
                case "6":
                    String answer = input("# 정말로 종료합니까? [y/n] : ");

                    if (answer.toLowerCase().charAt(0) == 'y') {
                        System.out.println("# 프로그램을 종료합니다.");
                        System.exit(0);
                    } else {
                        continue;
                    }
                    break;
                case "7":
                    if (mr.memberList.length > 10) {
                        restorationMember();
                    } else {
                        System.out.println("# 현재 회원수가 10명이라 복원이 불가능합니다!");
                        stop();
                    }
                    break;
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }
    }

    private void restorationMember() {
        String email = input("# 복구 대상의 이메일 : ");
        if (mr.isRestorationEmail(email)) {
            String password = input("# 복구 대상의 패스워드 : ");
            if (mr.isRestorationPassword(password)) {
                mr.restorationMember(email);
            } else {
                System.out.println("# 비밀번호가 틀렸습니다!");
                stop();
            }
        } else {
            System.out.println("# 삭제된 회원이 없습니다.");
            stop();
        }
        System.out.println("\n# 복원 완료");
        stop();
    }

    private void removeMember() {
        String email = input("# 삭제 대상의 이메일 : ");
        if (mr.isDuplicatedEmail(email)) {
            String password = input("# 삭제 대상의 패스워드 : ");
            if (mr.isDuplicatedPassword(password)) {
                mr.removeMember(email);
            } else {
                System.out.println("# 비밀번호가 틀렸습니다!");
                stop();
            }
        } else {
            System.out.println("# 해당 이메일에 대한 정보가 없습니다.");
            stop();
        }
        System.out.println("\n# 삭제 완료");
        stop();
    }

    private void particularMember() {
        // 이메일을 입력받음
        String email = input("# 조회 대상의 이메일: ");

        // 수정 대상을 탐색
        Member member = mr.findMemberByEmail(email);

        // 회원 탐색
        if (member != null) {
//            System.out.printf("# %s님의 정보 : \n", member.memberName);
//            System.out.printf("# 이메일 : %s\n", member.email);
//            System.out.printf("# 패스워드 : %s\n", member.password);
//            System.out.printf("# 아아디 : %s\n", member.memberId);
//            System.out.printf("# 이름 : %s\n", member.memberName);
//            System.out.printf("# 성별 : %s\n", member.gender);
//            System.out.printf("# 나이 : %s\n", member.age);
//            System.out.printf("# 가입일자 : %s\n", member.regDate);
            member.showDetailInfo();
        } else {
            System.out.println("# 이메일과 일치한 회원이 없습니다!");
            stop();
        }
        stop();

    }

    private void changePassword() {
        // 이메일을 입력받음
        String email = input("# 수정 대상의 이메일: ");

        // 수정 대상을 탐색
        Member member = mr.findMemberByEmail(email);

        // 회원이 탐색됨
        if (member != null) {
            System.out.printf("# %s님의 비밀번호를 변경합니다.\n", member.memberName);
            String newPaddword = input("# 새로운 비밀번호 : ");

            // 새 비밀번호가 기존 비밀번호과 같은경우 pass
            if (member.password.equals(newPaddword)) {
                System.out.println("# 기존 비밀번호와 동일합니다. 변경을 취소합니다.");
                stop();
                return;
            }
            mr.updatePassword(newPaddword, email);
            System.out.println("# 비밀변호 변경 성공");
        } else {
            System.out.println("\n# 조회 결과가 없습니다.");
        }
        stop();
    }

    // 회원가입 입출력을 처리하는 메서드
    void SignUp() {

        String email = checkDuplicateEmailInput();
        String name = input("# 이름 : ");
        String pw = input("# 패스워드 : ");
        Gender gender = checkCorrectGenderInput();
        String age = input("# 나이 : ");

        // 실제 배열에 저장 명령
        // 랜덤 아이디 생성 (1 ~ 999999)
        int randomId = (int) Math.floor(Math.random() * 999999) + 1;

        Member newMember = new Member(randomId, email, pw, name, gender, Integer.parseInt(age));
        mr.addMember(newMember);

        System.out.println("# 회원가입 성공!");
        stop();
    }

    private Gender checkCorrectGenderInput() {
        while (true) {
            String inputGender = input("# 성별(M/F) : ");
            switch (inputGender.toUpperCase()) {
                case "M":
                    return Gender.MALE;
                case "F":
                    return Gender.FEMALE;
                default:
                    System.out.println("# 성별을 M 또는 F로 입력하세요.");
            }
        }
    }

    private String checkDuplicateEmailInput() {
        while (true) {
            String email = input("# 이메일 : ");
            if (!mr.isDuplicatedEmail(email)) {
                return email;
            }
            System.out.println("# 이메일이 중복되었습니다.");
        }
    }

    // 입력처리를 간편하게 해주는 메서드
    public String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    // 엔터를 누르기전까지 멈추는 기능
    void stop() {
        System.out.println("\n======= 엔터를 눌러서 계속…======");
        sc.nextLine();
    }
}


