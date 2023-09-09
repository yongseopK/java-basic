package day03.member;

public class Test {
    public static void main(String[] args) {
        MemberRepository mr = new MemberRepository();

        Member thief = new Member(4, "ttt@yyy.com", "9999", "밥도둑", Gender.MALE, 11);

        mr.addMember(thief);

        mr.showMembers();

        System.out.println("==================");

        String email = "ttt@yyy.om";
        boolean flag1 = mr.isDuplicatedEmail(email);
        System.out.println("flag1 = " + flag1);

        Member foundMember = mr.findMemberByEmail(email, false);
        try {
            System.out.println("foundMember.inform() = " + foundMember.inform());
        } catch (NullPointerException e) {
            System.out.println("해당 이메일을 가진 유저는 없음");
        }


        mr.deleteMember(email, false);
        mr.deleteMember("xxx@vvv.com", false);


        mr.showMembers();
        mr.printRemoveMembers();
    }


}
