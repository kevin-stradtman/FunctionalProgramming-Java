package com.stradtman;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> ingredients = Arrays.asList(
                "flour",
                "salt",
                "baking powder",
                "butter",
                "eggs",
                "milk"
        );
//        boolean hasEggs = false;
//        for (String ingredient : ingredients) {
//            if (ingredient.equals("eggs")) {
//                hasEggs = true;
//                break;
//            }
//        }
        if (ingredients.contains("eggs")) {
            System.out.println("Sorry the food has eggs in it!");
        }
    }
}
