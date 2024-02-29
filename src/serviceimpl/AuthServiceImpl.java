package serviceimpl;

import builder.MemberBuilder;
import model.MemberDTO;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    UtilService utilService = UtilServiceImpl.getInstance();

    private static AuthService instance = new AuthServiceImpl();

    Map<String, MemberDTO> users;
    private AuthServiceImpl() {
        this.users = new HashMap<>();
    }

    public static AuthService getInstance() {
            return instance;
    }
    @Override
    public String join(Scanner sc) {
        System.out.println("id, 비밀번호, 비밀번호 확인, 이름, 주민 번호," +
                " 전화 번호, 주소, 직업을 나누어 입력해주세요.");

        MemberDTO member = new MemberBuilder()
                .userName(sc.next())
                .password(sc.next())
                .confirmPassword(sc.next())
                .name(sc.next())
                .socialSecurityNumber(sc.next())
                .tell(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build();

        return null;
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public String addUsers() {
        Map<String, MemberDTO> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            String userName = utilService.createRandomUserName();
            map.put(userName,
                    new MemberBuilder()
                            .userName(userName)
                            .password("1")
                            .confirmPassword("1")
                            .name(utilService.createRandomName())
                            .build());
        }
        users = map;
        return "5개 더미값 추가";
    }

    @Override
    public MemberDTO findUser(String name) {
        MemberDTO user = new MemberBuilder().build();
        if (name.equals(user.getName()))    {
            System.out.println(user);
            System.out.println("gd");
        }   else {
            System.out.println("존재하지않음");
        }
        return user;
    }

    @Override
    public Map<String, MemberDTO> getUserMap() {
        users.keySet().forEach(i->
            System.out.println(i));
        //users.get(sc.next());




        //users.forEach((k,v) ->System.out.println("{"+k+","+v+"},"));
        return users;
    }

    @Override
    public String count() {
        return users.size()+"";
    }


}
