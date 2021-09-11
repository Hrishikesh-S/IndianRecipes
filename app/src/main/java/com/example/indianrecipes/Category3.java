package com.example.indianrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Category3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category3);
    }

    //Opens the recipe for Chole Masala
    public void loadCholeMasala(View view)
    {
        Intent intent = new Intent(this, CholeMasala.class);
        startActivity(intent);
    }
    //Opens the recipe for Paneer Butter Masala
    public void loadPaneerButterMasala(View view)
    {
        Intent intent = new Intent(this, PaneerButterMasala.class);
        startActivity(intent);
    }
    //Opens the recipe for Broad Beans Curry
    public void broadBeansCurry(View view)
    {
        Intent intent = new Intent(this, BroadBeansCurry.class);
        startActivity(intent);
    }
    //Opens the recipe for Cabbage Dal Curry
    public void loadCabbageDalCurry(View view)
    {
        Intent intent = new Intent(this, CabbageDalCurry.class);
        startActivity(intent);
    }

    //Opens the recipe for Bell pepper and carrot curry
    public void loadBellPepperAndCarrotCurry(View view)
    {
        Intent intent = new Intent(this, BellPepperAndCarrotCurry.class);
        startActivity(intent);
    }
    //Opens the recipe for Sambar
    public void loadSambar(View view)
    {
        Intent intent = new Intent(this, Sambar.class);
        startActivity(intent);
    }
    //Go back to categories
    public void returnToRecipes(View view)
    {
        Intent intent = new Intent(this, Recipes.class);
        startActivity(intent);
    }
}