package com.videometric.survey.service;

import com.videometric.survey.model.Videos;
import com.videometric.survey.repository.VideosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideosServiceImpl implements VideosService{

    @Autowired
    private VideosRepository videosRepository;


    @Override
    public Videos saveVideos(Videos v) {
        return videosRepository.save(v);
    }

    @Override
    public List<Videos> getAllVideos() {
        return videosRepository.findAll();
    }

    @Override
    public List<Videos> getByModelPairId(String model_id) {
        return videosRepository.findByModelPairId(model_id);
    }
}
