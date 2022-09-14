package com.FeatheredCuties.FeatheredCuties.repository;

import com.FeatheredCuties.FeatheredCuties.entity.Bird;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdRepository extends JpaRepository<Bird,String> {
}
