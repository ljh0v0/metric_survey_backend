package com.videometric.survey.service;


import com.videometric.survey.model.Questions;
import com.videometric.survey.repository.QuestionsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionsServiceImpl implements QuestionsService {

    @Autowired
    private QuestionsRepository questionsRepository;

    @Override
    public Questions saveQuestions(Questions q) {
        return questionsRepository.save(q);
    }

    @Override
    public List<Questions> getAllQuestions() {
        return questionsRepository.findAll();
    }

    @Override
    public Questions getById(int id) {
        return questionsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Question not found with id " + id));
    }


}
