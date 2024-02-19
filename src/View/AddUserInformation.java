package View;

import Controller.Controller;

import java.util.Scanner;

public class AddUserInformation {
    private Controller controller;

    public AddUserInformation(Controller controller)  {
        this.controller = controller;
        Scanner sc = new Scanner(System.in);

        String name, id, password, phone, address;

        System.out.println("사용자 정보가 존재하지 않아 사용자 정보를 추가합니다.");
        System.out.println("아래의 항목을 입력하여 주세요.");

        System.out.print("이 름 : ");
        name = sc.next();

        System.out.print("아이디 : ");
        id = sc.next();

        System.out.print("비밀 번호 : ");
        password = sc.next();

        System.out.print("전화 번호 : ");
        phone = sc.next();

        System.out.println("주 소 : ");
        address = sc.nextLine();
        sc.next();

        controller.updateId(id);
        controller.updateName(name);
        controller.updatePassword(password);
        controller.updatePhone(phone);
        controller.updateAddress(address);
    }
}
