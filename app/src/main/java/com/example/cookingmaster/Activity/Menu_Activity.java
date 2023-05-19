package com.example.cookingmaster.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.cookingmaster.Adapter.Sub_Categary_Adapter;
import com.example.cookingmaster.Models.Menu;
import com.example.cookingmaster.R;

import java.util.ArrayList;

public class Menu_Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    Sub_Categary_Adapter adapter;
    ArrayList<Menu> arrmenu = new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerView = findViewById(R.id.recyclerviewmenu);

        int i = getIntent().getIntExtra("pose", 0);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        if (i == 1) {
            arrmenu.add(new Menu(R.drawable.bread, "Asian Garlic Bread", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.garlic_cheese, "Garlic Chese Bread", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.garlic_mayo, "Garlic Mayo Bread", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.garlic_oregano, "Garlic spe. Bread", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.garlic_simple, "Garlic Simple Bread", "334.6 Clories", "25 min", "views : 37263"));

            adapter = new Sub_Categary_Adapter(arrmenu, this);

        } else if (i == 2) {
            arrmenu.add(new Menu(R.drawable.burger_simple, "Burger Simple", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.burger, "Burger ", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.burger_chicken, "Burger Chicken", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.burger_cheese, "Burger Cheese", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.burger_double_cheese, "Burger Double Cheese", "334.6 Clories", "25 min", "views : 37263"));

            adapter = new Sub_Categary_Adapter(arrmenu, this);

        } else if (i == 3) {
            arrmenu.add(new Menu(R.drawable.pasta, "Pasta", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.pasta_simple, "Pasta Simple", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.pasta_rounded, "Pasta Rounded", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.pasta_garlic, "Pasta Garlic", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.pasta_cheese, "Pasta Cheese", "334.6 Clories", "25 min", "views : 37263"));

            adapter = new Sub_Categary_Adapter(arrmenu, this);

        } else if (i == 4) {
            arrmenu.add(new Menu(R.drawable.pizza, "Pizza ", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.pizza_garlic, "Pizza Garlic", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.pizza_cheese, "Pizza Cheese", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.pizza_vegetable, "Pizza Vegetables", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.pizza_paneer, "Pizza Paneer", "334.6 Clories", "25 min", "views : 37263"));

            adapter = new Sub_Categary_Adapter(arrmenu, this);

        } else if (i == 5) {
            arrmenu.add(new Menu(R.drawable.maggi_simple, "Maggi Simple ", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.maggi, "Maggi", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.maggi_cheese, "Maggi Cheese", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.maggi_paner, "Maggi Paneer", "334.6 Clories", "25 min", "views : 37263"));
            arrmenu.add(new Menu(R.drawable.maggi_spicy, "Maggi Spicy", "334.6 Clories", "25 min", "views : 37263"));

            adapter = new Sub_Categary_Adapter(arrmenu, this);

        }
        recyclerView.setAdapter(adapter);

    }
}