package com.videometric.survey.controller;


import com.videometric.survey.common.R;
import com.videometric.survey.model.Models;
import com.videometric.survey.service.ModelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/models")
@CrossOrigin
public class ModelsController {
    @Autowired
    private ModelsService modelsService;

    @PostMapping("/add")
    public R<Models> add(@RequestBody Models models){
        Models m = modelsService.saveModels(models);
        return R.success(m);
    }

    @GetMapping("/getAll")
    public R<List<Models>> getAll(){
        List<Models> list = modelsService.getAllModels();
        return R.success(list);
    }
}
