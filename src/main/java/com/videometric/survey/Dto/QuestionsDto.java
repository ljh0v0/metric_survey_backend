package com.videometric.survey.Dto;

import com.videometric.survey.model.Questions;

public class QuestionsDto extends Questions {
    protected int videoId;
    protected String videoUrl;

    public QuestionsDto(Questions q) {
        this.questionId = q.getQuestionId();
        this.groupId = q.getGroupId();
        this.modelPair = q.getModelPair();
    }

    public int getVideoId() {
        return videoId;
    }


    public String getVideoUrl() {
        return videoUrl;
    }


    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

}
