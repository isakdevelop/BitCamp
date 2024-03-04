package service;

import model.Member;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(Scanner sc);
    String login();
    String addUsers();
    Member findUser(String name);
    Map<String, Member> getUserMap();
    String count();
}
