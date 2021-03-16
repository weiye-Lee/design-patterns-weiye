package com.study.behavior.strategy;

public class ArrayQueue implements QueueStrategy{
    private int[] queue;
    private int index;

    public ArrayQueue(int len) {
        queue = new int[len + 1];
        this.index = 0;
    }

    @Override
    public void in(int i) {
        if (index >= queue.length) {
            throw new ArrayStoreException();
        }
        queue[index] = i;
        index++;
    }

    @Override
    public int out() {
        int ans = queue[0];
        int len = queue.length - 1;
        System.arraycopy(queue, 1, queue, 0, len);
        return ans;
    }
}
