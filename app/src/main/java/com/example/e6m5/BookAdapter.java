package com.example.e6m5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.e6m5.databinding.ItemLayoutBinding;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter <BookAdapter.ViewHolder>{
    private List<String> books;

    @NonNull
    @Override
    public BookAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemLayoutBinding binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdapter.ViewHolder holder, int position) {
        String item =books.get(position);
        holder.showData(item);

    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemLayoutBinding newbinding;
        public ViewHolder(@NonNull ItemLayoutBinding binding) {
            super(binding.getRoot());
            newbinding = binding;
        }

        public void showData(String item) {
            Glide.with(newbinding.getRoot()).load(item).into(newbinding.imageView);
        }
    }
}
