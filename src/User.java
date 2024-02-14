import java.util.Scanner;

public class User {
    static String ID, password, name, identification_number, tell, address;

    public User() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디 : ");
        User.ID = scanner.next();

        System.out.print("비밀번호 : ");
        User.password = scanner.next();

        System.out.print("이름 : ");
        User.name = scanner.next();

        System.out.print("주민등록번호 : ");
        User.identification_number = scanner.next();

        System.out.print("전화번호 : ");
        User.tell = scanner.next();

        System.out.print("주소 : ");
        User.address = scanner.next();
    }

    public static void getUserInformation() {
        System.out.println("아이디 : " + ID);
        System.out.println("비밀번호 : " + password);
        System.out.println("이름 : " + name);
        System.out.println("주민등록번호 : " + identification_number);
        System.out.println("전화번호 : " + tell);
        System.out.println("주소 : " + address);
    }
}
