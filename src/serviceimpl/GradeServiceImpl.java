package serviceimpl;

import model.Subject;
import service.GradeService;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance = new GradeServiceImpl();
    private GradeServiceImpl(){}
    public static GradeService getInstance() {
        return instance;
    }

    @Override
    public int total(Subject student) {
        return (student.getKoreanScore() + student.getMathScore() + student.getEnglishScore());
    }

    @Override
    public double Avg(int total) {
        return ((double) (total) / 3);
    }
}
