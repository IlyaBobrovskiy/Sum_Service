package com.example.ulbitvspring.repository;

import com.example.ulbitvspring.entity.SumEntity;
import org.springframework.data.repository.CrudRepository;

public interface SumRepo extends CrudRepository<SumEntity, String> {

    SumEntity findByName(String name);


}
