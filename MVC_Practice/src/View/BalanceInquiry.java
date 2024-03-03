package View;

import Controller.Controller;

import java.util.Scanner;

public class BalanceInquiry {
    private Controller controller;

    public BalanceInquiry(Controller controller)    {
        this.controller = controller;

        Scanner sc = new Scanner(System.in);

        int [] balances = controller.requestAllBalances();
        resultBalanceInquiry(balances[0], balances[1], balances[2], balances[3], balances[4]);
    }

    public void resultBalanceInquiry(int krBalance, int jpBalance, int cnBalance, int usaBalance, int euBalance) {
        System.out.println("잔액 조회입니다.");
        System.out.println("고객님의 잔액");

        System.out.println("한화 잔액은 " + krBalance + "₩ 입니다.");
        System.out.println("엔화 잔액은 " + jpBalance + "¥ 입니다.");
        System.out.println("위안 잔액은 " + cnBalance + "元 입니다.");
        System.out.println("달러 잔액은 " + usaBalance + "$ 입니다.") ;
        System.out.println("유로 잔액은 " + euBalance + "€ 입니다.");
        System.out.println();
    }
}
