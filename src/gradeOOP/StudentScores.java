package gradeOOP;

public class StudentScores {
    private String name;
    private int koreanScore;
    private double mathScore;
    private int englishScore;
    private double avgOfScores;

    public void setName(String name)   {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setKoreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
    }
    
    public int getKoreanScore() {
        return this.koreanScore;
    }
    
//    public void setMathScore(int mathScore) {
//        this.mathScore = mathScore;
//    }

    public void createMathScore()   {
        double mathScore = 0;
        mathScore = Math.round(((Math.random() * 100) * 10) / 10);
        this.mathScore = mathScore;
    }
    
    public double getMathScore()   {
        return this.mathScore;
    }
    
    public void setEnglishScore(int englishScore)    {
        this.englishScore = englishScore;
    }
    
    public int getEnglishScore()    {
        return englishScore;
    }
    
    public void createAvgOfScores() {
        this.avgOfScores = (double) (this.koreanScore + this.mathScore + this.englishScore) / 3;
    }

    public double getAvgOfScores()  {
        return this.avgOfScores;
    }
}
