package serviceimpl;

import model.SubjectDTO;
import service.GradeService;
import service.UtilService;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance = new GradeServiceImpl();
    private GradeServiceImpl(){}
    public static GradeService getInstance() {
        return instance;
    }

    @Override
    public int total(SubjectDTO student) {
        return (student.getKoreanScore() + student.getMathScore() + student.getEnglishScore());
    }

    @Override
    public double Avg(int total) {
        return ((double) (total) / 3);
    }
}
