package com.study.structured.decorator;

public class CheeseDecorator extends BatterCakeDecorator {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1份芝士";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 5;
    }

    public CheeseDecorator(BatterCake batterCake) {
        super(batterCake);
    }
}
