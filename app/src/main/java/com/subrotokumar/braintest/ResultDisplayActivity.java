package com.subrotokumar.braintest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.subrotokumar.braintest.databinding.ActivityResultDisplayBinding;
import com.subrotokumar.braintest.databinding.ActivityResultDisplayBinding;

public class ResultDisplayActivity extends AppCompatActivity {

    private ActivityResultDisplayBinding binding;
    private String playerName;
    private int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityResultDisplayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent i=getIntent();
        if(i.hasExtra("playerName")) playerName = i.getStringExtra("playerName");
        if(i.hasExtra("score")) score = i.getIntExtra("score",0);

        binding.tvPlayerName.setText(playerName);
        binding.tvScore.setText("Your Score : "+score);

        binding.btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ResultDisplayActivity.this,HomeActivity.class);
                startActivity(i);
                finish();
            }
        });
        binding.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"Hey, check out this awesome Quiz app \"Quiz Time!\". Download and Try now:\nhttps://github.com/subrotokumar/quiz-time");
                Intent chooser=Intent.createChooser(intent,"Share about this app using...");
                startActivity(chooser);
            }
        });
        binding.btnTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ResultDisplayActivity.this,QuestionDisplayActivity.class);
                i.putExtra("playName",playerName);
                startActivity(i);
                finish();
            }
        });
    }
}