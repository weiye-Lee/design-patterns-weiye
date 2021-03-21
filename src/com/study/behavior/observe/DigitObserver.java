package com.study.behavior.observe;

public class DigitObserver implements Observe{

    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("DigitObserver:" + numberGenerator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
