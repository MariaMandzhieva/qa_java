package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamsKittensTest {
    @Mock
    private Feline feline;

    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public int kittensCount;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                { "Самец", 0 },
                { "Самка", 4 }
        };
    }

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getKittensLionTest() throws Exception{
        Lion lion = new Lion(feline, sex);

        Mockito.when(feline.getKittens()).thenReturn(kittensCount);
        int actual = lion.getKittens();
        int expectedKittensCount = kittensCount;

        assertEquals(expectedKittensCount, actual);
    }
}
