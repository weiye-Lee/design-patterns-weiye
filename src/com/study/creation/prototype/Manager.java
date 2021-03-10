package com.study.creation.prototype;

import java.util.HashMap;

public class Manager {
    private HashMap showCase = new HashMap();

    public void register(String protoName,Product proto) {
        showCase.put(protoName,proto);
    }

    public Product clone(String name) {
        Product product = (Product) showCase.get(name);
        return product.createClone();

    }
}
