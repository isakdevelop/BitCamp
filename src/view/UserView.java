package view;

import controller.UserController;
import model.MemberDTO;

import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc)    {
        UserController controller = new UserController();
        controller.addUsers();
        while (true)    {
            System.out.println("[메뉴]\n" +
                    "0. 종료\n" +
                    "1. 회원 가입\n" +
                    "2. 로그인\n" +
                    "3. ID 검색\n" +
                    "4. 비번 변경\n" +
                    "5. 회원 탈퇴\n" +
                    "6. 회원 목록\n" +
                    "7. 이름 검색\n" +
                    "8. 직업 검색\n" +
                    "9. 회원 수");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("=== 회원 가입 ===");
                    System.out.println(controller.join(sc));
                    System.out.println();
                    break;
                case "2":
                    System.out.println("=== 로그인 ===");
                    controller.login(sc);
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    System.out.println("=== 회원 목록 ===");

                    break;
                case "7":
                    break;
                case "8":

                    break;
                case "9":

                    break;
            }
        }
    }
}
