package com.videometric.survey.repository;

import com.videometric.survey.model.Answers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswersRepository extends JpaRepository<Answers, Integer> {
    public List<Answers> findByQuestionIdAndEmailAddress(int questionId, String emailAddress);
}
