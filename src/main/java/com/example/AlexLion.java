package com.example;

import java.util.List;

public class AlexLion extends Lion{

    public AlexLion(Feline feline, String sex) throws Exception {
        super(feline, sex);

        if ("Самец".equals(sex)) {
                hasMane = true;
        } else { throw new Exception("Используйте допустимые значения пола животного - самец");
            }
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends (){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

}
