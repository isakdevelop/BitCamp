package controller;

import model.Member;
import service.AuthService;
import serviceimpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController implements AuthService{
    AuthService authService;

    public AuthController() {
        this.authService = AuthServiceImpl.getInstance();
    }

    public String join(Scanner sc) {

        return authService.join(sc);
    }

    @Override
    public String login() {
        return null;
    }

    public String login(Scanner sc) {
        return authService.join(sc);
    }

    public String addUsers() {
        return authService.addUsers();
    }

    public Member findUser(String name) {
        return authService.findUser(name);
    }

    public Map<String, Member> getUserMap()  {
        return authService.getUserMap();
    }

    @Override
    public String count() {
        return "회원 수 : " + authService.count() + "명";
    }

}
