package com.probal.examapp.utill;

import java.awt.Color;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import com.probal.examapp.model.Question;
import org.springframework.beans.factory.annotation.Value;



public class QuestionPDFExporter {

    public final String companyEmailAddress = "jobs@divineit.net";

    public final String testDuration = "2";

    public final String totalMarks = "100";


    private List<Question> questionList;
    private String questionSetCode;

    public QuestionPDFExporter(List<Question> questionList, String questionSetCode){
        this.questionList = questionList;
        this.questionSetCode = questionSetCode;
    }

    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());
        try {
            document.open();
            generateFrontPage(document);
            generateQuestionContents(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    private void generateFrontPage(Document document) {
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(9);
        font.setColor(Color.black);

        List<Paragraph> frontPageParagraph = Arrays.asList(
                new Paragraph("Name of the Candidate                  : " , font),
                new Paragraph("Address of the candidate              : " , font),
                new Paragraph("Email Address of the candidate   : ", font),
                new Paragraph("Cell no of the candidate                : ", font)
        );

        document.add(addImage());
        List<Paragraph> paragraphs = generateUpperPartFrontPage(font);

        int countP = 0;
        for (Paragraph paragraph: paragraphs) {
            paragraph.setAlignment(Paragraph.ALIGN_CENTER);

            document.add(paragraph);
            if (countP == 0) {
                addNewLinesToDocument(document, 2);
            }
            countP++;
        }
        addNewLinesToDocument(document, 7);
        for (Paragraph paragraph : frontPageParagraph) {
//            paragraph.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(paragraph);
            addNewLinesToDocument(document, 1);
        }

        Paragraph footerContentOfPage = new Paragraph("N.B: \n 1. Please switch off your Mobile Phone & hand over to the concerned Person" , font);
        footerContentOfPage.setSpacingBefore(190f);
        document.add(footerContentOfPage);

        Paragraph footerContentOfPage2 = new Paragraph("2. You may use designered answering space for both answers and drafts. But please separate them clearly." , font);
        document.add(footerContentOfPage2);

        document.newPage();
    }

    private void generateQuestionContents(Document document) {
        Font fontP = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontP.setSize(10);
        fontP.setColor(Color.BLACK);
        int count = 1;
        for (Question question : questionList) {

            Paragraph paragraph = new Paragraph(count +") " + question.getBody(), fontP);
            document.add(paragraph);
            addNewLinesToDocument(document, question.getLineOfAnswer() * 2);
            count += 1;
        }
    }

    private List<Paragraph> generateUpperPartFrontPage(Font font) {
        List<Paragraph> upperPartContents = Arrays.asList(
                new Paragraph("Preliminary Test", font),
                new Paragraph("Email: " + companyEmailAddress, font),
                new Paragraph("Duration of the test: " , font),
                new Paragraph("Full Marks: " , font),
                new Paragraph("Question Set: " + questionSetCode, font)
        );
        return upperPartContents;
    }

    private Image addImage() {
        Image logo = null;
        try {
            logo = Image.getInstance("C:/Projects/practice_projects/examapp/src/main/resources/logo.png");
            logo.setAlignment(Image.MIDDLE);
            logo.scaleAbsoluteHeight(20);
            logo.scaleAbsoluteWidth(20);
            logo.scalePercent(100);
            return logo;
        } catch (IOException e) {

            e.printStackTrace();
            return null;
        }

    }

    private void addNewLinesToDocument(Document document, int numberOfLines){
        for (int i = 0; i < numberOfLines; i++) {
            document.add(Chunk.NEWLINE);
        }
    }
}
