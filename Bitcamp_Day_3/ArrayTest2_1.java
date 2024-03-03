import java.util.Scanner;

public class ArrayTest2_1 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[2];
        int max = 0;

        System.out.println("입력된 수 중에서 큰 수를 구하시오.");

        //System.out.print("몇 개의 자연수를 입력하시겠습니까?");
        //int input = sc.nextInt();

        for(int i = 0; i < 2; i++)  {   // 2 대신에 input을 넣으면 사용자 정의 값
            System.out.print("자연수를 입력하세요. : ");
            arr[i] = sc.nextInt();
            System.out.println(i+1 + "번째 값은 : " + arr[i]);
        }

        for(int i = 0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("큰 수는 " + max + "입니다.");
    }
}
