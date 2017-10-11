package com.mallu.design.factory;

/**
 * Created by golagem on 10/11/17.
 */

public class DB2Connection implements DBConnection {

    public DB2Connection(){
        System.out.println("DB2");
    }

    public void connect() {
        System.out.println("Connecting to DB2");
    }
}
