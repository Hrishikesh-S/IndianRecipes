package com.example.indianrecipes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

public class SteamedRice extends AppCompatActivity {

    private StorageReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steamed_rice);
        reference = FirebaseStorage.getInstance().getReference().child("SteamedRice.PNG");

        //displays the current recipe from the database as an image file
        try {
            final File storedImage = File.createTempFile("SteamedRice", "PNG");
            reference.getFile(storedImage).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Toast.makeText(SteamedRice.this, "Success",Toast.LENGTH_SHORT).show();
                    Bitmap bitmap = BitmapFactory.decodeFile(storedImage.getAbsolutePath());
                    ImageView view = ((ImageView)findViewById(R.id.imageView20));
                    view.setImageBitmap(bitmap);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(SteamedRice.this, "Failed",Toast.LENGTH_SHORT).show();
                }
            });
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }
    //goes back to rice items and chapathi
    public void returnToRiceAndChapathi(View view)
    {
        Intent intent = new Intent(this, Category5.class);
        startActivity(intent);
    }
}