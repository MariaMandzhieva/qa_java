package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {
    @Mock
    private Feline feline;

    @Test
    public void getKittensAlexLionTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline, "Самец");
        int actual = alexLion.getKittens();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void getFriendsAlexLionTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline, "Самец");
        List<String> actual = alexLion.getFriends();
        List<String> expected = List.of("Марти", "Глория", "Мелман");

        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingAlexLionTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline, "Самец");
        String actual = alexLion.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";

        assertEquals(expected, actual);
    }
}
