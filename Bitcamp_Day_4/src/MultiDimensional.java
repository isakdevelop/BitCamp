import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("다음 시험에서 두 개 반의 평균 점수를 구하시오");
        //System.out.println("시험에 응시한 학생 수는 몇 명 입니까? : ");

        System.out.println("1반에서 시험에 응시한 학생 수는 몇 명입니까?");
        int numberOfStudent = sc.nextInt();

        System.out.println("2반에서 시험에 응시한 학생 수는 몇 명입니까?");
        int numberOfStudent2 = sc.nextInt();

        int[] scores = new int[numberOfStudent];
        int[] scores2 = new int[numberOfStudent2];

        int sum = 0, sum2 = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("1반 " + (i + 1) + "번째 학생의 점수 입력 : ");
            scores[i] = sc.nextInt();
            sum += scores[i];
        }

        for (int j = 0; j < scores.length; j++) {
            System.out.println("2반 " + (j + 1) + "번째 학생의 점수 입력 : ");
            scores2[j] = sc.nextInt();
            sum2 += scores2[j];
        }

        double avg = ((double)sum / numberOfStudent), avg2 = ((double)sum2 / numberOfStudent2);

        System.out.println("1반의 평균 점수 : " + avg + "점 이다.");
        System.out.println("2반의 평균 점수 : " + avg2 + "점 이다.");
    }
}
