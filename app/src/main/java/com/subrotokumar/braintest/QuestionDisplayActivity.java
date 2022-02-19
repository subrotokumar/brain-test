package com.subrotokumar.braintest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.subrotokumar.braintest.databinding.ActivityQuestionDisplayBinding;

import java.util.ArrayList;
import java.util.Random;

public class QuestionDisplayActivity extends AppCompatActivity {

    private ArrayList<QuestionModel> quizModelArrayList;
    private Random random;
    private int currentQuestionNumber=0, selectedOption, correctOption, score=0;
    private ActivityQuestionDisplayBinding binding;
    private String playerName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        QuizQuestion question=new QuizQuestion();
        question.setQuizQuestion();
        quizModelArrayList=question.getQuizQuestion();

        selectedOption=0;
        random=new Random();

        Intent i=getIntent();
        if(i.hasExtra("playerName"))    playerName=i.getStringExtra("playerName");

        binding=ActivityQuestionDisplayBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());


        setView();
        binding.btnClear.setOnClickListener(v -> clear());
        binding.btnNext.setOnClickListener(v -> onNext());
    }

    private void onNext(){
        if(currentQuestionNumber<=9){
            if(selectedOption!=0) {
                if (correctOption == selectedOption)
                    score++;
                setView();
            }
            else
                Toast.makeText(this, "You should must select an option to continue!", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent=new Intent(this,ResultDisplayActivity.class);
            intent.putExtra("playerName",playerName);
            intent.putExtra("score",score);
            startActivity(intent);
            finish();
        }
    }

    private void setView(){
        clear();
        selectedOption=0;
        int quesPos=random.nextInt(quizModelArrayList.size());
        currentQuestionNumber++;

        binding.tvQuestionNum.setText(String.valueOf(currentQuestionNumber));
        binding.tvQuestion.setText(quizModelArrayList.get(quesPos).getQuestion());
        binding.btnOption1.setText(quizModelArrayList.get(quesPos).getOption1());
        binding.btnOption2.setText(quizModelArrayList.get(quesPos).getOption2());
        binding.btnOption3.setText(quizModelArrayList.get(quesPos).getOption3());
        binding.btnOption4.setText(quizModelArrayList.get(quesPos).getOption4());
        correctOption=quizModelArrayList.get(quesPos).getAnswer();
        quizModelArrayList.remove(quesPos);
    }

    public void clear(){
        switch(selectedOption){
            case 1: binding.btnOption1.setBackgroundColor(Color.parseColor("#BBE1FA"));
                binding.btnOption1.setTextColor(Color.parseColor("#4f4f4f"));
                break;
            case 2: binding.btnOption2.setBackgroundColor(Color.parseColor("#BBE1FA"));
                binding.btnOption2.setTextColor(Color.parseColor("#4f4f4f"));
                break;
            case 3: binding.btnOption3.setBackgroundColor(Color.parseColor("#BBE1FA"));
                binding.btnOption3.setTextColor(Color.parseColor("#4f4f4f"));
                break;
            case 4: binding.btnOption4.setBackgroundColor(Color.parseColor("#BBE1FA"));
                binding.btnOption4.setTextColor(Color.parseColor("#4f4f4f"));
                break;
        }
        selectedOption=0;
    }

    public void setOption(View view) {
        clear();
        Button btn=(Button)view;
        switch(btn.getId()){
            case R.id.btnOption1:
                selectedOption=1;
                break;
            case R.id.btnOption2:
                selectedOption=2;
                break;
            case R.id.btnOption3:
                selectedOption=3;
                break;
            case R.id.btnOption4:
                selectedOption=4;
                break;
        }
        btn.setBackgroundColor(getResources().getColor(R.color.purple_200));
        btn.setTextColor(getResources().getColor(R.color.white));
    }
}