package com.videometric.survey.repository;

import com.videometric.survey.model.Models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelsRepository extends JpaRepository<Models, Integer> {
}
