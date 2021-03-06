/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdugeonz_2;

import Controladores.ControladorLogin;
import Controladores.ControladorMenu;
import Controladores.ControladorRegistro;
import Modelo.Jugador;
import Vistas.VistaInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Controladores.ControladorModificacionPuzzle;
import Modelo.Criatura;
import Modelo.Dado;
import Modelo.JefeTerreno;
import Modelo.PuzzleDados;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Samsung
 */
public class ControladorPrincipal implements ActionListener{
    
    public ArrayList<Jugador> arreglo_usuario = new ArrayList<Jugador>();
    public ArrayList<Jugador> arreglo_usuarios_registrados = new ArrayList<Jugador>();
    public ControladorLogin contLogin;
    public VistaInicio vistaInicio;
    public ControladorRegistro contRegistro;
    public ControladorMenu contMenu;



    

    public static void main(String[] args) throws SQLException {
        ControladorPrincipal cp=new ControladorPrincipal();
        cp.contLogin = new ControladorLogin(); // instancio el controlador del login
        cp.contRegistro=new ControladorRegistro();
        cp.vistaInicio=new VistaInicio(); // instancio la vista de inicio
        cp.contMenu=new ControladorMenu();
        cp.vistaInicio.setVisible(true); //pongo visible la vista de inicio
        cp.vistaInicio.agregarListener(cp);
        PuzzleDados puzzleDados1 = new PuzzleDados();
        Jugador jugador0,jugador1;
        Conexion conn = new Conexion();
        String nombre;
        String contraseña;
        conn.conectar();
        //nombre = conn.getNombreUsuario();
        PuzzleDados puzzleDados2 = new PuzzleDados();
        
        cp.arreglo_usuarios_registrados= (ArrayList<Jugador>) conn.getJugadoresRegistrados().clone();
        //System.out.println(cp.arreglo_usuarios_registrados.get(0));
        //System.out.println(cp.arreglo_usuarios_registrados.get(1));
        for (int i=0;i<cp.arreglo_usuarios_registrados.size();i++){
            System.out.print(cp.arreglo_usuarios_registrados.get(i)+", " );
        }
        System.out.println("");
        //HACK PARA PROBAR LA BATALLAAAA (Borrar despues!!!!!)
        for (int i=0;i<cp.arreglo_usuarios_registrados.size();i++){
            Jugador jugador=cp.arreglo_usuarios_registrados.get(i);
            jugador.puntos[0]=1000;
            jugador.puntos[1]=1000;
            jugador.puntos[2]=1000;
            jugador.puntos[3]=1000;
            jugador.puntos[4]=1000;
            
        }
        
        //ese metodo es de la clase DAO.

        
        
        
        /* con estos usuarios se hacian pruebas para la batalla
        jugador0=new Jugador("andres","hola",puzzleDados1,new JefeTerreno(1));
        jugador1=new Jugador("cesar","asd",puzzleDados2,new JefeTerreno(2));
        jugador0.puntos[0]=1000;
        jugador0.puntos[1]=1000;
        jugador0.puntos[2]=1000;
        jugador0.puntos[3]=1000;
        jugador0.puntos[4]=1000;
        jugador1.puntos[0]=1000;
        jugador1.puntos[1]=1000;
        jugador1.puntos[2]=1000;
        jugador1.puntos[3]=1000;
        jugador1.puntos[4]=1000;
        //construir bien el usuario ! (con un metodo o nose)...
        cp.arreglo_usuarios_registrados.add(jugador0);
        cp.arreglo_usuarios_registrados.add(jugador1);
        cp.arreglo_usuario.add(jugador0);
        cp.arreglo_usuario.add(jugador1);
        */            

       
// hago que la vista sea escuchada por el controlador principal
        
    }
    public void cargarUsuario() throws SQLException{
        Conexion conn = new Conexion();
        String nombre;
        String contraseña;
        conn.conectar();
        nombre = conn.getNombreUsuario();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if (vistaInicio.getBtnEjecutar() == e.getSource()){
            //this.vistaInicio.setVisible(false); // hago que no sea visible la vista de inicio
            // para mostrar la otra vista
            //this.contLogin.verVista(this);//con este metodo del controlador 
            // pongo visible la vista del login 
            this.contMenu.verVista(this);
            this.vistaInicio.dispose();
        }    
    
        if (vistaInicio.getBntSalir() == e.getSource()){
            //this.vistaInicio.setVisible(false);
            //this.contRegistro.verVista(this);
            System.exit(0);
            
        } 
    }
    public ArrayList<Jugador> getArregloDEUsurios(){
        return this.arreglo_usuario;
    }
    
}
