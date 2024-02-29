package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class SubjectDTO {
    private int id;
    private int koreanScore;
    private int mathScore;
    private int englishScore;
}
