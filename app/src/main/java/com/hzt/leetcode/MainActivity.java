package com.hzt.leetcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hzt.leetcode.question.IQuestion;
import com.hzt.leetcode.question.medium.SolutionQue2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IQuestion question = new SolutionQue2();
        question.run();
    }

}
