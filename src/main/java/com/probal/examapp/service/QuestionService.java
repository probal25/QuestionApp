package com.probal.examapp.service;


import com.probal.examapp.dao.QuestionDao;
import com.probal.examapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public List<Question> generateQuestionSet() {

        List<Question> easyQuestions = questionDao.findQuestions(1,"SE");
        List<Question> mediumQuestions = questionDao.findQuestions(2,"SE");
        List<Question> hardQuestions = questionDao.findQuestions(3,"SE");

        List<Question> finalQuestionList = new ArrayList<>();


        int sizeOfEasyQuestions = easyQuestions.size();
        int sizeOfMediumQuestions = mediumQuestions.size();
        int sizeOfHardQuestions = hardQuestions.size();

        if ((sizeOfEasyQuestions + sizeOfMediumQuestions + sizeOfHardQuestions) <= 10) return questionDao.findAll();

        finalQuestionList = Stream.of(
                questionSetGeneration(easyQuestions, 4, sizeOfEasyQuestions),
                questionSetGeneration(mediumQuestions, 4, sizeOfMediumQuestions),
                questionSetGeneration(hardQuestions, 2, sizeOfHardQuestions))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        return finalQuestionList;
    }

    private List<Question> questionSetGeneration(List<Question> questions, int n, int length) {
        List<Question> finalSet = new ArrayList<>();
        int[] index = sampleRandomNumbersWithoutRepetition(length, n);
        for(int i = 0;  i < n; i++) {
            finalSet.add(questions.get(index[i]));
        }
        return finalSet;
    }

    private int[] sampleRandomNumbersWithoutRepetition(int end, int count) {
        Random rng = new Random();

        int[] result = new int[count];
        int cur = 0;
        int remaining = end;
        for (int i = 0; i < end && count > 0; i++) {
            double probability = rng.nextDouble();
            if (probability < ((double) count) / (double) remaining) {
                count--;
                result[cur++] = i;
            }
            remaining--;
        }
        return result;
    }
}
