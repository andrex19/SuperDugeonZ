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
            System.out.println("Exception en getNextCriatura");
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
    
    public Criatura selectCriatura(String nombre) {
        int id = 0;
        String name = null;
        int HP=0;
        int atk=0;
        int def=0;
        int lvl=0;
        
        
        try{
            rs = stm.executeQuery("SELECT * FROM CRIATURA WHERE NOMBRE_CRIATURA='"+nombre+"'");
            rs.next();
            id = rs.getInt("ID_CRIATURA");
            System.out.println(id);
            name= rs.getString(2);
            HP = rs.getInt(3);
            atk = rs.getInt(4);
            def = rs.getInt(5);
            lvl = rs.getInt(6);
            
        }catch (SQLException e){
            System.out.println("hola2");
            System.out.println(e);
        }
        Criatura c = new Criatura(name,atk,def,HP,lvl,id);
        return c;
    }
    public ArrayList<String> getNombreCriaturas(int id){
        ArrayList<String> nombreCriaturas = new ArrayList();
        String nombreCriatura ="";
        try{
            rs = stm.executeQuery("SELECT * FROM PUZZLEJUGADOR WHERE ID_JUGADOR="+id+"");
            rs.next();
            for(int i=0;i<15;i++){
                nombreCriatura = rs.getString("CRIATURA"+(i+1));
                nombreCriaturas.add(nombreCriatura);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return nombreCriaturas;
        
    }
    public ArrayList<Criatura> getCriaturasJugador(int id){
        ArrayList<Criatura> criaturasJugador = new ArrayList();
        ArrayList<String> nombreCriature = this.getNombreCriaturas(id);
        Criatura criaturaAux = new Criatura();
        for(int i = 0; i<15;i++){
            criaturaAux=this.selectCriatura(nombreCriature.get(i));
            System.out.println(criaturaAux.nombre);
            criaturasJugador.add(criaturaAux);
        }
        return criaturasJugador;
    }
    
    public PuzzleDados getPuzzleJugador(int id){
        PuzzleDados puzzleJugador = new PuzzleDados(this.getCriaturasJugador(id));
        return puzzleJugador;
        
    }
    public ArrayList<Jugador> getJugadoresRegistrados(){
        if(this.consultar("SELECT * FROM JUGADOR")){
            ArrayList<Jugador> array = new ArrayList();
            Jugador player;
            int id = 0;
            String nombre = null;
            String pass = null;
            PuzzleDados puzzle = new PuzzleDados();
            JefeTerreno boss = new JefeTerreno();
            int i = 0;
            try {
                while(this.rs.next()){
                    id = rs.getInt("ID_JUGADOR");
                    nombre = rs.getString("NOMBRE_JUGADOR");
                    pass = rs.getString("CONTRASENIA_JUGADOR");
                    puzzle = this.getPuzzleJugador(id);
                    boss = this.getJefeJugador(id);
                    player = new Jugador(nombre,pass,puzzle,boss);
                    array.add(player);
                    i++;
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            return array;
        }
        return null;
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
                    contraseña = rs.getString("CONTRASENIA_JUGADOR");
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
    public JefeTerreno getJefeJugador (int id){
        JefeTerreno bossJugador = new JefeTerreno();
        
        try{
            rs = stm.executeQuery("SELECT ID_JEFE FROM JEFEJUGADOR WHERE ID_JUGADOR="+id+"");
            rs.next();
            int idBoss = rs.getInt("ID_JEFE");
            bossJugador = new JefeTerreno(idBoss);
            
            
        } catch (SQLException ex) {
            System.out.println("hola");
            System.out.println(ex);
        }
        return bossJugador;
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
