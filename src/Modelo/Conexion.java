/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Diego
 */
public class Conexion {
    private String user;
    private String password;
    private String db;
    private String host;
    private String url;
    private Connection conn = null;
    private Statement stm;
    private ResultSet rs;
    
    public Conexion(){
    this.url = "jdbc:derby://"+this.host+"/"+this.db;
    }
    
    public Conexion(String server, String usuario, String contraseña, String bd){
    this.user = usuario;
    this.password = contraseña;
    this.db = bd;
    this.host = server;
    this.url = "jdbc:derby://"+this.host+"/"+this.db;
    }
    
    public void connectar() throws SQLException{
     try{
         conn = DriverManager.getConnection(url,user,password);
         if (conn != null){
            System.out.println("Conexión a base de datos "+url+" … Ok");
            stm = (Statement) conn.createStatement();
         }
     }catch(SQLException ex){
         System.out.println("No se pudo conectar a la base de datos");
     }
    
    }
     
}   
