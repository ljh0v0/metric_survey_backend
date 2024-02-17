package com.videometric.survey.Dto;

import com.videometric.survey.model.Questions;

public class QuestionsDto extends Questions {
    protected int v1Id;
    protected int v2Id;
    protected String v1Url;
    protected String v2Url;

    public QuestionsDto(Questions q) {
        this.questionId = q.getQuestionId();
        this.groupId = q.getGroupId();
        this.model1 = q.getModel1();
        this.model2 = q.getModel2();
    }

    public int getV1Id() {
        return v1Id;
    }

    public int getV2Id() {
        return v2Id;
    }

    public String getV1Url() {
        return v1Url;
    }

    public String getV2Url() {
        return v2Url;
    }

    public void setV1Id(int v1Id) {
        this.v1Id = v1Id;
    }

    public void setV2Id(int v2Id) {
        this.v2Id = v2Id;
    }

    public void setV1Url(String v1Url) {
        this.v1Url = v1Url;
    }

    public void setV2Url(String v2Url) {
        this.v2Url = v2Url;
    }
}
