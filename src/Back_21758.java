//import java.util.Scanner;
//
//public class Back_21758 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int input = sc.nextInt();
//        int[] honeyPlaces = new int[input];
//
//        for (int i = 0; i < input; i++) {
//            honeyPlaces[i] = sc.nextInt();
//        }
//
//        int maxHoney = 0;
//        int sum = 0;
//
//
//        /*
//         * 꿀통이 배열 끝에 있는 경우
//         * */
//        for (int i = 0; i < honeyPlaces.length; i++) {
//            for (int j = 0; j < honeyPlaces.length; j++) {
//                //bee1 = i;
//                //bee2 = j;
//                if (i == j) {
//                    continue;
//                }
//                sum = 0;
//                for (int k = 0; k < honeyPlaces.length-1; k++) {
//                    if (k != i && k != j) {
//                        sum += honeyPlaces[k];
//                    }
//                }
//            }
//            maxHoney = Math.max(maxHoney, sum);
//        }
//        System.out.println(maxHoney);
//    }
//}
