package com.videometric.survey.controller;


import com.videometric.survey.common.R;
import com.videometric.survey.model.Answers;
import com.videometric.survey.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
@CrossOrigin
public class AnswersController {
    @Autowired
    private AnswersService answersService;

    @PostMapping("/add")
    public R<Answers> add(@RequestBody Answers answers){
        Answers ans = answersService.saveAnswers(answers);
        return R.success(ans);
    }

    @GetMapping("/getAll")
    public R<List<Answers>> getAll(){
        List<Answers> list = answersService.getAllAnswers();
        return R.success(list);
    }
}
