package com.probal.examapp.service.partials;

import com.probal.examapp.model.Question;

import java.util.List;

public interface IExcelDataService {
    List<Question> getExcelDataAsList();

    int saveExcelData(List<Question> questions);
}
