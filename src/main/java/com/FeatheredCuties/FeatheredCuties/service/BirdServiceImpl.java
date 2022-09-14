package com.FeatheredCuties.FeatheredCuties.service;

import com.FeatheredCuties.FeatheredCuties.entity.Bird;
import com.FeatheredCuties.FeatheredCuties.repository.BirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BirdServiceImpl implements BirdService {
    @Autowired
    private BirdRepository birdRepository;

    @Override
    public Bird saveBird(Bird bird) {
        return birdRepository.save(bird);
    }

    @Override
    public List<Bird> fetchBirdList() {
        return birdRepository.findAll();
    }


    }



