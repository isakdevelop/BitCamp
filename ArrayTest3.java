import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        int max = 0;

        System.out.println("입력된 수 중에서 큰 수를 구하시오.");

        /* System.out.print("몇 개의 자연수를 입력하시겠습니까?");
           int input = sc.nextInt();
           int[] arr = new int[input];
        */

        for (int i = 0; i < arr.length; i++) {
            System.out.print("자연수를 입력하세요. : ");
            arr[i] = sc.nextInt();
            System.out.println(i + 1 + "번째 값은 : " + arr[i]);

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("최댓값은 " + max + "입니다.");
    }
}