package kaupOOP;

import memberOOP.Member;

import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Member person = new Member(returnRandomHeight(), returnRandomWeight());

        KaupService service = new KaupServiceImpl();
        double bmi = service.createBmi(person.getHeight(), person.getWeight());
        String bodyMass = service.createBodyMass(bmi);

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

    static double returnRandomHeight()    {
        return Math.floor(((150 + Math.random() * 50) * 10) / 10);
    }

    static double returnRandomWeight()  {
        return Math.floor(((30 + Math.random() * 70) * 10) / 10);
    }

}
