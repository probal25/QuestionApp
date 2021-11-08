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

    public Question(String body, String label, int rank) {
        this.body = body;
        this.label = label;
        this.rank = rank;
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
}
