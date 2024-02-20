package gradeOOP;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentScores studentScores = new StudentScores();

        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.print("이름 : ");
        studentScores.setName(sc.next());

        System.out.print("국어점수 : ");
        studentScores.setKoreanScore(sc.nextInt());

        System.out.print("영어점수 : ");
        studentScores.setEnglishScore(sc.nextInt());

        System.out.print("수학점수 : ");
        //studentScores.setMathScore(sc.nextInt());
        studentScores.createMathScore();

        System.out.println("평균 점수를 구하시오");
        studentScores.createAvgOfScores();


        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : " + studentScores.getName());
        System.out.println("국어점수 : " + studentScores.getKoreanScore());
        System.out.println("영어점수 : " + studentScores.getEnglishScore());
        System.out.println("수학점수 : " + studentScores.getMathScore());
        System.out.printf("평균 점수: %.1f", studentScores.getAvgOfScores());
    }
}
