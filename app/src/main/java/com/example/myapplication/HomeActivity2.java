package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity2 extends AppCompatActivity {

    private ImageView category1ImageView;
    private TextView category1TextView;
    private ImageView category2ImageView;
    private TextView category2TextView;
    private ImageView category3ImageView;
    private TextView category3TextView;
    private RecyclerView featuredProductsRecyclerView;
    private TextView tvContactInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        // Initialize category views
        category1ImageView = findViewById(R.id.ivCategory1);
        category1TextView = findViewById(R.id.tvCategory1);
        category2ImageView = findViewById(R.id.ivCategory2);
        category2TextView = findViewById(R.id.tvCategory2);
        category3ImageView = findViewById(R.id.ivCategory3);
        category3TextView = findViewById(R.id.tvCategory3);
        tvContactInfo = findViewById(R.id.tvContactInfo);
        featuredProductsRecyclerView = findViewById(R.id.rvFeaturedProducts);

        //add product to RecyclerView
        List<FeaturedProduct> featuredProducts = new ArrayList<>();
        featuredProducts.add(new FeaturedProduct("Organic Fertilizer\nPrice: 1000ghc ", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product1));
        featuredProducts.add(new FeaturedProduct("Fertilizer seeds\nPrice: 2000ghc", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product2));
        featuredProducts.add(new FeaturedProduct("Hand Shovel\nPrice: 500ghc ", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.category3_shop));
        featuredProducts.add(new FeaturedProduct("Organic Fertilizer\nPrice: 1000ghc ", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product1));
        featuredProducts.add(new FeaturedProduct("Fertilizer seeds\nPrice: 2000ghc", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product2));
        featuredProducts.add(new FeaturedProduct("500ghc ", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.category3_shop));

        FeaturedProductsAdapter featuredProductsAdapter = new FeaturedProductsAdapter(featuredProducts);

        featuredProductsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        featuredProductsRecyclerView.setAdapter(featuredProductsAdapter);


        // Set click listeners for category views
        category1ImageView.setOnClickListener(v -> {
            showToast("Category 1 clicked!");
            // Handle the click event
            Intent intent = new Intent(HomeActivity2.this, OganicActivity2.class);
            startActivity(intent);

        });

        category1TextView.setOnClickListener(v -> {
            showToast("Category 1 clicked!");
            // Handle the click event
            Intent intent = new Intent(HomeActivity2.this, OganicActivity2.class);
            startActivity(intent);

        });

        category2ImageView.setOnClickListener(v -> {
            showToast("Category 2 clicked!");
            // Handle the click event
            Intent intent = new Intent(HomeActivity2.this, InorganicActivity2.class);
            startActivity(intent);

        });

        category2TextView.setOnClickListener(v -> {
            showToast("Category 2 clicked!");
            // Handle the click event
            Intent intent = new Intent(HomeActivity2.this, InorganicActivity2.class);
            startActivity(intent);

        });

        category3ImageView.setOnClickListener(v -> {
            showToast("Category 3 clicked!");
            // Handle the click event
            Intent intent = new Intent(HomeActivity2.this, ToolActivity2.class);
            startActivity(intent);

        });

        category3TextView.setOnClickListener(v -> {
            showToast("Category 3 clicked!");
            // Handle the click event
            Intent intent = new Intent(HomeActivity2.this, ToolActivity2 .class);
            startActivity(intent);
            Toast.makeText(HomeActivity2.this, "Sign-in successful!", Toast.LENGTH_SHORT).show();
        });

        // Your additional Java code here
        int sum = addNumbers(5, 3);
        showToast("The sum is: " + sum);
    }

    // A method that adds two numbers and returns the result
    private int addNumbers(int a, int b) {
        return a + b;
    }

    // A method that displays a toast message
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }




    // Set onClick listener for contact information

        public void press(View v) {
            // Handle the click event for contact information
            Intent intent = new Intent(HomeActivity2.this, ContactActivity2.class);
            startActivity(intent);

        }


}
