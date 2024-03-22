package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InorganicActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inorganic2);
        RecyclerView featuredProductsRecyclerView = findViewById(R.id.rvFeaturedProducts);

        List<FeaturedProduct> featuredProducts = new ArrayList<>();
        featuredProducts.add(new FeaturedProduct("Organic Fertilizer\nPrice: 1000ghc ", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product1));
        featuredProducts.add(new FeaturedProduct("Fertilizer seeds\nPrice: 2000ghc", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product2));
        featuredProducts.add(new FeaturedProduct("Hand Shovel\nPrice: 500ghc ", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.category3_shop));
        featuredProducts.add(new FeaturedProduct("Organic Fertilizer\nPrice: 1000ghc ", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product1));
        featuredProducts.add(new FeaturedProduct("Fertilizer seeds\nPrice: 2000ghc", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product2));
        featuredProducts.add(new FeaturedProduct("Organic Fertilizer\nPrice: 1000ghc ", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product1));
        featuredProducts.add(new FeaturedProduct("Fertilizer seeds\nPrice: 2000ghc", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product2));
        featuredProducts.add(new FeaturedProduct("Hand Shovel\nPrice: 500ghc ", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.category3_shop));
        featuredProducts.add(new FeaturedProduct("Organic Fertilizer\nPrice: 1000ghc ", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product1));
        featuredProducts.add(new FeaturedProduct("Fertilizer seeds\nPrice: 2000ghc", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product2));

        FeaturedProductsAdapter featuredProductsAdapter = new FeaturedProductsAdapter(featuredProducts);
        featuredProductsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        featuredProductsRecyclerView.setAdapter(featuredProductsAdapter);

        // Set onClick listener for contact information


    }
    public void add(View v) {
        // Handle the click event for contact information
        Intent intent = new Intent(this, ContactActivity2.class);
        startActivity(intent);

    }
}