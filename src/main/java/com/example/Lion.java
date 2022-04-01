package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    Feline feline;
    String sex;

    public Lion(Feline feline, String sex) throws Exception {
        this.feline = feline;
        this.sex = sex;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public Lion(Feline feline) {
        this.feline = feline;
        sex = "Самец";
        hasMane = true;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
