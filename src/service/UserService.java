package service;

import model.Member;

import java.util.List;
import java.util.Scanner;

public interface UserService {
    String addUsers();
    String join(Member user);
    String login(Member user, Scanner sc);
    Member findUserById(Member user, String userName);
    String updatePassword(Member user, Scanner sc);
    String deleteUser(String userName);
    List<?> getUserList();
    List<?> findUsersByName(String name);
    List<?> findUserByJob(String job);
    String count();
}
