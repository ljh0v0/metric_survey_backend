package com.videometric.survey.service;

import com.videometric.survey.model.Models;
import com.videometric.survey.repository.ModelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelsServiceImpl implements ModelsService{

    @Autowired
    private ModelsRepository modelsRepository;

    @Override
    public Models saveModels(Models m) {
        return modelsRepository.save(m);
    }

    @Override
    public List<Models> getAllModels() {
        return modelsRepository.findAll();
    }
}
