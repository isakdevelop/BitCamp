package View;

import Controller.Controller;

import java.util.Scanner;

public class UpdateUserInformation {
    private Controller controller;

    public UpdateUserInformation(Controller controller)  {
        this.controller = controller;
        Scanner sc = new Scanner(System.in);

        int input;

        System.out.println("회원 정보 수정입니다.");
        System.out.println("수정 하실 회원 정보를 선택하여주세요.");
        System.out.println("1. 비밀 번호");
        System.out.println("2. 전화 번호");
        System.out.println("3. 주 소");
        System.out.print("입력 : ");

        input = sc.nextInt();

        if (input == 1) {
            String updatePassword;
            System.out.println("비밀 번호를 수정합니다.");
            System.out.println("수정하실 비밀번호를 입력하여주세요.");
            System.out.print("입력 : ");

            updatePassword = sc.next();
            controller.updatePassword(updatePassword);
            System.out.println("비밀 번호가 변경되었습니다. 감사합니다.");
        }

        if (input == 2) {
            String updatePhone;
            System.out.println("전화 번호를 수정합니다.");
            System.out.println("수정하실 전화번호를 입력하여주세요.");
            System.out.print("입력 : ");

            updatePhone = sc.next();
            controller.updatePhone(updatePhone);
            System.out.println("전화 번호가 변경되었습니다. 감사합니다.");
        }

        if (input == 3) {
            String updateAddress;
            System.out.println("주소를 수정합니다.");
            System.out.println("수정하실 주소를 입력하여주세요.");
            System.out.print("입력 : ");

            updateAddress = sc.nextLine();
            controller.updateAddress(updateAddress);
            System.out.println("주소가 변경되었습니다. 감사합니다.");
            System.out.println();
        }
    }
}
