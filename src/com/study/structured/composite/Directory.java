package com.study.structured.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entity{
    private String name;
    private List<Entity> dir = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entity e : dir) {
            size += e.getSize();
        }
        return size;
    }

    @Override
    public void printList(String str) {
        System.out.println(str + "/" + this);
        for (Entity e : dir) {
            e.printList(str + "/" + this);
        }
    }

    public Entity add(Entity entity) {
        dir.add(entity);
        return this;
    }

}
