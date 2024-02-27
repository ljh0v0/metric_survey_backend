package com.videometric.survey.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Questions {
    @Id
    protected int questionId;

    protected int groupId;

    protected String modelPair;

    protected String model1;

    protected String model2;

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

    public String getModel1() {
        return model1;
    }

    public String getModel2() {
        return model2;
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

    public void setModel1(String model1) {
        this.model1 = model1;
    }
}
