package com.example;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        List<String> actualList = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualList);
    }

    @Test
    public void getFamily() {
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }

    @Test
    public void getKittens() {
        int actual = feline.getKittens();
        assertEquals(1, actual);
    }
}