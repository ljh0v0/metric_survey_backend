package com.videometric.survey.service;

import com.videometric.survey.model.Videos;

import java.util.List;

public interface VideosService {
    public Videos saveVideos(Videos v);
    public List<Videos> getAllVideos();
    public List<Videos> getByModelId(String model_id);
}
