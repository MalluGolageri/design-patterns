package com.mallu.design.builder;

/**
 * Created by golagem on 10/9/17.
 */
public class TestBuilderPattern {

    public static void main(String[] args) {

        Computer comp = Computer.compute("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(comp.getHDD()+" "+comp.getRAM()+" "+comp.isBluetoothEnabled()+" "+comp.isGraphicsCardEnabled());

    }

}
