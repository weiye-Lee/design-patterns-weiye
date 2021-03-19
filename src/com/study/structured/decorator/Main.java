package com.study.structured.decorator;

public class Main {
    public static void main(String[] args) {
        BatterCakeDecorator superBetterCake = new CheeseDecorator(
                new EggDecorator(
                        new BaseBatterCake()
                )
        );
        System.out.println("煎饼：" + superBetterCake.getMsg());
        System.out.println("价格：" + superBetterCake.getPrice());


        BatterCakeDecorator superBetterCake2 = new CheeseDecorator(
                new CheeseDecorator(
                        new CheeseDecorator(
                                new EggDecorator(
                                        new BaseBatterCake()
                                )
                        )
                )
        );
        System.out.println("煎饼：" + superBetterCake2.getMsg());
        System.out.println("价格：" + superBetterCake2.getPrice());

    }
}
