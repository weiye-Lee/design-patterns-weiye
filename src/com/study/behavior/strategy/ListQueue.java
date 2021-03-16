package com.study.behavior.strategy;

import java.util.ArrayList;
import java.util.List;

public class ListQueue implements QueueStrategy{
    private List<Integer> list;
    private int index;
    public ListQueue() {
        list = new ArrayList<>();
        index = 0;
    }
    @Override
    public void in(int i) {
        list.add(i);
    }

    @Override
    public int out() {
        int ans = list.get(0);
        list.remove(0);
        return ans;
    }
}
