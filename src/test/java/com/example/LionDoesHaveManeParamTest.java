package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionDoesHaveManeParamTest {

    @Mock
    Feline feline;

    String sex;
    boolean expected;


    public LionDoesHaveManeParamTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getLionSexData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},

        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected,actual);
    }
}