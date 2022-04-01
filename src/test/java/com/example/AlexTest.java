package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AlexTest {

    private final Feline feline = new Feline();
    private final Alex alex = new Alex(feline);

    @Test
    public void getFriends() {
        List<String> actual = alex.getFriends();
        assertEquals(List.of("Марти", "Глории", "Мелман"), actual);
    }

    @Test
    public void getPlaceOfLiving() {
        String actual = alex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", actual);
    }

    @Test
    public void getKittens() {
        int actual = alex.getKittens();
        assertEquals(0, actual);
    }
}