package view;

import builder.MemberBuilder;
import model.MemberDTO;
import service.KaupService;
import service.UtilService;
import serviceimpl.KaupServiceImpl;
import serviceimpl.UtilServiceImpl;


public class KaupView {
    public static void main() {
        UtilService utilService = UtilServiceImpl.getInstance();
        MemberDTO person = new MemberBuilder()
                .height(utilService.createRandomDouble(150,50))
                .weight(utilService.createRandomDouble(30,70))
                .build();
        KaupService service = KaupServiceImpl.getInstance();

        String bmi = service.createBmi(person);
        String bodyMass = service.createBodyMass(bmi);

        System.out.printf("================= BMI 계산기 =================\n" +
                        "BMI: %s\n"+
                        "bodyMass: %s\n"+
                        "================= BMI 계산기 ================="
                ,bmi,bodyMass);
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
