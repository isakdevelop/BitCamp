package builder;

import model.BoardDTO;

public class BoardBuilder {
    private int id;
    private String subject;
    private String content;
    private String writer;

    public BoardBuilder id(int id)  {
        this.id = id;
        return this;
    }

    public BoardBuilder subject(String subject)    {
        this.subject = subject;
        return this;
    }

    public BoardBuilder content(String content) {
        this.content = content;
        return this;
    }

    public BoardBuilder writer(String writer)   {
        this.writer = writer;
        return this;
    }

    public BoardDTO build() {
        return new BoardDTO(
                id,
                subject,
                content,
                writer
        );
    }
}
