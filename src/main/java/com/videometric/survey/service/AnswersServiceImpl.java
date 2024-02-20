package com.videometric.survey.service;

import com.videometric.survey.common.CustomException;
import com.videometric.survey.model.Answers;
import com.videometric.survey.repository.AnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswersServiceImpl implements AnswersService{

    @Autowired
    private AnswersRepository answersRepository;


    @Override
    public Answers saveAnswers(Answers a) {
        List<Answers> list = answersRepository.findByQuestionIdAndEmailAddress(a.getQuestionId(), a.getEmailAddress());
        if(list.size() > 0){
            throw new CustomException("You Already did this question!");
        }
        if (a.getEmailAddress().length() == 0){
            throw new CustomException("Please enter your email first!");
        }
        return answersRepository.save(a);
    }

    @Override
    public List<Answers> getAllAnswers() {
        return answersRepository.findAll();
    }
}
