package com.probal.examapp.controller;

import com.lowagie.text.DocumentException;
import com.probal.examapp.dto.QuestionSetDto;
import com.probal.examapp.model.Question;
import com.probal.examapp.service.QuestionService;
import com.probal.examapp.utill.QuestionPDFExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    List<Question> questionListForPdf;

    @GetMapping("/all_questions")
    public String getAllQuestions(Model model){
        model.addAttribute("question_list",questionService.getAllQuestions());
        return "Data";
    }

    @GetMapping("/easy_questions")
    public String getAllEasyQuestions(Model model){
        model.addAttribute("question_list", questionService.getEasyQuestions());
        return "Data";
    }

    @GetMapping("/medium_questions")
    public String getAllMediumQuestions(Model model){
        model.addAttribute("question_list", questionService.getMediumQuestions());
        return "Data";
    }

    @GetMapping("/hard_questions")
    public String getAllHardQuestions(Model model){
        model.addAttribute("question_list", questionService.getHardQuestions());
        return "Data";
    }

    @GetMapping("/generate_questions")
    public String questionSetView(Model model){
        model.addAttribute("question_view", new QuestionSetDto());
        return "questionSetForm";
    }


    @PostMapping("/generate_questions")
    public String generateQuestionSet(Model model,
                                      @ModelAttribute(value="question_view") QuestionSetDto questionSetDto,
                                      RedirectAttributes redirectAttributes){
        int noOfQuestions = questionSetDto.getNoOfQuestions();
        double percentageOfEasyQuestions = questionSetDto.getPercentageOfEasyQuestions();
        double percentageOfMediumQuestions = questionSetDto.getPercentageOfMediumQuestions();
        double percentageOfHardQuestions = questionSetDto.getPercentageOfHardQuestions();

        if ((percentageOfEasyQuestions + percentageOfMediumQuestions +percentageOfHardQuestions) != 100) {
            redirectAttributes.addFlashAttribute("error_message", "total Percentage must be 100%");
            return "redirect:/question/generate_questions";
        }

        questionListForPdf = questionService.generateQuestionSet(noOfQuestions, percentageOfEasyQuestions,percentageOfMediumQuestions);
        model.addAttribute("question_list", questionListForPdf);
        return "Data";
    }

    @GetMapping("/export/pdf")
    public void exportToPDF(HttpServletResponse response, @ModelAttribute("question_list") final ArrayList<Question> questionList, Model model) throws DocumentException, IOException {

        model.getAttribute("question_list");
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Question_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);

        QuestionPDFExporter questionPDFExporter = new QuestionPDFExporter(questionListForPdf);
        questionPDFExporter.export(response);

    }




}
