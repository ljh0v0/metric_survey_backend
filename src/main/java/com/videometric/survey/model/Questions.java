package com.videometric.survey.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Questions {
    @Id
    protected int questionId;

    protected int surveyId;

    protected int groupId;

    protected String modelPair;

    protected int model1;

    protected int model2;

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

    public int getModel1() {
        return model1;
    }

    public int getModel2() {
        return model2;
    }

    public int getSurveyId() {
        return surveyId;
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

    public void setModel1(int model1) {
        this.model1 = model1;
    }

    public void setModel2(int model2) {
        this.model2 = model2;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }
}
