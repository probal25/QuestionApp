package com.probal.examapp.controller;

import com.lowagie.text.DocumentException;
import com.probal.examapp.dto.QuestionSetDto;
import com.probal.examapp.model.Question;
import com.probal.examapp.model.QuestionSet;
import com.probal.examapp.service.QuestionService;
import com.probal.examapp.service.QuestionSetService;
import com.probal.examapp.utill.QuestionPDFExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @Autowired
    QuestionSetService questionSetService;

    List<Question> questionListForPdf;

    @GetMapping("/all_questions")
    public String getAllQuestions(Model model) {
        model.addAttribute("question_list", questionService.getAllQuestions());
        return "Data";
    }

    @GetMapping("/all_se_questions")
    public String getAllSEQuestions(Model model) {
        model.addAttribute("question_list", questionService.getAllQuestionByLebel("SE"));
        return "Data";
    }

    @GetMapping("/all_ee_questions")
    public String getAllEEQuestions(Model model) {
        model.addAttribute("question_list", questionService.getAllQuestionByLebel("EE"));
        return "Data";
    }

    @GetMapping("/add_question")
    public String addQuestionView(Model model) {
        model.addAttribute("question", new Question());
        return "questionForm";
    }

    @PostMapping("/add_question")
    public String addQuestion(Model model,
                              @ModelAttribute(value = "question") Question question,
                              RedirectAttributes redirectAttributes) {
        Question question1 = this.questionService.saveQuestion(question);
        if (question1 != null) {
            redirectAttributes.addFlashAttribute("error_message", "Question Added Successfully. . . ");
        }
        return "redirect:/question/add_question";
    }


    @GetMapping("/easy_questions")
    public String getAllEasyQuestions(Model model) {
        model.addAttribute("question_list", questionService.getEasyQuestions());
        return "Data";
    }

    @GetMapping("/medium_questions")
    public String getAllMediumQuestions(Model model) {
        model.addAttribute("question_list", questionService.getMediumQuestions());
        return "Data";
    }

    @GetMapping("/hard_questions")
    public String getAllHardQuestions(Model model) {
        model.addAttribute("question_list", questionService.getHardQuestions());
        return "Data";
    }

    @GetMapping("/generate_questions")
    public String questionSetView(Model model) {
        model.addAttribute("question_view", new QuestionSetDto());
        return "questionSetForm";
    }


    @PostMapping("/generate_questions")
    public String generateQuestionSet(Model model,
                                      @ModelAttribute(value = "question_view") QuestionSetDto questionSetDto,
                                      RedirectAttributes redirectAttributes) {
        int noOfQuestions = questionSetDto.getNoOfQuestions();
        double percentageOfSE = questionSetDto.getPercentageOfSE();
        double percentageOfEE = questionSetDto.getPercentageOfEE();
        double percentageOfEasyQuestions = questionSetDto.getPercentageOfEasyQuestions();
        double percentageOfMediumQuestions = questionSetDto.getPercentageOfMediumQuestions();
        double percentageOfHardQuestions = questionSetDto.getPercentageOfHardQuestions();
        List<Question> seQuestionList;
        List<Question> eeQuestionList;


        if ((percentageOfSE + percentageOfEE) != 100) {
            redirectAttributes.addFlashAttribute("error_message", "total SE and EE Percentage must be 100%");
            return "redirect:/question/generate_questions";
        }

        if ((percentageOfEasyQuestions + percentageOfMediumQuestions + percentageOfHardQuestions) != 100) {
            redirectAttributes.addFlashAttribute("error_message", "total Percentage must be 100%");
            return "redirect:/question/generate_questions";
        }


        int numberOfSEQuestions = (int) Math.ceil((noOfQuestions * percentageOfSE) / 100);
        int numberOfEEQuestions = noOfQuestions - numberOfSEQuestions;


        seQuestionList = questionService.generateQuestionSet("SE", numberOfSEQuestions, percentageOfEasyQuestions, percentageOfMediumQuestions);
        eeQuestionList = questionService.generateQuestionSet("EE", numberOfEEQuestions, percentageOfEasyQuestions, percentageOfMediumQuestions);


        questionListForPdf = Stream.of(
                seQuestionList,
                eeQuestionList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());


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
        String questionSetCode = questionSetService.generateQuestionSet(questionListForPdf);

        QuestionPDFExporter questionPDFExporter = new QuestionPDFExporter(questionListForPdf, questionSetCode);
        questionPDFExporter.export(response);

    }

    @GetMapping("/all_question_set")
    public String getAllQuestionSet(Model model) {
        List<QuestionSet> questionSets = questionSetService.getAllQuestionSet();
        model.addAttribute("question_sets", questionSets);
        return "question_set_view";
    }

    @GetMapping("/get_qustions_by_qset_id/{id}")
    public String getQuestionAnswerList(@PathVariable("id") Long id, Model model) throws Exception {
        List<Question> questionList = questionSetService.getQuestionAnswerList(id);
        model.addAttribute("question_list", questionList);
        return "Data";
    }


    @GetMapping("/custom_questions")
    public void generateCustomQuestions(HttpServletResponse response) throws DocumentException, IOException {
        List<Question> questionList = questionService.getCustomQuestions();
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Question_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
        String questionSetCode = questionSetService.generateQuestionSet(questionList);

        QuestionPDFExporter questionPDFExporter = new QuestionPDFExporter(questionList, questionSetCode);
        questionPDFExporter.export(response);
    }

}
