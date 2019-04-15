package com.epam.Builder;

public class Recipe {
    private String medicament;
    private String durationOfTherapy;
    private int extensionOfTherapyInDays;

    private Recipe(RecipeBuilder builder){
        this.medicament = builder.medicament;
        this.durationOfTherapy = builder.durationOfTherapy;
        this.extensionOfTherapyInDays = builder.extensionOfTherapyInDays;
    }

    public static class RecipeBuilder{
        private String medicament;
        private String durationOfTherapy;
        private int extensionOfTherapyInDays;

        public RecipeBuilder(String medicament, String durationOfTherapy) {
            this.medicament = medicament;
            this.durationOfTherapy = durationOfTherapy;
        }

        public RecipeBuilder(Recipe recipe){
            this.medicament = recipe.medicament;
            this.durationOfTherapy = recipe.durationOfTherapy;
            this.extensionOfTherapyInDays = recipe.extensionOfTherapyInDays;
        }

        public RecipeBuilder setExtensionOfTherapyInDays(int extensionOfTherapyInDays) {
            this.extensionOfTherapyInDays = extensionOfTherapyInDays;
            return this;
        }

        public Recipe build(){
            return new Recipe(this);
        }
    }

    @Override
    public String toString() {
        return "Recipe: " +
                "medicament: " + medicament +
                ", durationOfTherapy: " + durationOfTherapy +
                ", extension of therapy in days: " + extensionOfTherapyInDays;
    }
}
