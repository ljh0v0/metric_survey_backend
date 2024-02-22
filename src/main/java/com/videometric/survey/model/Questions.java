package com.videometric.survey.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Questions {
    @Id
    protected int questionId;

    protected int groupId;

    protected String modelPair;

    public Questions() {
    }

    public int getQuestionId() {
        return questionId;
    }

    public int getGroupId() {
        return groupId;
    }

    public String getModelPair() {
        return modelPair;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setModelPair(String modelPair) {
        this.modelPair = modelPair;
    }
}
