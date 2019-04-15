package com.epam.Builder;

public class Main {
    public static void main(String[] args) {
        Recipe recipe = new Recipe.RecipeBuilder("Lorem ipsum", "12.03.19-23.03.19").build();
        System.out.println(recipe);

        Recipe extendedRecipe = new Recipe.RecipeBuilder(recipe).setExtensionOfTherapyInDays(5).build();
        System.out.println(extendedRecipe);
    }
}
