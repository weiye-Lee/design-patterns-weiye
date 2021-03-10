package com.study.creation.prototype;

public class UnderLinePen implements Product{
    private char decochar;

    public UnderLinePen(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        s = decochar + s;
        System.out.println(s);
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
