package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittensLionTest() {
        Lion lion = new Lion(feline);

        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void doesHaveManeTest() throws Exception {

        String actualSex = "Самка";
        Lion lioness = new Lion(actualSex);

        assertFalse(lioness.doesHaveMane());

    }

    @Test
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion(feline);

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actual = lion.getFood();

        assertEquals(expectedFood, actual);
    }

}
