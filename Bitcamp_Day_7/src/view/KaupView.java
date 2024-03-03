package view;

import builder.MemberBuilder;
import model.MemberDTO;
import service.KaupService;
import service.UtilService;
import serviceimpl.KaupServiceImpl;
import serviceimpl.UtilServiceImpl;


public class KaupView {
    public static void main(String[] args) {
        UtilService utilService = UtilServiceImpl.getInstance();

        double h = utilService.createRandomDouble(150, 50);
        double w = utilService.createRandomDouble(30, 70);

        MemberDTO person = new MemberBuilder()
                .height(h)
                .weight(w)
                .build();
       KaupService service = KaupServiceImpl.getInstance();

        double bmi = service.createBmi(person.getHeight(), person.getWeight());
        String bodyMass = service.createBodyMass(bmi);

        System.out.printf("회원의 키 : %.1f cm", h);
        System.out.println();
        System.out.printf("회원의 몸무게 : %.1f kg", w);
        System.out.println();

        System.out.println("===============BMI 계산기===============");
        System.out.println("이름은 " + person.getName());
        System.out.println("키는 " +  person.getHeight());
        System.out.println("몸무게는 " + person.getWeight());
        System.out.printf("BMI 지수는 %.1f", bmi);
        System.out.println();
        System.out.println("당신의 비만도는 " + bodyMass + "입니다.");
        System.out.println("===============BMI 계산기===============");
        System.out.println();
    }
}
//
//MemberDTO person = new MemberBuilder()
//        .height(service.createHeight())
//        .weight(service.createWeight())
//        .build();
//double bmi = service.createBmi(person.getHeight(), person.getWeight());
//String bodyMass = service.createBodyMass(bmi);
