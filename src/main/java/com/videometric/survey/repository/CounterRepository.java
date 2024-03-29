package com.videometric.survey.repository;

import com.videometric.survey.model.Counter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterRepository extends JpaRepository<Counter, Integer> {
    @Modifying
    @Query("UPDATE Counter SET cnt=cnt+1")
    void updateCounter();

    public Counter findFirstByOrderByCntAsc();
}
