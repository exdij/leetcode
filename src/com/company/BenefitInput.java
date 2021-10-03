package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum BenefitInput {
    firstName(1),
    surname(2),
    email(3),
    phoneNumber(4),
    pesel(5),
    idNumber(6),
    address(7),
    crspAddress(8),
    gender(9),
    dateOfBirth(10);

    private final int id;
    private BenefitInput(int id){
        this.id = id;
    }
    public int getId(){
        return id;

    }

}
