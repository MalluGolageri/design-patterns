package com.mallu.design.factory;

/**
 * Created by golagem on 10/11/17.
 */
public class MySqlConnection implements DBConnection {

    public MySqlConnection(){
        System.out.println("Mysql");
    }

    public void connect() {
        System.out.println("Connecting to Mysql");
    }
}
