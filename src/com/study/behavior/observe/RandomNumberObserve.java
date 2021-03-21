package com.study.behavior.observe;

import java.util.Random;

public class RandomNumberObserve extends NumberGenerator{
    private int number;
    private Random random = new Random();
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 10; i++) {
            number = random.nextInt(50);
            notifyObserves();
        }
    }
}
