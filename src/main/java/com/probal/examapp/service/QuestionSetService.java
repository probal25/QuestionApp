package com.probal.examapp.service;

import com.probal.examapp.dao.QuestionDao;
import com.probal.examapp.dao.QuestionSetDao;
import com.probal.examapp.model.Question;
import com.probal.examapp.model.QuestionSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionSetService {

    @Autowired
    QuestionSetDao questionSetDao;

    @Autowired
    QuestionDao questionDao;


    public List<QuestionSet> getAllQuestionSet() {
        return questionSetDao.findAll();
    }

    public List<Question> getQuestionAnswerList(Long questionSetId) throws Exception {
        QuestionSet questionSet = questionSetDao.findById(questionSetId).orElseThrow(() -> new Exception("No question set found"));
        List<String> questionIdList = Arrays.asList(questionSet.getQuestionIdListInString().split(","));
        List<Long> finalIds = questionIdList.stream()
                .map(Long::valueOf)
                .collect(Collectors.toList());
        List<Question> questionList = new ArrayList<>();
        for (Long id : finalIds) {
            Question question = questionDao.findById(id).orElseThrow(() -> new Exception("No question find"));
            questionList.add(question);
        }
        return questionList;
    }



    @Transactional
    public String generateQuestionSet(List<Question> questionListForPdf) {
        String questionsIdString = "";

        for (Question question: questionListForPdf) {
            questionsIdString += question.getId() + ",";
        }

        Date currentDate = new Date(System.currentTimeMillis());


        String questionSetCode = generateQuestionSetCode(currentDate.getTime());

        QuestionSet questionSet = new QuestionSet();
        questionSet.setQuestionSetCode(questionSetCode);
        questionSet.setCreatedAt(currentDate);
        questionSet.setQuestionIdListInString(questionsIdString);
        questionSetDao.save(questionSet);

        return questionSetCode;

    }

    private String generateQuestionSetCode(long time) {
        String code = "QSN_";
        String _postfix = String.valueOf(time/ 1000);
        code += _postfix;
        return code;

    }
}
