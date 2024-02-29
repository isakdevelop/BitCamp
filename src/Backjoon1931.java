import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Backjoon1931 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] times = new int[sc.nextInt()][2];

        int cnt = 0;
        int prev_end_time = 0;

        for(int i = 0; i < times.length; i++) {
            times[i][0] = sc.nextInt();
            times[i][1] = sc.nextInt();
        }

        Arrays.sort(times, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        });


        for(int i = 0; i < times.length; i++) {
            if (prev_end_time <= times[i][0]) {
                prev_end_time = times[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
