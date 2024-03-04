package model;

import lombok.*;

@NoArgsConstructor
@Getter
@ToString

public class Subject {
    private int id;
    private int koreanScore;
    private int mathScore;
    private int englishScore;

    @Builder(builderMethodName = "builder")
    public Subject(int id, int koreanScore, int mathScore, int englishScore) {
        this.id = id;
        this.koreanScore = koreanScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }
}
