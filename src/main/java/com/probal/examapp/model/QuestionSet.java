package com.probal.examapp.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "qsn_set")
public class QuestionSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questionset_id")
    private Long id;

    @Column(name = "questionset_code")
    private String questionSetCode;

    @Column(name = "questionset_questionIds")
    private String questionIdListInString;

    @Column(name = "created_at")
    private Date createdAt;

    public QuestionSet(String questionSetCode, String questionIdListInString, Date createdAt) {
        this.questionSetCode = questionSetCode;
        this.questionIdListInString = questionIdListInString;
        this.createdAt = createdAt;
    }

    public QuestionSet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionSetCode() {
        return questionSetCode;
    }

    public void setQuestionSetCode(String questionSetCode) {
        this.questionSetCode = questionSetCode;
    }

    public String getQuestionIdListInString() {
        return questionIdListInString;
    }

    public void setQuestionIdListInString(String questionIdListInString) {
        this.questionIdListInString = questionIdListInString;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
