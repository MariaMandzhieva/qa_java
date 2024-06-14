package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class LionParamsFoodTest {

    @Mock
    private Feline feline;

    @Parameterized.Parameter
    public String sex;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                { "Самец" },
                { "Самка" }
        };
    }

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion(feline, sex);

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actual = lion.getFood();

        assertEquals(expectedFood, actual);
    }

}
