package com.example.onepiececharacters;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onepiececharacters.databinding.RecylerRowBinding;

import java.io.Serializable;
import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.RecyclerHolder> {
    ArrayList<CharacterInfo> CharacterList;

    public CharacterAdapter(ArrayList characterList) {
        this.CharacterList = characterList;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecylerRowBinding recylerRowBinding = RecylerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);


        return new RecyclerHolder(recylerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.binding.RecyclerViewTextView.setText(CharacterList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), CharacterDetails.class);
                intent.putExtra("karakter",  CharacterList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return CharacterList.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private RecylerRowBinding binding;
        public RecyclerHolder(RecylerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
