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
        List<Videos> v_list1 = videosService.getByModelId(q.getModel1());
        int index1 = random.nextInt(v_list1.size());
        Videos v1 = v_list1.get(index1);
        qDto.setV1Id(v1.getId());
        qDto.setV1Url(v1.getUrl());

        List<Videos> v_list2 = videosService.getByModelId(q.getModel2());
        int index2 = random.nextInt(v_list2.size());
        Videos v2 = v_list2.get(index2);
        qDto.setV2Id(v2.getId());
        qDto.setV2Url(v2.getUrl());

        return R.success(qDto);

    }
}
