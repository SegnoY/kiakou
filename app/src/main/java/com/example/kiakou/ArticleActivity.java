package com.example.kiakou;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class ArticleActivity extends AppCompatActivity {
    private TextView prix,description;
    private ImageView article;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_accueil_row);

        prix = (TextView) findViewById(R.id.prix);
        description = (TextView) findViewById(R.id.desc);
        article = findViewById(R.id.a);


        // Recieve data
        Intent intent = getIntent();
        String prixA = intent.getExtras().getString("Prix");
        String DescriptionA = intent.getExtras().getString("Description");
        String articl = intent.getExtras().getString("Url") ;
        // Setting values

        prix.setText(prixA);
        description.setText(DescriptionA);
        String imageUri = "drawable://" + R.drawable.kiakou;
        System.out.println(imageUri);

            System.out.println("je comprends pas");
        Picasso.with(this).load(imageUri).into(article);


    }

}
