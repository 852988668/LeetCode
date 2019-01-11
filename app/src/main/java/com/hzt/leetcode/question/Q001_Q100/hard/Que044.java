package com.hzt.leetcode.question.Q001_Q100.hard;

import com.hzt.leetcode.question.IQuestion;

public class Que044 implements IQuestion {
    @Override
    public void run() {

    }

    public boolean isMatch(String s, String p) {
        char[] c1 = s.toCharArray();
        char[] c2 = p.toCharArray();
        int pos1 = 0, pos2 = 0;
        int point = 0;
        while (pos1 < c1.length && pos2 < c2.length) {
            if (c2[pos2] == '?') {
                pos1++;
                pos2++;
            }

            if ((c2[pos2] == '*')) {

            }

            if (c1[pos1] == c2[pos2]) {
                pos1++;
                pos2++;
            } else {
                return false;
            }
        }
        return true;
    }


}
