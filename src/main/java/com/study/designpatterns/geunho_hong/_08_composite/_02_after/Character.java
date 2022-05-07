package com.study.designpatterns.geunho_hong._08_composite._02_after;

public class Character implements Component {

    private Bag bag;

    @Override
    public int getPrice() {
        return bag.getPrice();
    }

}
