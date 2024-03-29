package model;

import lombok.*;

@NoArgsConstructor
@Getter
@ToString(exclude = {"height", "weight"})

public class Member {
    private double height;
    private double weight;
    private String userName;
    private String password;
    private String confirmPassword;
    private String name;
    private String socialSecurityNumber;
    private String tell;
    private String address;
    private String job;

    @Builder(builderMethodName = "builder")

    public Member(double height, double weight, String userName, String password, String confirmPassword, String name, String socialSecurityNumber, String tell, String address, String job) {
        this.height = height;
        this.weight = weight;
        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.tell = tell;
        this.address = address;
        this.job = job;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
