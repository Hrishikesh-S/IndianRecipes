package com.example.indianrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Category4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category4);
    }
    //Go back to categories
    public void returnToRecipes(View view)
    {
        Intent intent = new Intent(this, Recipes.class);
        startActivity(intent);
    }
    //Opens the recipe for Chumuri Snack
    public void loadChurmuriSnack(View view)
    {
        Intent intent = new Intent(this, ChurmuriSnack.class);
        startActivity(intent);
    }
    //Opens the recipe for mushroom manchurian
    public void loadMushroomManchurian(View view)
    {
        Intent intent = new Intent(this, Mushroom_Manchurian.class);
        startActivity(intent);
    }
    //Opens the recipe for vegetable noodles
    public void loadVegetableNoodles(View view)
    {
        Intent intent = new Intent(this, VegetableNoodles.class);
        startActivity(intent);
    }

    //Opens the recipe for vegetable manchurian
    public void loadVegetableManchurian(View view)
    {
        Intent intent = new Intent(this, VegetableManchurian.class);
        startActivity(intent);
    }
}