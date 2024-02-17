package com.videometric.survey.service;

import com.videometric.survey.model.Models;

import java.util.List;

public interface ModelsService {
    public Models saveModels(Models m);
    public List<Models> getAllModels();
}
