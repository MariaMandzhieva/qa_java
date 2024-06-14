package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class AlexLionExceptionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    Feline feline;

    @Test
    public void getKittensAlexLionTest() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самец");

        AlexLion alexLion = new AlexLion(feline, "Самка");
        int actual = alexLion.getKittens();
        int expected = 0;

        assertEquals(expected, actual);

        thrown = ExpectedException.none();
    }
}
