package com.example.e6m5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.e6m5.databinding.ItemBinding;


import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter <PlaceAdapter.ViewHolder> {
    private List<Paisaje> place;

    public PlaceAdapter() {

    }

    @NonNull
    @Override
    public PlaceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceAdapter.ViewHolder holder, int position) {
        Paisaje item = place.get(position);
        holder.showData(item);

    }

    @Override
    public int getItemCount() {

        return place.size();
    }

    public void setData(List<Paisaje> place) {
        this.place = place;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding newbinding;

        public ViewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
            newbinding = binding;
        }

        public void showData(Paisaje item) {
            newbinding.placeText.setText(item.getNombre());
            Glide.with(newbinding.getRoot()).load(item.getUrl()).into(newbinding.placeImage);
            newbinding.placeImage.setOnClickListener(v -> {
                Bundle bundle = new Bundle();
                bundle.putString("Place Name", item.getNombre());
                bundle.putString("URL", item.getUrl());
                Navigation.findNavController(newbinding.getRoot()).navigate(R.id.action_placeFragment_to_detalleFragment, bundle);
            });
        }
    }
}



