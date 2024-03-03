package builder;

import model.SubjectDTO;

public class SubjectBuilder {
    private int koreanScore;
    private int mathScore;
    private int englishScore;

    public SubjectBuilder koreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
        return this;
    }

    public SubjectBuilder mathScore(int mathScore) {
        this.mathScore = mathScore;
        return this;
    }

    public SubjectBuilder englishScore(int englishScore) {
        this.englishScore = englishScore;
        return this;
    }

    public SubjectDTO build()   {
        return new SubjectDTO(
                koreanScore,
                mathScore,
                englishScore
        );
    }
}
