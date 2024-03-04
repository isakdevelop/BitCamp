package service;

import model.Account;

import java.util.List;

public interface AccountService {
    String createAccount(Account account);
    String deposit(String accountNumber, double amount);
    String withdraw(String accountNumber, double amount);
    String getBalance(String accountNumber);
    List<Account> historyOfBalance(String accountNumber);
    String cancelAccount(String accountNumber);
}
