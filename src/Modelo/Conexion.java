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
    public ArrayList<Criatura> selectCriaturas() throws SQLException{
        if(this.consultar("SELECT * FROM CRIATURA")){
            ArrayList<Criatura> array = new ArrayList();
            int i = 0;
            while(this.rs.next()){
                array.add(this.getNextCriatura());
                System.out.println(array.get(i).nombre);
                i++;
            }
            return array;
        }
        return null;
    }
    
    //public ArrayList<Jugador> selectJugadores(){
        //if
    //}
    
    /*public void getNextJugador(){
        try{
            int id = rs.getInt("ID_JUGADOR");
            String nombre = rs.getString("NOMBRE_JUGADOR");
            String pwd = rs.getString("CONTRASENIA_JUGADOR");
            while(rs.next()){
                if (this.consultar("SELECT * FROM PUZZLEJUGADOR WHERE ID_JUGADOR ="+id+"")){
                    String Criatura1 = rs.getString("CRIATURA1");
                    System.out.println(Criatura1);
                    String Criatura2 = rs.getString("CRIATURA2");
                    String Criatura3 = rs.getString("CRIATURA3");
                    String Criatura4 = rs.getString("CRIATURA4");
                    String Criatura5 = rs.getString("CRIATURA5");
                    String Criatura6 = rs.getString("CRIATURA6");
                    String Criatura7 = rs.getString("CRIATURA7");
                    String Criatura8 = rs.getString("CRIATURA8");
                    String Criatura9 = rs.getString("CRIATURA9");
                    String Criatura10 = rs.getString("CRIATURA10");
                    String Criatura11 = rs.getString("CRIATURA11");
                    String Criatura12 = rs.getString("CRIATURA12");
                    String Criatura13 = rs.getString("CRIATURA13");
                    String Criatura14 = rs.getString("CRIATURA14");
                    String Criatura15 = rs.getString("CRIATURA15");
                }
            } 
            
            
            //Jugador j = new Jugador(nombre, atk, def, hp, nivel, id);
            //return c;
        }
        catch(SQLException e){
            System.out.println("Exception en getNextPokemon");
            System.err.println(e);
        }
        
    }*/
    public Criatura getNextCriatura(){
        try{
            int id = rs.getInt("ID_CRIATURA");
            String nombre = rs.getString("NOMBRE_CRIATURA");
            int atk = rs.getInt("ATK_CRIATURA");
            int def = rs.getInt("DEF_CRIATURA");
            int hp = rs.getInt("HP_CRIATURA");
            int nivel = rs.getInt("NIVEL_CRIATURA");
            
            Criatura c = new Criatura(nombre, atk, def, hp, nivel, id);
            return c;
        }
        catch(SQLException e){
            System.out.println("Exception en getNextPokemon");
            System.err.println(e);
            return null;
        }
    }
    
    public int selectIdJugador(String nombre){
        int id = 0;
        try{
            rs = stm.executeQuery("SELECT ID_JUGADOR FROM JUGADOR WHERE NOMBRE_JUGADOR='"+nombre+"'");
            rs.next();
            id = rs.getInt("ID_JUGADOR");
            System.out.println(id);
        }catch (SQLException e){
            System.out.println(e);
        }
        return id;
        
    }
    
    /*public Criatura selectCriatura(String nombre) {
        int id = 0;
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
    
    /*public boolean registro(String user, String pass) throws SQLException{
        
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
    }*/
    
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
