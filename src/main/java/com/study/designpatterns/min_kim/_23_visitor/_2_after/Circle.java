package com.study.designpatterns.min_kim._23_visitor._2_after;

public class Circle implements Shape {
    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
