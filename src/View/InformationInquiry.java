package View;

import Controller.Controller;

public class InformationInquiry {
    private Controller controller;

    public InformationInquiry(Controller controller)    {
        this.controller = controller;

        System.out.println("내 정보를 조회합니다.");
    }

    public void InformationInquiryResult(String name, String id, String password, String phone, String address)  {
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
        System.out.println("전화 번호 : " + phone);
        System.out.println("주 소 : " + address + "입니다.");
        System.out.println();
    }
}
