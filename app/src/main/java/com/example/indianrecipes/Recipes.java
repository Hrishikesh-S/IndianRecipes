package com.example.indianrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import android.view.View;
public class Recipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
    }

    //Go back to Main menu
    public void returnToMain(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    //Opens the first category of recipes
    public void loadCategory1(View view)
    {
        Intent intent = new Intent(this, Category1.class);
        startActivity(intent);
    }
    //Opens the second category of recipes
    public void loadCategory2(View view)
    {
        Intent intent = new Intent(this, Category2.class);
        startActivity(intent);
    }
    //Opens the third category of recipes
    public void loadCategory3(View view)
    {
        Intent intent = new Intent(this, Category3.class);
        startActivity(intent);
    }
    //Opens the fourth category of recipes
    public void loadCategory4(View view)
    {
        Intent intent = new Intent(this, Category4.class);
        startActivity(intent);
    }
    //Opens the fifth category of recipes
    public void loadCategory5(View view)
    {
        Intent intent = new Intent(this, Category5.class);
        startActivity(intent);
    }
}