package com.mallu.design.composite;

/**
 * Created by golagem on 10/12/17.
 */
public class Circle implements Shape{
    @Override
    public void fillColor(String color) {
        System.out.println("drawing circle with "+color);
    }
}
