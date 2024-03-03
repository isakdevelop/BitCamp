import java.util.Scanner;

public class SwithTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 2가지를 입력해 주세요.");

        System.out.print("첫 번째 숫자 : ");
        String num1 = sc.next();

        System.out.print("두 번째 숫자 : ");
        String num2 = sc.next();

        //System.out.println(num1);
        int parseNum1 = Integer.parseInt(num1);
        int parseNum2 = Integer.parseInt(num2);

        int parseResult = 0;

        //System.out.println(num2);

        System.out.println("연산기호(+, -, *, /)를 입력하세요.");

        //String result = num1 + num2;

        String opcode = sc.next();

//        if (opcode.equals("+")) {
//            parseResult = parseNum1 + parseNum2;
//        } else if (opcode.equals("-")) {
//            parseResult = parseNum1 - parseNum2;
//        } else if (opcode.equals("*")) {
//            parseResult = parseNum1 * parseNum2;
//        } else if (opcode.equals("/")) {
//            parseResult = parseNum1 / parseNum2;
//        } else {
//            System.out.println("잘못된 연산 기호입니다.");
//        }

        switch (opcode){
            case "+" :
                parseResult = parseNum1 + parseNum2;
                break;
            case "-" :
                parseResult = parseNum1 - parseNum2;
                break;
            case "*" :
                parseResult = parseNum1 * parseNum2;
                break;
            case "/" :
                parseResult = parseNum1 / parseNum2;
                break;
            default :
                System.out.println("잘못된 연산 기호입니다.");
        }

        System.out.println("연산결과 : " + parseResult);
    }
}
