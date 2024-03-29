package com.videometric.survey.service;

import com.videometric.survey.model.Counter;
import com.videometric.survey.repository.CounterRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CounterServiceImpl implements CounterService{

    @Autowired
    private CounterRepository counterRepository;


    @Override
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.SERIALIZABLE)
    public Counter hitCounter() {
        Counter c = counterRepository.findById(0).orElseThrow(() -> new EntityNotFoundException("No Counter!"));;
        counterRepository.updateCounter();
        return c;
    }
}
