package com.probal.examapp.startup;

import com.probal.examapp.dao.QuestionDao;
import com.probal.examapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


public class CommandLineRunnerImpl implements CommandLineRunner {

    @Autowired
    QuestionDao questionDao;

    @Override
    public void run(String... args) throws Exception {
        saveQuestions();
    }

    private void saveQuestions() {

        List<Question> questionList = Arrays.asList(
                new Question("Why is Java a platform independent language?","SE", 1),
                new Question("What is an Optional class?","SE", 3),
                new Question("Why is Java not a pure object oriented language?","SE", 1),
                new Question("Comment on method overloading and overriding","SE", 2),
                new Question("What are Intermediate and Terminal operations?","SE", 3),
                new Question("What is the importance of reflection in Java?","SE", 2),
                new Question("What is the lambda expression in Java and How does a lambda expression relate to a functional interface?","SE", 3),
                new Question("Tell us something about JIT compiler.","SE", 1),
                new Question(" What is the use of JJS in Java 8?","SE", 2),
                new Question("Java works as “pass by value” or “pass by reference” phenomenon?","SE", 1),
                new Question("Java Hard Question _-_","SE", 3),
                new Question("Java Easy Question _-_","SE", 1),
                new Question("Java works as “pass by value” ?","SE", 2),
                new Question("Java Hard Question -_-","SE", 3),
                new Question("Java Medium Question $$$$$$$$$$$","SE", 2)
        );

        for (Question question : questionList) {
            this.questionDao.save(question);
        }
    }
}
