package memberOOP;

import java.util.Scanner;

public class MemberView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("id, 비밀번호, 비밀번호 확인, 이름, 주민 번호," +
                " 전화 번호, 주소, 직업을 나누어 입력해주세요.");
        Member member = new Member(sc.next(), sc.next(), sc.next(),
                sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
//
//        System.out.println("id를 입력해주세요");
//        member.setUserName(sc.next());
//
//        System.out.println("비밀번호를 입력해주세요");
//        member.setPassword(sc.next());
//
//        System.out.println("비밀번호를 한번 더 입력해주세요");
//        member.setRePassword(sc.next());
//
//        System.out.println("이름를 입력해주세요");
//        member.setName(sc.next());
//
//        System.out.println("주민번호를 입력해주세요");
//        member.setSocialSecurityNumber(sc.next());
//
//        System.out.println("전화번호를 입력해주세요");
//        member.setTell(sc.next());
//
//        System.out.println("주소를 입력해주세요");
//        member.setAddress(sc.next());
//
//        System.out.println("직업을 입력해주세요");
//        member.setJob(sc.next());

//        System.out.println("ID : " + member.getUserName());
//        System.out.println("비 번 : " + member.getPassword());
//        System.out.println("비번확인 : " + member.getRePassword());
//        System.out.println("이 름 : " + member.getName());
//        System.out.println("주민번호 : " + member.getSocialSecurityNumber());
//        System.out.println("전화번호 : " + member.getTell());
//        System.out.println("주 소 : " + member.getAddress());
//        System.out.println("직업 : " + member.getJob());

        System.out.println(member.toString());

    }
}