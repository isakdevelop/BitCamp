package view;

import builder.SubjectBuilder;
import model.SubjectDTO;
import service.GradeService;
import serviceimpl.GradeServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("국어 점수, 영어 점수, 수학 점수를 순서대로 입력해주세요.");
        SubjectDTO studentScores = new SubjectBuilder()
                .koreanScore(sc.nextInt())
                .mathScore(sc.nextInt())
                .englishScore(sc.nextInt())
                .build();
        GradeService gradeService = GradeServiceImpl.getInstance();

        System.out.println("다음은 한 학생의 과목 점수이다.");

        System.out.println(" ============= 성적표 ==============");
        System.out.println("국어점수 : " + studentScores.getKoreanScore());
        System.out.println("수학점수 : " + studentScores.getMathScore());
        System.out.println("영어점수 : " + studentScores.getEnglishScore());
        System.out.println("총 합 : " + gradeService.total(studentScores.getKoreanScore(), studentScores.getMathScore(), studentScores.getEnglishScore()));
        System.out.printf("평균 점수: %.1f", gradeService.Avg(studentScores.getKoreanScore(), studentScores.getMathScore(), studentScores.getEnglishScore()));
    }
}
