package com.study.behavior.observe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NumberGenerator {
    private List<Observe> observes = new ArrayList<>();
    public void addObserve(Observe observe) {
        observes.add(observe);
    }

    public void removeObserve(Observe observe) {
        observes.remove(observe);
    }

    public void notifyObserves() {
        Iterator<Observe> iterator = observes.iterator();
        while (iterator.hasNext()) {
            iterator.next().update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
