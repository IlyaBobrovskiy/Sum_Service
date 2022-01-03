package com.example.sumservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "sum_values")
public class SumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "name")
    public String name;
    @Column(name = "value")
    public Integer value;

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
