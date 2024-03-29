package com.videometric.survey.service;

import com.videometric.survey.model.Questions;

import java.util.List;
import java.util.Optional;

public interface QuestionsService {
    public Questions saveQuestions(Questions q);
    public List<Questions> getAllQuestions();
    public Questions getById(int id);
    public int getMaxSurveyId();
    public List<Questions> getBySurveyId(int surveyId);
}
