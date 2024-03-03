package serviceimpl;

import service.KaupService;
import service.UtilService;

public class KaupServiceImpl implements KaupService {

    private static KaupService instance = new KaupServiceImpl();
    private KaupServiceImpl(){}
    public static KaupService getInstance() {
        return instance;
    }
    @Override
    public double createHeight() {
        return Math.floor(((150 + Math.random() * 50) * 10) / 10);
    }

    @Override
    public double createWeight() {
        return Math.floor(((30 + Math.random() * 70) * 10) / 10);
    }

    @Override
    public double createBmi(double height, double weight) {
        double bmi = 0;
        bmi = weight / ((height / 100) * (height / 100));

        return bmi;
    }

    @Override
    public String createBodyMass(double bmi) {
        String bodyMass = "";

        if (bmi < 18.5) {
            bodyMass = "저체중";
        }

        if (bmi > 18.5 && bmi < 23) {
            bodyMass = "정상";
        }

        if (bmi > 23 && bmi < 25)   {
            bodyMass = "과체중";
        }

        if (bmi > 25)   {
            bodyMass = "비만";
        }

        return bodyMass;
    }
}
