package com.probal.examapp.service;

import com.probal.examapp.dao.QuestionDao;
import com.probal.examapp.model.Question;
import com.probal.examapp.service.partials.IExcelDataService;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ExcelDataServiceImpl implements IExcelDataService {

    @Value("${app.upload.file:${user.home}}")
    public String EXCEL_FILE_PATH;

    private final static Logger logger =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @Autowired
    QuestionDao questionDao;

    Workbook workbook;

    @Override
    public List<Question> getExcelDataAsList() {
        List<String> list = new ArrayList<>();

        DataFormatter dataFormatter = new DataFormatter();

        try {
            workbook = WorkbookFactory.create(new File(EXCEL_FILE_PATH));
        } catch (EncryptedDocumentException | IOException e) {
            e.printStackTrace();
        }
        logger.log(Level.INFO, "Workbook has '" + workbook.getNumberOfSheets() + "' Sheets" );
        Sheet sheet = workbook.getSheetAt(0);

        int noOfColumns = sheet.getRow(0).getLastCellNum();
        logger.log(Level.INFO, "Sheet has '"+noOfColumns+"' columns");

        // Using for-each loop to iterate over the rows and columns
        for (Row row : sheet) {
            for (Cell cell : row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                list.add(cellValue);
            }
        }


        List<Question> questionList = createList(list, noOfColumns);

        // Closing the workbook
        try {
            workbook.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return questionList;
    }

    private List<Question> createList(List<String> excelData, int noOfColumns) {

        ArrayList<Question> questions = new ArrayList<>();

        int i = noOfColumns;

        do {
            Question question = new Question();

            question.setBody(excelData.get(i));
            question.setLabel(excelData.get(i+1));
            if (excelData.get(i+2) != "") {
                question.setRank(Integer.parseInt(excelData.get(i + 2)));
            }
            if ((excelData.get(i+3)) != "") {
                question.setLineOfAnswer(Integer.parseInt(excelData.get(i+3)));
            }
            question.setAnswer(excelData.get(i+4));

            if ((excelData.get(i+5)) != "") {
                question.setSelected(Integer.parseInt(excelData.get(i+5)));
            }

            questions.add(question);
            i = i + (noOfColumns);

        } while (i < excelData.size());

        return questions;
    }

    @Override
    public int saveExcelData(List<Question> questions) {

        questions = questionDao.saveAll(questions);
        return questions.size();
    }
}
