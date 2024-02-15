import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        int a = 3;
//        int [] array = {1, 2, 3, 4};
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//
//        //반복문을 사용하면
//
//        for (int i = 0; i <= 3; i++)   {
//            System.out.println(array[i]);
//        }

        int[] arr = new int[5];
        int index = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                if (index < arr.length) {
                    arr[index] = i;
                    index++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++)   {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        System.out.println("arr의 길이 : " + arr.length);


//        System.out.println("숫자 5개를 입력해주세요.");
//
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(sc.next());
//        }
//
//        for (int j : arr) {
//            System.out.println(j);
//        }

        //arr[0] = Integer.parseInt(sc.next());
        //arr[1] = Integer.parseInt(sc.next());


    }
}
