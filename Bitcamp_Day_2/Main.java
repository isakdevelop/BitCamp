import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator cal = new Calculator();

        System.out.println("숫자 2가지를 입력해 주세요.");

        System.out.print("첫 번째 숫자 : ");
        String num1 = sc.next();
        int parseNum1 = Integer.parseInt(num1);

        /* 사실 num1의 선언을 int num1 = sc.nextInt()로 하면 되지만 int 자료형을 배우지 않았기에
        사용하지 않았으면 좋겠다고 하셨다.*/

        System.out.print("두 번째 숫자 : ");
        String num2 = sc.next();
        int parseNum2 = Integer.parseInt(num2);

        cal.Addition(parseNum1,parseNum2);

        //System.out.println(num1);
        //System.out.println(num2);
    }
}

