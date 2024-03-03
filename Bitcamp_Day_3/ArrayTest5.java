import java.util.Scanner;

public class ArrayTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오.");

        System.out.println("시험에 응시한 학생 수는 몇 명 입니까?");
        int numberOfStudent = sc.nextInt();

        String[] names = new String[numberOfStudent];
        int[] scores = new int[numberOfStudent];

        for (int i = 0; i < numberOfStudent; i++) {
            System.out.print((i + 1) + "번째 학생의 이름을 입력하세요 : ");
            names[i] = sc.next();

            System.out.print((i + 1) + "번째 학생의 점수를 입력하세요 : ");
            scores[i] = sc.nextInt();
        }

        int maxScore = 0;
        String topStudent = "";

        for (int i = 0; i < numberOfStudent; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
                topStudent = names[i];
            }
        }

        System.out.println("응시생 중에 1등의 이름은 " + topStudent + "이고, 점수는 " + maxScore + "점이다.");
    }
}
