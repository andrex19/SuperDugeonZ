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
    String user = "root";
    String password = "root";
    String url = "jdbc:derby://localhost:1527/SuperDungeonZ";
    public static int id;
    
    ResultSet rs = null;
    Statement stm = null;
    
    
    
    
    public boolean conectar(){
        try{
            this.conn = DriverManager.getConnection(url, user, password);
            return true;
        }
        catch(SQLException e){
            System.out.println(e);
            System.out.println("Exception en conectar");
            return false;
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
    
    public boolean insertar(String consulta){
        try{
            stm = conn.createStatement();
            stm.executeUpdate(consulta);
            return true;
        }
        catch(SQLException e){
            System.out.println("Exception en insertar");
            System.err.println(e);
            return false;
        }
    }
    
    /*public Criatura selectCriatura(String nombre) {
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
    }*/
    
    public boolean registro(String user, String pass) throws SQLException{
        
        if(this.consultar("SELECT NOMBRE_JUGADOR, CONTRASENIA_JUGADOR FROM JUGADOR WHERE NOMBRE_USUARIO='"+user+"'")){
            System.out.println("Paso el SELECT");
            int counter = 0;
            while(rs.next()){
                counter++;
            }
            System.out.println("counter es "+counter);
            if(counter==0){
                id = 1;
                return this.insertar("INSERT INTO USUARIO (NOMBRE_USUARIO,CONTRASENIA_USUARIO) VALUES ('"+user+"','"+pass+"')");
                
            }
            else{
                return false;
            }
        }
        return false;//nunca llegara aca
    }
    
    public String getNombreUsuario() throws SQLException{
        //SELECT * FROM "usuarios" WHERE "user"='uno' AND "password"='uno'
        String usuario = null;
        String contraseña = null;
        if(this.consultar("SELECT * FROM JUGADOR")){
            System.out.println("Paso el SELECT");
            int counter = 1;
            
            while(rs.next()){
                try{
                    usuario = rs.getString("NOMBRE_JUGADOR");
                    System.out.println(usuario);
                    contraseña = rs.getString("CONTRASENIA_JUGADOR");
                    System.out.println(contraseña);
                }
                catch(SQLException e){
                    System.err.println("Error en login");
                    System.err.println(e);
                    return null;
                }
            }
            System.out.println("counter es "+counter);
            if(counter==1){                
                return usuario+" "+contraseña;
            }
        }
        return null;        
    }
    
    public void close(){
        try {
            if(conn!=null){
                conn.close();
            }
            if(rs!=null){
                rs.close();
            }
            if(stm!=null){
                stm.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}   
