package serviceimpl;

import model.MemberDTO;
import service.KaupService;

public class KaupServiceImpl implements KaupService {

    private static KaupService instance = new KaupServiceImpl();
    private KaupServiceImpl(){}
    public static KaupService getInstance() {
        return instance;
    }

    @Override
    public String createBmi(MemberDTO user) {
        double height = user.getHeight();
        double weight = user.getWeight();
        double bmi = Math.round(weight / ((height / 100) * (height / 100)));

        return String.valueOf(bmi);
    }

    @Override
    public String createBodyMass(String bmi) {
        double calc = Double.parseDouble(bmi);
        String bodyMass = "";

        if (calc < 18.5) {
            bodyMass = "저체중";
        }

        if (calc > 18.5 && calc < 23) {
            bodyMass = "정상";
        }

        if (calc > 23 && calc < 25)   {
            bodyMass = "과체중";
        }

        if (calc > 25)   {
            bodyMass = "비만";
        }

        return bodyMass;
    }
}
