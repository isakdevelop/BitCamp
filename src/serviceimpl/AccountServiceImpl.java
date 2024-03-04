package serviceimpl;

import model.Account;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    List<Account> list;
    List<Account> balanceHistory;

    long id;

    public AccountServiceImpl() {
        list = new ArrayList<>();
        balanceHistory = new ArrayList<>();
        id = 0;
    }
    private static AccountService instance = new AccountServiceImpl();

    public static AccountService getInstance() {
        return instance;
    }
    @Override
    public String createAccount(Account account) {
        list.add(account);

        return "회원가입 완료";
    }

    @Override
    public String deposit(String accountNumber, double amount) {
        for (Account account : list) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.setBalance(account.getBalance() + amount);

                balanceHistory.add(
                        Account.builder()
                                .accountNumber(accountNumber)
                                .accountHolder(account.getAccountHolder())
                                .balance(amount)
                                .returnType("입금")
                                .build());

                return "입금 완료";
            }
        }
        return "계좌번호를 찾을 수 없습니다.";
    }

    @Override
    public String withdraw(String accountNumber, double amount) {
        for (Account account : list) {
            if (account.getAccountNumber().equals(accountNumber))   {
                if (account.getBalance() - amount >= 0) {
                    balanceHistory.add(
                            Account.builder()
                                    .accountNumber(accountNumber)
                                    .accountHolder(account.getAccountHolder())
                                    .balance(amount)
                                    .returnType("출금")
                                    .build());

                    return "출금 완료";
                }   else {
                    return "잔액 부족";
                }
            }
        }
        return "존재하지 않는 계좌번호";
    }

    @Override
    public String getBalance(String accountNumber) {
        for (Account account : list)  {
            if (account.getAccountNumber().equals(accountNumber))    {
                return account.getBalance() + "";
            }
        }
        return "계좌 정보가 존재 하지 않습니다.";
    }

    @Override
    public List<Account> historyOfBalance(String accountNumber) {
        for (Account account : balanceHistory)    {
            if (account.getAccountNumber().equals(accountNumber))    {
                return balanceHistory;
            }
        }
        return balanceHistory;
    }

    @Override
    public String cancelAccount(String accountNumber) {
        for (Account account : list)  {
                if (account.getAccountNumber().equals(accountNumber))    {
                list.remove(account);
                balanceHistory.remove(account);

                return "계좌 삭제가 완료되었습니다.";
            }
        }
        return "계좌가 존재하지 않습니다.";
    }
}
