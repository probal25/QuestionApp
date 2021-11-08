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

    public List<Question> getAllQuestionByLebel(String lebel) {
        return questionDao.findByLabel(lebel);
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

    public List<Question> generateQuestionSet( String questionType, int noOfQuestions, double percentageOfEasyQuestions, double percentageOfMediumQuestions) {

        List<Question> easyQuestions = questionDao.findQuestions(1, questionType);
        List<Question> mediumQuestions = questionDao.findQuestions(2, questionType);
        List<Question> hardQuestions = questionDao.findQuestions(3, questionType);

        List<Question> finalQuestionList;
        List<Integer> properties = getQuestionProperties(noOfQuestions,percentageOfEasyQuestions, percentageOfMediumQuestions);



        int sizeOfEasyQuestions = easyQuestions.size();
        int sizeOfMediumQuestions = mediumQuestions.size();
        int sizeOfHardQuestions = hardQuestions.size();

        if ((sizeOfEasyQuestions + sizeOfMediumQuestions + sizeOfHardQuestions) <= noOfQuestions) return questionDao.findAll();

        finalQuestionList = Stream.of(
                questionSetGeneration(easyQuestions, properties.get(0), sizeOfEasyQuestions),
                questionSetGeneration(mediumQuestions, properties.get(1), sizeOfMediumQuestions),
                questionSetGeneration(hardQuestions, properties.get(2), sizeOfHardQuestions))
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

    private List<Integer> getQuestionProperties(int noOfQuestions,
                                                double percentageOfEasyQuestions,
                                                double percentageOfMediumQuestions){

        int easy = (int) Math.ceil((noOfQuestions * percentageOfEasyQuestions)/100);
        int medium = (int) Math.ceil((noOfQuestions * percentageOfMediumQuestions)/100);
        int hard = noOfQuestions - (easy + medium);

        List<Integer> properties = new ArrayList<>();
        properties.add(easy);
        properties.add(medium);
        properties.add(hard);
        return properties;
    }

    public Question saveQuestion(Question question) {
        return this.questionDao.save(question);
    }
}
