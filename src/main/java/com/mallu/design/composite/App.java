package com.mallu.design.composite;

/**
 * Created by golagem on 10/12/17.
 */
public class App {

    public static void main(String[] args) {

        Drawing drawing=new Drawing();
        drawing.add(new Circle());
        drawing.add(new Triangle());
        drawing.add(new Circle());
        drawing.fillColor("Green");
    }
}
