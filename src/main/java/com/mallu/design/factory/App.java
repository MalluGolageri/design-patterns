package com.mallu.design.factory;

import java.util.PriorityQueue;

/**
 * Created by golagem on 10/11/17.
 */
public class App {

    public static void main(String[] args) {
        loadProperties();
        DBConnection connection=ConnectionFactory.getDBInstance();
        if(connection!=null) connection.connect();

    }

    private static void loadProperties() {
        new PropertyLoader().loadProperties();
    }


}
