package com.probal.examapp.dao;

import com.probal.examapp.model.QuestionSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionSetDao extends JpaRepository<QuestionSet, Long> {
    Optional<QuestionSet> findById(Long id);
}
