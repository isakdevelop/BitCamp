package controller;

import model.Account;
import service.AccountService;
import serviceimpl.AccountServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class AccountController {
    AccountService accountService;
    LocalDate localDate;

    public AccountController()  {
        accountService = AccountServiceImpl.getInstance();
        localDate = LocalDate.now();
    }
    public String createAccount(Scanner sc) {
        System.out.println("사용자의 계좌번호, 성명을 입력하여 주세요.");

        return accountService.createAccount(
                Account.builder()
                        .accountNumber(sc.next())
                        .accountHolder(sc.next())
                        .balance(0)
                        .transactionDate(localDate)
                        .returnType(null)
                        .build());
    }

    public String deposit(Scanner sc) {
        System.out.println("입금을 실행합니다.\n입금 하실 계좌 번호와 " +
                "금액을 입력해주세요.");
        return accountService.deposit(sc.next(), sc.nextDouble());

    }

    public String withdraw(Scanner sc) {
        System.out.println("출금을 실행합니다.\n입금 하실 계좌 번호와 " +
                "금액을 입력해주세요.");
        return accountService.withdraw(sc.next(), sc.nextDouble());
    }

    public String historyOfBalance(Scanner sc) {
        System.out.println("계좌 번호를 입력해주세요.");

        StringBuilder balance = new StringBuilder();
        accountService.historyOfBalance(sc.next()).forEach(account -> {
            String output = String.format("%s : %.0f\n", account.getReturnType(), account.getBalance());
                balance.append(output);
        });

        return balance.toString();
    }

    public String cancelAccount(Scanner sc) {
        System.out.println("계좌 번호를 입력해주세요.");
        return accountService.cancelAccount(sc.next());
    }

    public String getBalance(Scanner sc)    {
        System.out.println("계좌 번호를 입력해주세요.");
        return accountService.getBalance(sc.next());
    }
}
