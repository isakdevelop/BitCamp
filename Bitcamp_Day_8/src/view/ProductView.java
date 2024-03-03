package view;

import builder.ProductBuilder;
import model.ProductDTO;
import service.UtilService;
import serviceimpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductView {
    public static void main(String[] args) {
        List<ProductDTO> product = new ArrayList<>();
        UtilService utilService = UtilServiceImpl.getInstance();

        for (int i = 1; i < 5; i++) {
            product.add(new ProductBuilder()
                    .pno(i)
                    .name(utilService.createRandomName())
                    .company(utilService.createRandomCompany())
                    .price(utilService.createRandomInteger(0, 10000))
                    .build()
            );
        }

        product.forEach(i ->
                System.out.println(i.toString() ));
    }
}
