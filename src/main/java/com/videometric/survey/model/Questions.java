package com.videometric.survey.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int questionId;

    protected int groupId;

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

    public void setModel1(String model1) {
        this.model1 = model1;
    }

    public void setModel2(String model2) {
        this.model2 = model2;
    }
}
