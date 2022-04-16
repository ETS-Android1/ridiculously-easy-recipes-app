package com.example.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    private TextView recipeNameTV;
    private TextView recipeIngredientsTV;
    private TextView recipeDirectionsHeaderTV;
    private TextView recipeTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        recipeNameTV = (TextView)findViewById(R.id.text_recipe);
        recipeIngredientsTV = (TextView)findViewById(R.id.ingredients);
        recipeDirectionsHeaderTV = (TextView)findViewById(R.id.method);
        recipeTV = (TextView)findViewById(R.id.recipe);

        Intent intent = getIntent();
        String titleString = intent.getExtras().getString("RecipeName");
        String ingredientsString = intent.getExtras().getString("RecipeIngredients");
        String directionsString = intent.getExtras().getString("RecipeMethodTitle");
        String recipeString = intent.getExtras().getString("Recipe");

        recipeNameTV.setText(titleString);
        recipeIngredientsTV.setText(ingredientsString);
        recipeDirectionsHeaderTV.setText(directionsString);
        recipeTV.setText(recipeString);

    }
}
