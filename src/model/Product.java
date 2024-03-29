package model;

import lombok.*;

@NoArgsConstructor
@Getter
@ToString(exclude = {"id"})

public class Product {
    private int id;
    private int pno; //1씩 자동 증가 즉 i값
    private String name;
    private String company;
    private int price;

    @Builder(builderMethodName = "builder")
    public Product(int id, int pno, String name, String company, int price) {
        this.id = id;
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;
    }
}
