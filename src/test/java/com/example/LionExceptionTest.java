package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;

public class LionExceptionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    Feline feline;

    @Test
    public void doesHaveManeTest() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самец или самка");

        String sex = "Жен";
        Lion lion = new Lion(feline, sex);

        assertFalse(lion.doesHaveMane());

        thrown = ExpectedException.none();
    }
}
