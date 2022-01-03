package com.example.ulbitvspring;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class Views {


    @JsonProperty("code")
    private int code;
    @JsonProperty("description")
    private String description;
    @JsonProperty("sum")
    private Integer sum;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Views() {
        this.code = 0;
        this.description = "OK";
    }

    public Views(int sum) {
        this.code = 0;
        this.description = "OK";
        this.sum = sum;
    }
}
