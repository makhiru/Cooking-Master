package com.example.cookingmaster.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.example.cookingmaster.Adapter.Categary_Adapter;
import com.example.cookingmaster.R;
import com.example.cookingmaster.Models.Recipes;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BottomNavigationView bnview;
    Categary_Adapter adapter;

    ArrayList<Recipes> arrcook = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        bnview = findViewById(R.id.bnview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrcook.add(new Recipes(R.drawable.bread, "Garlic Bread"));
        arrcook.add(new Recipes(R.drawable.burger, "Burger"));
        arrcook.add(new Recipes(R.drawable.pasta, "Pasta"));
        arrcook.add(new Recipes(R.drawable.pizza, "Pizza"));
        arrcook.add(new Recipes(R.drawable.maggi, "Maggi"));

        adapter = new Categary_Adapter(this, arrcook);
        recyclerView.setAdapter(adapter);
    }

    public static class Splash_Screen extends AppCompatActivity {

        ImageView spalshimg;

        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);

            spalshimg = findViewById(R.id.splashimage);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Splash_Screen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, 3000);
        }
    }
}