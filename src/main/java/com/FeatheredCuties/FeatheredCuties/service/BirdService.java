package com.FeatheredCuties.FeatheredCuties.service;

import com.FeatheredCuties.FeatheredCuties.entity.Bird;

import java.util.List;

public interface BirdService {
  public  Bird saveBird(Bird bird);


 public  List<Bird> fetchBirdList();


}
