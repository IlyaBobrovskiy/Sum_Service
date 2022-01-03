package com.example.sumservice;


import com.example.sumservice.model.SumModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestModel {

    @JsonProperty("name")
    public String name;
    @JsonProperty("value")
    public Integer value;
    @JsonProperty("first")
    public  Integer first;
    @JsonProperty("second")
    public Integer second;

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

    public SumModel getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public SumModel getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }
}
