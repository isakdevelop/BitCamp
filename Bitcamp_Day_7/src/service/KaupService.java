package service;

public interface KaupService {
    public double createHeight();
    public double createWeight();

    public double createBmi(double height, double weight);

    public String createBodyMass(double bmi);
}
