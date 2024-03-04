package view;

import model.Member;
import model.Subject;
import service.GradeService;
import service.UtilService;
import serviceimpl.GradeServiceImpl;
import serviceimpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        UtilService utilService = UtilServiceImpl.getInstance();
        GradeService gradeService = GradeServiceImpl.getInstance();

        System.out.println("이름을 입력해 주세요.");
        Member student = Member.builder()
                .name(sc.next())
                .build();

        System.out.println("국어 점수, 영어 점수, 수학 점수를 순서대로 입력해주세요.");
        Subject subjects = Subject.builder()
                .koreanScore(utilService.createRandomInteger(0,100))
                .mathScore(utilService.createRandomInteger(0, 100))
                .englishScore(utilService.createRandomInteger(0, 100))
                .build();

        int total = gradeService.total(subjects);
        double avg = gradeService.Avg(total);

//        System.out.printf("다음은 한 학생의 과목 점수이다.\n" +
//                " ============= 성적표 ==============\n" +
//                "이 름 : %s\n" +
//                "국어 점수 : %d\n" +
//                "수학 점수 : %d\n" +
//                "영어 점수 : %d\n" +
//                "총 합 : %d\n" +
//                "평균 점수 : %.1f",
//                student.getName(), subjects.getKoreanScore(), subjects.getMathScore(),
//                subjects.getEnglishScore(), total, avg);

        System.out.printf("다음은 한 학생의 과목 점수이다.\n" +
                        " ============= 성적표 ==============\n" +
                        "이 름 : %s\n" +
                        "국어 점수 : %s\n" +
                        "수학 점수 : %s\n" +
                        "영어 점수 : %s\n" +
                        "총 합 : %s\n" +
                        "평균 점수 : %s",


                student.getName(), subjects.getKoreanScore(),
                subjects.getMathScore(), subjects.getEnglishScore(),
                total, avg);
        System.out.println();
    }
}
