package com.videometric.survey.Dto;

import com.videometric.survey.model.Questions;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public class QuestionsDto extends Questions {
    protected List<Integer> videoIds;
    protected List<String> videoUrls;

    public QuestionsDto(Questions q) {
        this.questionId = q.getQuestionId();
        this.groupId = q.getGroupId();
        this.modelPair = q.getModelPair();
        this.model1 = q.getModel1();
        this.model2 = q.getModel2();
    }

    public List<Integer> getVideoIds() {
        return videoIds;
    }

    public List<String> getVideoUrls() {
        return videoUrls;
    }

    public void setVideoIds(List<Integer> videoIds) {
        this.videoIds = videoIds;
    }

    public void setVideoUrls(List<String> videoUrls) {
        this.videoUrls = videoUrls;
    }
}
