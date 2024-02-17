package com.videometric.survey.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Videos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String modelId;

    private String url;

    public Videos() {
    }

    public int getId() {
        return id;
    }

    public String getModel_id() {
        return modelId;
    }

    public String getUrl() {
        return url;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel_id(String model_id) {
        this.modelId = model_id;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
