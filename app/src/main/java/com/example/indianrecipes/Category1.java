package com.example.indianrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import android.view.View;

public class Category1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category1);
    }

    //Opens the recipe for Gulab Jamun
    public void loadGulabJamun(View view)
    {
        Intent intent = new Intent(this, GulabJamun.class);
        startActivity(intent);
    }
    //Opens the recipe for Laddu
    public void loadLaddu(View view)
    {
        Intent intent = new Intent(this, Laddu.class);
        startActivity(intent);
    }
    //Go back to categories
    public void returnToRecipes(View view)
    {
        Intent intent = new Intent(this, Recipes.class);
        startActivity(intent);
    }
}