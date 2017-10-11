package com.mallu.design.factory;

import java.util.ArrayList;
import java.util.List;
import static com.mallu.design.factory.DBConstants.*;

/**
 * Created by golagem on 10/11/17.
 */
public class ConnectionFactory {
    private ConnectionFactory(){}
    public static DBConnection getDBInstance(){
        String db=PropertyLoader.getProperty("db");
        switch (db){
            case MYSQL:
                return new MySqlConnection();
            case ORACLE:
                return new OracleConnection();
            case DB2:
                return new DB2Connection();
            default:return new MySqlConnection();
        }
    }
}
