package com.example.indianrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Category5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category5);
    }

    //Go back to categories
    public void returnToRecipes(View view)
    {
        Intent intent = new Intent(this, Recipes.class);
        startActivity(intent);
    }
    //Opens the recipe for Egg Biryani
    public void loadEggBiryani(View view)
    {
        Intent intent = new Intent(this, EggBiryani.class);
        startActivity(intent);
    }
    //Opens the recipe for Vegetable Biryani
    public void loadVegetableBiryani(View view)
    {
        Intent intent = new Intent(this, VegetableBiryani.class);
        startActivity(intent);
    }
    //Opens the recipe for tamarind rice
    public void loadTamarindRice(View view)
    {
        Intent intent = new Intent(this, TamarindRice.class);
        startActivity(intent);
    }
    //Opens the recipe for steamed rice
    public void loadSteamedRice(View view)
    {
        Intent intent = new Intent(this, SteamedRice.class);
        startActivity(intent);
    }
    //Opens the recipe for chapathi
    public void loadChapathi(View view)
    {
        Intent intent = new Intent(this, Chapathi.class);
        startActivity(intent);
    }
}