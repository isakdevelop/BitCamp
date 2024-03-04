package serviceimpl;

import model.Member;
import service.AuthService;
import service.UtilService;

import java.util.*;

public class AuthServiceImpl implements AuthService {
    UtilService utilService = UtilServiceImpl.getInstance();

    private static AuthService instance = new AuthServiceImpl();

    Map<String, Member> users;

    List<Member> memberList;

    private AuthServiceImpl() {
        this.users = new HashMap<>();
        this.memberList = new ArrayList<>();
    }

    public static AuthService getInstance() {
            return instance;
    }
    @Override
    public String join(Scanner sc) {
        System.out.println("id, 비밀번호, 비밀번호 확인, 이름, 주민 번호," +
                " 전화 번호, 주소, 직업을 나누어 입력해주세요.");

        Member member = Member.builder()
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
        Map<String, Member> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            String userName = utilService.createRandomUserName();
            map.put(userName,
                    Member.builder()
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
    public Member findUser(String name) {
        Member user = Member.builder().build();
        if (name.equals(user.getName()))    {
            System.out.println(user);
            System.out.println("gd");
        }   else {
            System.out.println("존재하지않음");
        }
        return user;
    }

    @Override
    public Map<String, Member> getUserMap() {
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
