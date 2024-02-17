package com.videometric.survey.controller;

import com.videometric.survey.common.R;
import com.videometric.survey.model.Videos;
import com.videometric.survey.service.VideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videos")
@CrossOrigin
public class VideosController {
    @Autowired
    private VideosService videosService;

    @PostMapping("/add")
    public R<Videos> add(@RequestBody Videos videos){
        Videos v = videosService.saveVideos(videos);
        return R.success(v);
    }

    @GetMapping("/getAll")
    public R<List<Videos>> getAll(){
        List<Videos> list = videosService.getAllVideos();
        return R.success(list);
    }
}
