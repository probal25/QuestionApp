package com.probal.examapp.dto;

public class QuestionSetDto {
    private int noOfQuestions;
    private double percentageOfEasyQuestions;
    private double percentageOfMediumQuestions;
    private double percentageOfHardQuestions;

    public QuestionSetDto(int noOfQuestions, double percentageOfEasyQuestions, double percentageOfMediumQuestions, double percentageOfHardQuestions) {
        this.noOfQuestions = noOfQuestions;
        this.percentageOfEasyQuestions = percentageOfEasyQuestions;
        this.percentageOfMediumQuestions = percentageOfMediumQuestions;
        this.percentageOfHardQuestions = percentageOfHardQuestions;
    }

    public QuestionSetDto() {
    }

    public int getNoOfQuestions() {
        return noOfQuestions;
    }

    public void setNoOfQuestions(int noOfQuestions) {
        this.noOfQuestions = noOfQuestions;
    }

    public double getPercentageOfEasyQuestions() {
        return percentageOfEasyQuestions;
    }

    public void setPercentageOfEasyQuestions(double percentageOfEasyQuestions) {
        this.percentageOfEasyQuestions = percentageOfEasyQuestions;
    }

    public double getPercentageOfMediumQuestions() {
        return percentageOfMediumQuestions;
    }

    public void setPercentageOfMediumQuestions(double percentageOfMediumQuestions) {
        this.percentageOfMediumQuestions = percentageOfMediumQuestions;
    }

    public double getPercentageOfHardQuestions() {
        return percentageOfHardQuestions;
    }

    public void setPercentageOfHardQuestions(double percentageOfHardQuestions) {
        this.percentageOfHardQuestions = percentageOfHardQuestions;
    }
}
