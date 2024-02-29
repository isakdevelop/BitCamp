package service;

import model.AccountDTO;

import java.util.List;

public interface AccountService {
    String createAccount(AccountDTO accountDTO);
    String deposit(String accountNumber, double amount);
    String withdraw(String accountNumber, double amount);
    String getBalance(String accountNumber);
    List<AccountDTO> historyOfBalance(String accountNumber);
    String cancelAccount(String accountNumber);
}
