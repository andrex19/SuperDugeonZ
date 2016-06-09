/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class Conexion {
    public Connection conn = null;
    String user = "DiegoRico";
    String password = "DiegoRico";
    String url = "jdbc:derby://localhost:1527/SuperDungeonZ";
    
    ResultSet rs = null;
    Statement stm = null;
    
    
    
    
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
    
    public boolean consultar(String query){
        try{
            stm = conn.createStatement();
            rs = stm.executeQuery(query);
            return true;
        }
        catch (SQLException e){
            System.out.println("Exception en consultar");
            System.err.println(e);
            return false;
        
        }
    }
    
    public Criatura selectCriatura(String nombre) {
        String id = null;
        String name = null;
        int HP=0;
        int atk=0;
        int def=0;
        int lvl=0;
        
        try{
            rs = stm.executeQuery("SELECT * FROM CRIATURA WHERE NOMBRE_CRIATURA="+nombre+"");
            rs.next();
            id = rs.getString(1);
            name= rs.getString(2);
            HP = rs.getInt(3);
            atk = rs.getInt(4);
            def = rs.getInt(5);
            lvl = rs.getInt(6);
        }catch (SQLException e){
            System.out.println(e);
        }
        Criatura c = new Criatura(id,name,HP,atk,def,lvl);
        return c;
    }
    
    
    
    
    
    
     
}   
