package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;

public class LionExceptionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void doesHaveManeTest() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самец или самка");

        String actualSex = "Жен";
        Lion lioness = new Lion(actualSex);

        assertFalse(lioness.doesHaveMane());

        thrown = ExpectedException.none();
    }
}
