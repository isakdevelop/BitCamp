package service;

import model.MemberDTO;

import java.util.List;
import java.util.Scanner;

public interface UserService {
    String addUsers();

    String join(Scanner sc);
    String login(MemberDTO user, Scanner sc);
    MemberDTO findUserById(String userName);
    void updatePassword(MemberDTO user);
    String deleteUse(String userName);
    List<MemberDTO> getUserList();
    List<MemberDTO> findUsersByName();
    List<MemberDTO> findUserByJob();
}
