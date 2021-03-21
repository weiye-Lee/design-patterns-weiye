package com.study.behavior.observe;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberObserve();
        numberGenerator.addObserve(new DigitObserver());
        numberGenerator.addObserve(new GraphObserver());

        numberGenerator.execute();;
    }
}
