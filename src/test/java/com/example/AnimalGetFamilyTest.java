package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalGetFamilyTest {

    @Test
    public void getFamily() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actual);
    }
}