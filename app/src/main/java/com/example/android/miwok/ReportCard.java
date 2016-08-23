package com.example.android.miwok;

/**
 * Created by Lawrence on 2016/8/16.
 */
public class ReportCard {

    // Student subject grade variable
    private String mathmaticGrade;

    private String englishGrade;

    private String computerGrade;

    private String scienceGrade;

    private String historyGrade;

    // Constructor for ReportCard class
    public ReportCard(String mathmaticGrade, String englishGrade, String computerGrade, String scienceGrade, String historyGrade) {
        this.mathmaticGrade = mathmaticGrade;
        this.englishGrade = englishGrade;
        this.computerGrade = computerGrade;
        this.scienceGrade = scienceGrade;
        this.historyGrade = historyGrade;
    }

    // returns the contents of the class in a human-readable string.
    @Override
    public String toString() {
        return "ReportCard{" +
                "mathmaticGrade='" + mathmaticGrade + '\'' +
                ", englishGrade='" + englishGrade + '\'' +
                ", computerGrade='" + computerGrade + '\'' +
                ", scienceGrade='" + scienceGrade + '\'' +
                ", historyGrade='" + historyGrade + '\'' +
                '}';
    }

    // Getter and setter methods of variables
    public String getMathmaticGrade() {
        return mathmaticGrade;
    }

    public void setMathmaticGrade(String mathmaticGrade) {
        this.mathmaticGrade = mathmaticGrade;
    }

    public String getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(String englishGrade) {
        this.englishGrade = englishGrade;
    }

    public String getComputerGrade() {
        return computerGrade;
    }

    public void setComputerGrade(String computerGrade) {
        this.computerGrade = computerGrade;
    }

    public String getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(String scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public String getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(String historyGrade) {
        this.historyGrade = historyGrade;
    }
}
