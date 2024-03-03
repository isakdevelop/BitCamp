package view;

import builder.MemberBuilder;
import model.MemberDTO;
import service.UtilService;
import serviceimpl.UtilServiceImpl;

import java.util.Scanner;

public class JoinView {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("id, 비밀번호, 비밀번호 확인, 이름, 주민 번호," +
                " 전화 번호, 주소, 직업을 나누어 입력해주세요.");

        UtilService utilService = UtilServiceImpl.getInstance();

        MemberDTO member = new MemberBuilder()
                .userName(sc.next())
                .password(sc.next())
                .confirmPassword(sc.next())
                .name(sc.next())
                .socialSecurityNumber(sc.next())
                .tell(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build();

        System.out.println(member.toString());
        System.out.println();
    }
}
