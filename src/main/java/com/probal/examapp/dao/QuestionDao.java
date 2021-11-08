package com.probal.examapp.dao;

import com.probal.examapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Long> {

    @Query(value = "SELECT * FROM QUESTION_TBL WHERE question_rank = ?1 AND LABEL = ?2", nativeQuery = true)
    List<Question> findQuestions(int rank, String label);

    List<Question> findByLabel(String label);

}
