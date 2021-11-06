package com.probal.examapp.utill;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import com.probal.examapp.model.Question;



public class QuestionPDFExporter {

    private List<Question> questionList;

    public QuestionPDFExporter(List<Question> questionList){
        this.questionList = questionList;
    }

    private void writeTableHeader(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.BLUE);
        cell.setPadding(5);

        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);

        cell.setPhrase(new Phrase("Question", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Answer", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Number", font));
        table.addCell(cell);
    }

    private void writeTableData(PdfPTable table) {
        for (Question question : questionList) {
            table.addCell(question.getBody());
            table.addCell(String.valueOf(question.getRank()));
            if (question.getRank() == 1) {
                table.addCell("5");
            } else if (question.getRank() == 2) {
                table.addCell("10");
            } else {
                table.addCell("20");
            }

        }
    }

    private void writeParagraph(){
        for (Question question : questionList) {

        }
    }

    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(15);
        font.setColor(Color.black);

        Paragraph p = new Paragraph("List of Questions", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);

        document.add(p);
        document.add(Chunk.NEWLINE);

        Font fontP = FontFactory.getFont(FontFactory.COURIER);
        fontP.setSize(10);
        fontP.setColor(Color.BLACK);
        int count = 1;
        for (Question question : questionList) {

            Paragraph paragraph = new Paragraph(count +") " + question.getBody(), fontP);
            document.add(paragraph);

            if (question.getRank() == 1) {
                for (int i = 0; i< 4; i++) {
                    document.add(Chunk.NEWLINE);
                    document.add(Chunk.NEWLINE);
                }
            } else if (question.getRank() == 2){
                for (int i = 0; i< 4; i++) {
                    document.add(Chunk.NEWLINE);
                    document.add(Chunk.NEWLINE);
                    document.add(Chunk.NEWLINE);
                }
            } else {
                for (int i = 0; i < 4; i++) {
                    document.add(Chunk.NEWLINE);
                    document.add(Chunk.NEWLINE);
                    document.add(Chunk.NEWLINE);
                    document.add(Chunk.NEWLINE);
                    document.add(Chunk.NEWLINE);
                    document.add(Chunk.NEWLINE);
                }
            }
            count += 1;
        }


        /*PdfPTable table = new PdfPTable(3);
        table.setWidthPercentage(100f);
        table.setWidths(new float[] {5f, 3.0f, 3.0f});
        table.setSpacingBefore(10);

        writeTableHeader(table);
        writeTableData(table);

        document.add(table);*/

        document.close();
    }
}
