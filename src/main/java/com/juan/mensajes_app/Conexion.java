package com.juan.mensajes_app;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection(){
        Connection conection=null;
        try{
            conection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","password");
            if(conection!=null){
                System.out.println("Conexion Exitosa");
            }

        }catch (SQLException e){
            System.out.println(e);

        }
        return conection;


    }
}
