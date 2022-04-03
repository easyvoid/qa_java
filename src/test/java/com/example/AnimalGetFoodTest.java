package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalGetFoodTest {

    private final Animal animal = new Animal();
    private List<String> actual;

    @Test
    public void getFoodHerbivore() throws Exception {
        actual = animal.getFood("Травоядное");
        assertEquals(List.of("Трава", "Различные растения"), actual);
    }

    @Test
    public void getFoodPredator() throws Exception {
        actual = animal.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void getFoodException() {
        try {
            animal.getFood("Млекопитающее");
            fail("Expected exception was not thrown");
        } catch (Exception exception) {
            assertNotNull(exception);
        }
    }
}