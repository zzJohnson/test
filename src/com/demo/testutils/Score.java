package com.demo.testutils;

public class Score {
    private double mathScore;
    private double englishScore;

    @Override
    public String toString() {
        return "Score{" +
                "mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                '}';
    }

    public Score(){}

    public Score(double mathScore, double englishScore) {
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }
}
