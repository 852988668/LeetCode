package com.hzt.leetcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hzt.leetcode.question.IQuestion;
import com.hzt.leetcode.question.hard.Que045;
import com.hzt.leetcode.question.hard.Que466;
import com.hzt.leetcode.question.medium.Que012;
import com.hzt.leetcode.question.medium.Que048;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {


    IQuestion question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        question = new Que048();
        question.run();
    }

    @OnClick(R.id.btn_run)
    void runQue() {
        question.run();
    }
}
