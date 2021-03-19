package com.study.structured.decorator;

public class BaseBatterCake extends BatterCake{
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 10;
    }
}
