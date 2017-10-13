package com.mallu.design.composite;

/**
 * Created by golagem on 10/12/17.
 */
public class Triangle implements Shape{
    @Override
    public void fillColor(String color) {
        System.out.println("drawing triangle with "+color);
    }
}
