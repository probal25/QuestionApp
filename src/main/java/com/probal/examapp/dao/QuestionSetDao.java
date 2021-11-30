package com.probal.examapp.dao;

import com.probal.examapp.model.QuestionSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionSetDao extends JpaRepository<QuestionSet, Long> {
}
