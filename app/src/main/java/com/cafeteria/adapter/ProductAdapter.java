package com.cafeteria.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cafeteria.databinding.ProductItemBinding;
import com.cafeteria.model.Products;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private final ArrayList<Products> productsList;
    private final Context context;

    public ProductAdapter(ArrayList<Products> productsList, Context context) {
        this.productsList = productsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ProductItemBinding listItem;
        listItem = ProductItemBinding.inflate(LayoutInflater.from(context), parent, false);
        return new ProductViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.binding.productImage.setImageResource(productsList.get(position).getImageProduct());
        holder.binding.productName.setText(productsList.get(position).getNameProduct());
        holder.binding.productDescription.setText(productsList.get(position).getDescriptionProduct());
        holder.binding.productPrice.setText(productsList.get(position).getPriceProduct());
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        ProductItemBinding binding;

        public ProductViewHolder(ProductItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
