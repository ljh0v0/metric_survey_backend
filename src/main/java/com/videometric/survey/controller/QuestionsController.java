package com.videometric.survey.controller;

import com.videometric.survey.Dto.QuestionsDto;
import com.videometric.survey.common.R;
import com.videometric.survey.model.Counter;
import com.videometric.survey.model.Questions;
import com.videometric.survey.model.Videos;
import com.videometric.survey.service.CounterService;
import com.videometric.survey.service.QuestionsService;
import com.videometric.survey.service.VideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/questions")
@CrossOrigin
public class QuestionsController {
    @Autowired
    private QuestionsService questionsService;

    @Autowired
    private VideosService videosService;

    @Autowired
    private CounterService counterService;

    @PostMapping("/add")
    public R<Questions> add(@RequestBody Questions questions){
        Questions q = questionsService.saveQuestions(questions);
        return R.success(q);
    }

    @GetMapping("/getAll")
    public R<List<Questions>> getAll(){
        int surveyNum = questionsService.getMaxSurveyId() + 1;
        Counter c = counterService.hitCounter();
        int sId = c.getCnt() % surveyNum;
        List<Questions> list = questionsService.getBySurveyId(sId);
        return R.success(list);
    }

    @GetMapping("/{id}")
    public R<QuestionsDto> getById(@PathVariable("id") int id){
        Questions q = questionsService.getById(id);
        QuestionsDto qDto = new QuestionsDto(q);

        Random random = new Random();
        List<Videos> v_list = videosService.getByModelPairId(q.getModelPair());
        List<Integer> vids = new ArrayList<>();
        List<String> vUrls = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        while(set.size() < 3){
            int index = random.nextInt(v_list.size());
            if (!set.contains(index)){
                Videos v = v_list.get(index);
                vids.add(v.getId());
                vUrls.add(v.getUrl());
                set.add(index);
            }
        }
        qDto.setVideoIds(vids);
        qDto.setVideoUrls(vUrls);
        return R.success(qDto);

    }
}
