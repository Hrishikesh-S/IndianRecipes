package com.example.indianrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Category2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category2);
    }
    //Opens the recipe for Plantain Chips
    public void loadPlantainChips(View view)
    {
        Intent intent = new Intent(this, PlantainChips.class);
        startActivity(intent);
    }
    //Opens the recipe for Eggplant Fry
    public void loadEggplantFry(View view)
    {
        Intent intent = new Intent(this, EggplantFry.class);
        startActivity(intent);
    }
    //Opens the recipe for Okra Fry
    public void loadOkraFry(View view)
    {
        Intent intent = new Intent(this, OkraFry.class);
        startActivity(intent);
    }
    //Opens the recipe for red cabbage balls
    public void loadCabbageBalls(View view)
    {
        Intent intent = new Intent(this, RedCabbageBalls.class);
        startActivity(intent);
    }

    //Go back to categories
    public void returnToRecipes(View view)
    {
        Intent intent = new Intent(this, Recipes.class);
        startActivity(intent);
    }
}