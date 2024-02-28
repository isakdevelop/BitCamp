package controller;

import builder.MemberBuilder;
import model.MemberDTO;
import service.UserService;
import serviceimpl.UserServiceImpl;

import java.util.List;
import java.util.Scanner;


public class UserController {
    UserService userService;
    MemberDTO member;

    public UserController() {
        this.userService = UserServiceImpl.getInstance();
    }

    public String addUsers() {
        return userService.addUsers();
    }

    public String join(Scanner sc)    {
        System.out.println("id, 비밀번호, 비밀번호 확인, 이름, 주민 번호," +
                " 전화 번호, 주소, 직업을 나누어 입력해주세요.");
        return userService.join(new MemberBuilder()
                .userName(sc.next())
                .password(sc.next())
                .confirmPassword(sc.next())
                .name(sc.next())
                .socialSecurityNumber(sc.next())
                .tell(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build());
    }

    public String login(Scanner sc) {
        // System.out.println("로그인할 ID 입력 : ");   // 강사님 코드
        //        return authService.login(new UserBuilder()
        //                .username(scanner.next())
        //                .password(scanner.next())
        //                .build());
        return userService.login(member, sc);
    }

    public MemberDTO findUserById(Scanner sc)  {
        System.out.print("검색할 ID 입력 : ");

        return userService.findUserById(member, sc.next());
    }

    public String updatePassword(Scanner sc)    {
        System.out.print("사용자의 아이디를 입력해주세요.\n" +
                "입력 : ");
        return userService.updatePassword(member, sc);
    }

    public String deleteUser(Scanner sc)    {
        System.out.print("삭제하실 아이디를 입력해주세요.\n" +
                "입력 : ");
        return userService.deleteUser(sc.next());
    }

    public String getUserList()    {
        return userService.getUserList().toString();
    }

    public List<MemberDTO> findUserByName(Scanner sc)  {
        System.out.print("사용자 이름을 입력하세요.\n" +
                "입력 : ");
        return userService.findUsersByName(sc.next());
    }

    public List<MemberDTO>findUserByJob(Scanner sc) {
        System.out.print("직업을 입력하세요.\n" +
                "입력 : ");
        return userService.findUserByJob(sc.next());
    }

    public String count()   {
        return "회원 수 : " + userService.count() + "명";
    }
}