package com.example.trabalho2progmob.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.trabalho2progmob.R;
import com.example.trabalho2progmob.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}