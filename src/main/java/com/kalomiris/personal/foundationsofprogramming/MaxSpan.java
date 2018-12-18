package com.kalomiris.personal.foundationsofprogramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxSpan {

    public int getMaxSpan(List<Integer> list) {

        List<Integer> results = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j >= i; j--) {
                if (list.get(i) == list.get(j)) {
                    results.add(j - i +1);
                }
            }
        }
        results.sort(Comparator.reverseOrder());
        return  results.get(0);
    }
}
