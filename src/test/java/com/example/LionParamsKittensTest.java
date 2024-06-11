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
    public int kittensCount;
    @Parameterized.Parameter(1)
    public int expectedKittensCount;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                { 3, 3 },
                { 4, 4 }
        };
    }

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getKittensLionTest(){
        Lion lion = new Lion(feline);

        Mockito.when(feline.getKittens()).thenReturn(kittensCount);
        int actual = lion.getKittens();

        assertEquals(expectedKittensCount, actual);
    }
}
