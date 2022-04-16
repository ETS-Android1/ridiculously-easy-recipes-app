package com.example.recipe;

public class RecipesClass {

    private String name;
    private String ingredients;
    private String directionsHeader;
    private String recipe;
    private int thumbnail;


    public RecipesClass(String name, String ingredients, String directionsHeader, String recipe, int thumbnail){

        this.name = name;
        this.ingredients = ingredients;
        this.directionsHeader = directionsHeader;
        this.recipe = recipe;
        this.thumbnail = thumbnail;

    }


    public  String getName(){

        return name;
    }
    public String getIngredients(){
        return ingredients;
    }

    public String getDirectionsHeader(){
        return directionsHeader;
    }

    public String getRecipe(){
        return recipe;
    }

    public int getThumbnail(){
        return thumbnail;
    }
}
