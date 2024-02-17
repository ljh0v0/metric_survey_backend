package com.videometric.survey.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Models {
    @Id
    private String modelId;
    private int groupId;

    public Models() {
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getModelId() {
        return modelId;
    }

    public int getGroupId() {
        return groupId;
    }
}
