import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        ArrayTest2 at = new ArrayTest2();
        Scanner sc = new Scanner(System.in);
        //
        //        String input = null;
        //
        //        for (int i = 1; i <= 2; i++) {
        //            System.out.print(i + "번째 자연수를 입력하여 주세요 : ");
        //            input = sc.next();
        //            System.out.println("입력 값 : " + at.showNum(input));
        //        }
        //    }
        //
        //    int showNum(String n)   {
        //        return Integer.parseInt(n);
        //    }

        int []array = new int[2];

        System.out.print("자연수를 입력하여 주세요 : ");

        for(int i = 0; i < 2; i++)  {
            array[i] = sc.nextInt();
        }

        System.out.print("입력한 수는 ");

        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println("입니다.");
    }
}
