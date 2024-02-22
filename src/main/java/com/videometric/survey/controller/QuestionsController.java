package com.videometric.survey.controller;

import com.videometric.survey.Dto.QuestionsDto;
import com.videometric.survey.common.R;
import com.videometric.survey.model.Questions;
import com.videometric.survey.model.Videos;
import com.videometric.survey.service.QuestionsService;
import com.videometric.survey.service.VideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public R<Questions> add(@RequestBody Questions questions){
        Questions q = questionsService.saveQuestions(questions);
        return R.success(q);
    }

    @GetMapping("/getAll")
    public R<List<Questions>> getAll(){
        List<Questions> list = questionsService.getAllQuestions();
        return R.success(list);
    }

    @GetMapping("/{id}")
    public R<QuestionsDto> getById(@PathVariable("id") int id){
        Questions q = questionsService.getById(id);
        QuestionsDto qDto = new QuestionsDto(q);

        Random random = new Random();
        List<Videos> v_list = videosService.getByModelPairId(q.getModelPair());
        int index = random.nextInt(v_list.size());
        Videos v = v_list.get(index);
        qDto.setVideoId(v.getId());
        qDto.setVideoUrl(v.getUrl());

        return R.success(qDto);

    }
}
