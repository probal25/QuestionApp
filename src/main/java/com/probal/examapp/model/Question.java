package com.probal.examapp.model;


import javax.persistence.*;

@Entity
@Table(name = "QUESTION_TBL")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private Long id;

    @Lob
    @Column(name = "body")
    private String body;

    @Column(name = "label")
    private String label;

    @Column(name = "question_rank")
    private int rank;

    @Column(name = "line_of_answer")
    private int lineOfAnswer;

    @Lob
    @Column(name = "answer")
    private String answer;



    public Question(String body, String label, int rank, int lineOfAnswer, String answer) {
        this.body = body;
        this.label = label;
        this.rank = rank;
        this.lineOfAnswer = lineOfAnswer;
        this.answer = answer;
    }

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getLineOfAnswer() {
        return lineOfAnswer;
    }

    public void setLineOfAnswer(int lineOfAnswer) {
        this.lineOfAnswer = lineOfAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
