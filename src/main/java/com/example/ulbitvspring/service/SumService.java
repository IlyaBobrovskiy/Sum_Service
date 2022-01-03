package com.example.ulbitvspring.service;

import com.example.ulbitvspring.entity.SumEntity;
import com.example.ulbitvspring.exception.SumNotFoundException;
import com.example.ulbitvspring.model.SumModel;
import com.example.ulbitvspring.repository.SumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SumService {

    @Autowired
    private SumRepo userRepo;

    public SumModel getOne(String name) throws SumNotFoundException {
        SumEntity entity = userRepo.findByName(name);
        if (entity == null) {
            throw new SumNotFoundException("Значение не найдено");
        }
        return SumModel.toModel(entity);
    }

    public boolean add(String name, Integer value) {
        SumEntity entity = new SumEntity();
        entity.setName(name);
        entity.setValue(value);
        userRepo.save(entity);
    }

    public void delete(String name) throws SumNotFoundException {
        SumEntity entity = userRepo.findByName(name);
        if (entity != null) {
            userRepo.delete(entity);
        } else {
            throw new SumNotFoundException("Значение не найдено");
        }
    }


}

