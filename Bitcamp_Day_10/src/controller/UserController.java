package controller;

import model.MemberDTO;
import service.UserService;
import serviceimpl.UserServiceImpl;

import java.util.Scanner;


public class UserController {
    UserService userService;
    MemberDTO member;

    public UserController() {
        this.userService = UserServiceImpl.getInstance();
    }

    public String join(Scanner sc)    {
        return userService.join(sc);
    }

    public String login(Scanner sc) {
        return userService.login(member, sc);
    }
    public String addUsers() {
        return userService.addUsers();
    }

    public <MemberDTO> String getUserList()    {
        return userService.getUserList().toString();
    }
}