package model;

public class BoardDTO {
    private String subject;
    private String content;
    private String writer;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public BoardDTO(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "게시글{" +
                "제목='" + subject + '\'' +
                ", 내용='" + content + '\'' +
                ", 글쓴이='" + writer + '\'' +
                '}';
    }
}
