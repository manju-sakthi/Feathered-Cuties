package com.FeatheredCuties.FeatheredCuties.controller;

import com.FeatheredCuties.FeatheredCuties.entity.Bird;
import com.FeatheredCuties.FeatheredCuties.service.BirdService;
import com.FeatheredCuties.FeatheredCuties.service.BirdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BirdController {
    @Autowired
    private BirdService birdService;

    @PostMapping("/birds")
    public Bird saveBird(@RequestBody Bird bird) {
        return birdService.saveBird(bird);
    }
    @GetMapping("/birds")
        public List<Bird> fetchBirdList(Bird bird){
        return  birdService.fetchBirdList();
    }

}
