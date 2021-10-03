package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Input {
    String name;
    Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Input(String name, Integer id){
        this.name = name;
        this.id = id;
    }
    public Input(){

    }


}
