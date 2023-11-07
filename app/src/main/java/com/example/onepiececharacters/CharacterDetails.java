package com.example.onepiececharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.onepiececharacters.databinding.ActivityCharacterDetailsBinding;

public class CharacterDetails extends AppCompatActivity {
    private ActivityCharacterDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_details);
        binding = ActivityCharacterDetailsBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());


        Intent intent = getIntent();
        CharacterInfo selectedCharacter = (CharacterInfo)intent.getSerializableExtra("karakter");
        binding.chName.setText(selectedCharacter.name);
        binding.crewName.setText(selectedCharacter.crew);
        binding.imageView.setImageResource(selectedCharacter.image);
        binding.chInformation.setText(selectedCharacter.info);

    }
}