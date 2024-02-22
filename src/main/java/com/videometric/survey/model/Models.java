package com.videometric.survey.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Models {
    @Id
    private String modelPairId;
    private int groupId;

    public Models() {
    }

    public void setModelPairId(String modelPairId) {
        this.modelPairId = modelPairId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getModelPairId() {
        return modelPairId;
    }

    public int getGroupId() {
        return groupId;
    }
}
