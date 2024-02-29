package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class BoardDTO {
    private int id;
    private String subject;
    private String content;
    private String writer;
}
