package service;

import model.Member;

public interface KaupService {

    public String createBmi(Member user);

    public String createBodyMass(String bmi);
}
