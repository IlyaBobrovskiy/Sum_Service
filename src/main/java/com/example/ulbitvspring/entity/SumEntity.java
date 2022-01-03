package com.example.ulbitvspring.entity;

import javax.persistence.*;

@Entity
@Table(name = "sum_values")
public class SumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public String name;
    public Integer value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SumEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
