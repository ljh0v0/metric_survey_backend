package com.videometric.survey.repository;

import com.videometric.survey.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Integer> {
    @Query(value = "SELECT MAX(q.surveyId) FROM Questions q")
    int findMaxSurveyId();

    List<Questions> findBySurveyId(int surveyId);
}
