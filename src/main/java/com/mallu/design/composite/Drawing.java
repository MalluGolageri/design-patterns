package com.mallu.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by golagem on 10/12/17.
 */
public class Drawing implements Shape{
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void fillColor(String fillColor) {
        for(Shape sh : shapes)
        {
            sh.fillColor(fillColor);
        }
    }

    //adding shape to drawing
    public void add(Shape s){
        this.shapes.add(s);
    }

    //removing shape from drawing
    public void remove(Shape s){
        shapes.remove(s);
    }

    //removing all the shapes
    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}
