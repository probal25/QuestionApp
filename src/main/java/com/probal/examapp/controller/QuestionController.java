package com.probal.examapp.controller;

import com.probal.examapp.model.Question;
import com.probal.examapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/all_questions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/easy_questions")
    public List<Question> getAllEasyQuestions(){
        return questionService.getEasyQuestions();
    }

    @GetMapping("/medium_questions")
    public List<Question> getAllMediumQuestions(){
        return questionService.getMediumQuestions();
    }

    @GetMapping("/hard_questions")
    public List<Question> getAllHardQuestions(){
        return questionService.getHardQuestions();
    }


}
