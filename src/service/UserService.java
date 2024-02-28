package service;

import model.MemberDTO;

import java.util.List;
import java.util.Scanner;

public interface UserService {
    String addUsers();
    String join(MemberDTO user);
    String login(MemberDTO user, Scanner sc);
    MemberDTO findUserById(MemberDTO user, String userName);
    String updatePassword(MemberDTO user, Scanner sc);
    String deleteUser(String userName);
    List<MemberDTO> getUserList();
    List<MemberDTO> findUsersByName(String name);
    List<MemberDTO> findUserByJob(String job);
    String count();
}
