package model;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class AccountDTO {
    private long id;
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private LocalDate transactionDate;
    private String returnType;
}