package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getKittensFelineTest(){
        Feline feline = new Feline();

        int actual = feline.getKittens();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void getFamilyFelineTest(){
        Feline feline = new Feline();

        String actual = feline.getFamily();
        String expected = "Кошачьи";

        assertEquals(expected, actual);
    }

    @Test
    public void eatMeatFelineTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();

        assertEquals(expectedFood, actualFood);
    }
}
