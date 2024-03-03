package serviceimpl;

import service.GradeService;
import service.UtilService;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance = new GradeServiceImpl();
    private GradeServiceImpl(){}
    public static GradeService getInstance() {
        return instance;
    }

    @Override
    public int total(int koreanScore, int mathScore, int englishScore) {
        return (koreanScore + mathScore + englishScore);
    }

    @Override
    public double Avg(int koreanScore, int mathScore, int englishScore) {
        return ((double) (koreanScore + mathScore + englishScore) / 3);
    }
}
