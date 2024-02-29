package builder;

import model.SubjectDTO;

public class SubjectBuilder {
    private int id;
    private int koreanScore;
    private int mathScore;
    private int englishScore;

    public SubjectBuilder id(int id) {
        this.id = id;
        return this;
    }

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
                id,
                koreanScore,
                mathScore,
                englishScore
        );
    }
}
