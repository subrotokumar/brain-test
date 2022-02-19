package com.subrotokumar.braintest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.subrotokumar.braintest.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnContinue.setOnClickListener(v -> {
            String name = binding.etInputName.getText().toString().trim().toLowerCase();
            if(name.length()>0) {
                Intent i = new Intent(HomeActivity.this, QuestionDisplayActivity.class);
                i.putExtra("playerName", name);
                startActivity(i);
                finish();
            }
            else
                Toast.makeText(HomeActivity.this, "Enter your name first!", Toast.LENGTH_SHORT).show();
        });
    }
}