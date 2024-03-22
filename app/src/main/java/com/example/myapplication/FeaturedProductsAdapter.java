package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Filter;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FeaturedProductsAdapter extends RecyclerView.Adapter<FeaturedProductsAdapter.ViewHolder  > {

    private final List<FeaturedProduct> featuredProducts;
    private Context context;
    private float itemId;


    public FeaturedProductsAdapter(List<FeaturedProduct> featuredProducts) {
        this.featuredProducts = featuredProducts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FeaturedProduct featuredProduct = featuredProducts.get(position);

        holder.ivProduct.setImageResource(featuredProduct.getImageResource());
        holder.tvProductName.setText(featuredProduct.getName());

    }

    @Override
    public int getItemCount() {
        return featuredProducts.size();
    }

    public float getItemId() {
        return itemId;
    }

    public void setItemId(float itemId) {
        this.itemId = itemId;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivProduct;
        TextView tvProductName;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivProduct = itemView.findViewById(R.id.ivAddToCart);
            tvProductName = itemView.findViewById(R.id.tvProductName);
        }


    }



    }
