package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class MemberDTO {
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
}
