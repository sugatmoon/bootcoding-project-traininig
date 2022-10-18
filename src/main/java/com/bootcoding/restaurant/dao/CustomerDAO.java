package com.bootcoding.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDAO {

    public static final String TABLE_NAME = "app_customer";

    public void createTable(){
        try{
            // 1. Load JDBC Driver
            Class.forName("org.postgresql.Driver");


            // 2. Establish Connection with your local database
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "postgres");
            // 3. Create Statement Object
            Statement stmt = con.createStatement();

            // 4. Execute Query (Statement)
            // TODO - Create table query
            // TODO - Change query - For demonstration we have used SELECT query

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " ( id bigint NOT NULL, "
                    + " name text ,"
                    + " address text, "
                    + " phone_number bigint, "
                    + " city text , "
                    + " state text, "
                    + " email_id text, "
                    + " CONSTRAINT app_customer_pk PRIMARY KEY (id))";

            System.out.println("Create Table Query : " + query);
            stmt.executeUpdate(query);


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
