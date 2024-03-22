package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ToolActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool2);
        RecyclerView featuredProductsRecyclerView = findViewById(R.id.rvFeaturedProducts);

        List<FeaturedProduct> featuredProducts = new ArrayList<>();
        featuredProducts.add(new FeaturedProduct("imageResource", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product1));
        featuredProducts.add(new FeaturedProduct("imageResource", "Fertilizer seeds\nPrice: 2000ghc", R.drawable.product2));
        featuredProducts.add(new FeaturedProduct("imageResource", "Hand Shovel\nPrice: 500ghc ", R.drawable.category3_shop));
        featuredProducts.add(new FeaturedProduct("imageResource", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product1));
        featuredProducts.add(new FeaturedProduct("imageResource", "Fertilizer seeds\nPrice: 2000ghc", R.drawable.product2));
        featuredProducts.add(new FeaturedProduct("imageResource", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product1));
        featuredProducts.add(new FeaturedProduct("imageResource", "Fertilizer seeds\nPrice: 2000ghc", R.drawable.product2));
        featuredProducts.add(new FeaturedProduct("imageResource", "Hand Shovel\nPrice: 500ghc ", R.drawable.category3_shop));
        featuredProducts.add(new FeaturedProduct("imageResource", "Organic Fertilizer\nPrice: 1000ghc ", R.drawable.product1));
        featuredProducts.add(new FeaturedProduct("imageResource", "Fertilizer seeds\nPrice: 2000ghc", R.drawable.product2));

        FeaturedProductsAdapter featuredProductsAdapter = new FeaturedProductsAdapter(featuredProducts);
        featuredProductsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        featuredProductsRecyclerView.setAdapter(featuredProductsAdapter);


    }
    public void out(View v) {
        // Handle the click event for contact information
        Intent intent = new Intent(this, ContactActivity2.class);
        startActivity(intent);

    }
}