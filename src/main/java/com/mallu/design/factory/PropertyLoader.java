package com.mallu.design.factory;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Properties;

/**
 * Created by golagem on 10/11/17.
 */
public class PropertyLoader {

    private static Properties properties=new Properties();

    public void loadProperties(){
        File file=new File("/Users/mallu/github/design-patterns/src/main/resources/test.properties");
        try{
            properties.load(new FileReader(file));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static String getProperty(String name){
        return properties.getProperty(name);
    }

}
