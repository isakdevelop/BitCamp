package serviceimpl;

import builder.MemberBuilder;
import model.MemberDTO;
import service.UserService;
import service.UtilService;

import java.util.*;

public class UserServiceImpl implements UserService {
    UtilService utilService = UtilServiceImpl.getInstance();
    private static UserService instance = new UserServiceImpl();
    Map<String, MemberDTO> users;
    private UserServiceImpl()   {
        this.users = new HashMap<>();
    }

    public static UserService getInstance() {
        return instance;
    }

    @Override
    public String addUsers() {
        for (int i = 0; i < 5; i++) {
            String userName = utilService.createRandomUserName();
            users.put(userName,
                    new MemberBuilder()
                            .userName(userName)
                            .password("1")
                            .confirmPassword("1")
                            .name(utilService.createRandomName())
                            .job("인간")
                            .build());
        }
        return null;
    }

    @Override
    public String join(MemberDTO user) {
        users.put(user.getUserName(), user);
        return "회원 가입을 축하드립니다!";
    }

    @Override
    public String login(MemberDTO user, Scanner sc) {
//        String msg = "";                  // 강사님 코드
//        MemberDTO userInMap = users.get(user.getUserName());
//        if (userInMap == null)  {
//            msg = "존재하지 않는 사용자";
//        } else {
//            if (userInMap.getPassword().equals(sc.next()))  {
//                msg = "로그인 성공";
//            }   else {
//                msg = "비밀번호 불일치";
//            }
//        }
        System.out.print("아이디를 입력해주세요.\n" +
                "입력 : ");
        String userName = sc.next();

        user = users.get(userName);
        if (user != null) {
            System.out.print("비밀번호를 입력해주세요.\n" +
                    "입력 : ");
            String password = sc.next();

            if (password.equals(user.getPassword()))   {
                return "로그인에 성공하셨습니다!";
            } else {
                return "비밀번호가 일치하지 않습니다.";
            }
        } else {
            return "존재하지 않는 사용자입니다.";
        }
        //return msg;
    }

    @Override

    public MemberDTO findUserById(MemberDTO user, String userName) {
        if (users.containsKey(userName))    {
            user = users.get(userName);

        }

        return user;
    }

    @Override
    public String updatePassword(MemberDTO user, Scanner sc) {
        String UserName = sc.next();
        user = users.get(UserName);

        if (user != null)   {
            System.out.print("변경하실 비밀번호를 입력하세요.\n" +
                    "입력 : ");
            String updatePassword = sc.next();
            user.setPassword(updatePassword);

            return "비밀번호 변경이 완료되었습니다.";
        } else {
            return "존재하지 않는 사용자입니다.";
        }
    }

    @Override
    public String deleteUser(String userName) {
        users.remove(userName);
        return "회원 삭제가 완료되었습니다.";
    }

    @Override
    public List<MemberDTO> getUserList() {
        List<MemberDTO> user = new ArrayList<>(users.values());
        return user;
    }

    @Override
    public List<MemberDTO> findUsersByName(String name) {
        List<MemberDTO> userList = new ArrayList<>();
        for (MemberDTO user : users.values()) {
            if (user.getName().equals(name)) {
                userList.add(user);
            }
        }
        return userList;
    }

    @Override
    public List<MemberDTO> findUserByJob(String job) {
        List<MemberDTO> userList = new ArrayList<>();
        for (MemberDTO user : users.values())   {
            if (user.getJob().equals(job))  {
                userList.add(user);
            }
        }
        return userList;
    }

    @Override
    public String count() {
        return users.size() + "";
    }
}


