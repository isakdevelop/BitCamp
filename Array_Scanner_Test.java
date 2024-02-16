import java.util.Scanner;

public class Array_Scanner_Test {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력된 수 중에서 큰 수를 구하시오.");
        int[] arr = new int[2];

        for(int i = 0; i < 2; i++) {
            System.out.println("자연수 입력 :");
            String num = sc.next();
            arr[i] = Integer.parseInt(num);
        }

        System.out.println("첫 번째 수 : " + arr[0]);
        System.out.println("두 번째 수 : " + arr[1]);

        if(arr[0] > arr[1]) {
            System.out.println("입력한 값 중 최대값은 " + arr[0] + "이다.");
        } else {
            System.out.println("입력한 값 중 최대값은 " + arr[1] + "이다.");
        }
    }
}
