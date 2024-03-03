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
                            .build());
        }
        return null;
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("id, 비밀번호, 비밀번호 확인, 이름, 주민 번호," +
                " 전화 번호, 주소, 직업을 나누어 입력해주세요.");

//        MemberDTO member = new MemberBuilder()
//                .userName(sc.next())
//                .password(sc.next())
//                .confirmPassword(sc.next())
//                .name(sc.next())
//                .socialSecurityNumber(sc.next())
//                .tell(sc.next())
//                .address(sc.next())
//                .job(sc.next())
//                .build();

        String userName = sc.next();
        users.put(userName,
                new MemberBuilder()
                        .userName(userName)
                        .password(sc.next())
                        .confirmPassword(sc.next())
                        .name(sc.next())
                        .socialSecurityNumber(sc.next())
                        .tell(sc.next())
                        .address(sc.next())
                        .job(sc.next())
                        .build());
        return "회원 가입을 축하드립니다!";
    }

    @Override
    public String login(MemberDTO user, Scanner sc) {
        System.out.print("아이디를 입력해주세요\n입력 : ");
        String userName = sc.next();

        user = users.get(userName);
        if (user != null) {
            // System.out.println(user.getUserName());
            System.out.print("비밀번호를 입력해주세요\n입력 : ");
            String password = sc.next();

            if (password.equals(user.getPassword()))   {
                System.out.println("로그인에 성공하셨습니다!");
            } else {
                System.out.println("비밀번호가 일치하지 않습니다.");
            }
        } else {
            System.out.println("존재하지 않는 사용자입니다.");
        }

        return "연습";
    }

    @Override
    public MemberDTO findUserById(String userName) {
        return null;
    }

    @Override
    public void updatePassword(MemberDTO user) {

    }

    @Override
    public String deleteUse(String userName) {
        return null;
    }

    @Override
    public List<MemberDTO> getUserList() {
        return new ArrayList<>(users.values());
    }

    @Override
    public List<MemberDTO> findUsersByName() {
        return null;
    }

    @Override
    public List<MemberDTO> findUserByJob() {
        return null;
    }
}
