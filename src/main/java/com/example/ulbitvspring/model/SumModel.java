package com.example.ulbitvspring.model;

import com.example.ulbitvspring.entity.SumEntity;

public class SumModel {

    private String name;
    private Integer value;

    public SumModel() {
    }

    public static SumModel toModel(SumEntity entity) {
        SumModel sumModel = new SumModel();
        sumModel.setName(entity.getName());
        sumModel.setValue(entity.getValue());
        return sumModel;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
