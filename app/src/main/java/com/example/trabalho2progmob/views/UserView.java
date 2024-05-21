package com.example.trabalho2progmob.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.trabalho2progmob.R;
import com.example.trabalho2progmob.database.LocalDatabase;
import com.example.trabalho2progmob.databinding.ActivityUserViewBinding;
import com.example.trabalho2progmob.entities.User;

public class UserView extends AppCompatActivity {
    private ActivityUserViewBinding binding;
    private LocalDatabase db;
    private int dbUserId;
    private User dbUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        db = LocalDatabase.getDatabase(getApplicationContext());
    }
}