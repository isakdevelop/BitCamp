package kaupOOP;

import java.util.Scanner;

public class KaupTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();

        person.createRandomHeight();
        person.createRandomWeight();
        person.setName(sc.next());
        person.createBmi();
        person.createBodyMass();

        System.out.println("===============BMI 계산기===============");
        System.out.println("이름은 " + person.getName());
        System.out.println("키는 " +  person.getHeight());
        System.out.println("몸무게는 " + person.getWeight());
        System.out.printf("BMI 지수는 %.1f", person.getBmi());
        System.out.println();
        System.out.println("당신의 비만도는 " + person.getBodyMass() + "입니다.");
        System.out.println("===============BMI 계산기===============");
        System.out.println();
    }
}



