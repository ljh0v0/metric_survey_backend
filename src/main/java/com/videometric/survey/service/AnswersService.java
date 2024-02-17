package com.videometric.survey.service;

import com.videometric.survey.model.Answers;

import java.util.List;

public interface AnswersService {
    public Answers saveAnswers(Answers a);
    public List<Answers> getAllAnswers();
}
