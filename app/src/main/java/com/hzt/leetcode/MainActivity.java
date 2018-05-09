package com.hzt.leetcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hzt.leetcode.question.IQuestion;
import com.hzt.leetcode.question.easy.Que007;
import com.hzt.leetcode.question.medium.Que006;
import com.hzt.leetcode.question.medium.Que011;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {


    IQuestion question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this) ;
        question = new Que011();
        question.run();
    }

    @OnClick(R.id.btn_run)
    void runQue() {
        question.run();
    }
}
