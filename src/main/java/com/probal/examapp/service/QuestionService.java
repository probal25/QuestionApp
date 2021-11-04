package com.probal.examapp.service;


import com.probal.examapp.dao.QuestionDao;
import com.probal.examapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {


    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getEasyQuestions() {
        return questionDao.findQuestions(1,"SE");
    }

    public List<Question> getMediumQuestions() {
        return questionDao.findQuestions(2,"SE");
    }

    public List<Question> getHardQuestions() {
        return questionDao.findQuestions(3,"SE");
    }
}
