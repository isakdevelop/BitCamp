package View;

import Controller.Controller;

import java.util.Scanner;

public class MainForm {
    private Controller controller;

    public MainForm(Controller controller)   {
        this.controller = controller;
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("안녕하세요. 비트은행입니다. 무엇을 도와드릴까요?");
        while (true) {
            System.out.println("1. 내 정보 조회");
            System.out.println("2. 내 정보 수정");
            System.out.println("3. 잔액 조회");
            System.out.println("4. 송 금");
            System.out.println("5. 환 전");
            System.out.println("6. 거래 내역 확인");
            System.out.println("7. 종 료");
            System.out.print("선택 : ");

            input = sc.nextInt();

            switch (input)  {
                case 1:
                    controller.requestInformationInquiry();
                    break;

                case 2 :
                    controller.requestUpdateUserInformation();
                    break;

                case 3:
                    controller.requestBalanceInquiry();
                    break;

                case 5:
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }

        }
    }
}
