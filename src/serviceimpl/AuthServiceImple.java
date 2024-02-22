package serviceimpl;

import service.AuthService;
import service.UtilService;

public class AuthServiceImple implements AuthService {
    private static AuthService instance = new AuthServiceImple();
    private AuthServiceImple(){}
    public static AuthService getInstance() {
        return instance;
    }
    @Override
    public String login() {
        return null;
    }

    @Override
    public String join() {
        return null;
    }
}
