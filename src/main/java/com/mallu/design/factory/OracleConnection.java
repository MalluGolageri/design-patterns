package com.mallu.design.factory;

/**
 * Created by golagem on 10/11/17.
 */
public class OracleConnection implements DBConnection {

    public OracleConnection(){
        System.out.println("Oracle");
    }

    public void connect() {
        System.out.println("Connecting to Oracle");
    }
}
