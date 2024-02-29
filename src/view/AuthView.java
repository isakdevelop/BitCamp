package view;

import builder.MemberBuilder;
import controller.AuthController;
import model.MemberDTO;
import service.AuthService;
import serviceimpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthView {
    public static void main(Scanner sc) {
        AuthController controller = new AuthController();
        controller.addUsers();
        AuthService authService = AuthServiceImpl.getInstance();
        String mas = authService.addUsers();
        System.out.println(mas);
        while (true)    {
            System.out.println("\n[메뉴]\n" +
                    "0. 종료\n" +
                    "1. ID 검색\n" +
                    "2. 회원목록\n" +
                    "3. 회원 수\n");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":

                    break;
                case "2":
                    System.out.println("=== 회원 목록 ===");
                    controller.getUserMap();
                    break;
                case "3":
                    System.out.println("=== 회원 수 ===");
                    System.out.println(controller.count());
                    break;
                case "6":
                    System.out.println("6. 회원목록");
                    Map<String, MemberDTO> users = controller.getUserMap();
                    users.forEach((k, v) -> {
                        System.out.printf("아이디 : %s, 회원 정보 : %s",k,v);
                    });
            }
        }
    }
}
