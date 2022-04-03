package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        Mockito.verify(feline).getKittens();
        assertEquals(1,actual);
    }

    @Test
    public void getKittensForAnotherSex() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void constructorLionException() {
        try {
            new Lion(feline, "Самей");
            fail("Expected exception was not thrown");
        } catch (Exception exception) {
            assertNotNull(exception);
        }
    }

}