package service;

import model.MemberDTO;

public interface KaupService {

    public String createBmi(MemberDTO user);

    public String createBodyMass(String bmi);
}
