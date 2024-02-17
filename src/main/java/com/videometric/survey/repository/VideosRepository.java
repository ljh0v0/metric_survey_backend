package com.videometric.survey.repository;

import com.videometric.survey.model.Videos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideosRepository extends JpaRepository<Videos, Integer> {

    public List<Videos> findByModelId(String modelId);
}
