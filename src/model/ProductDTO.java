package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class ProductDTO {
    private int id;
    private int pno; //1씩 자동 증가 즉 i값
    private String name;
    private String company;
    private int price;
}
