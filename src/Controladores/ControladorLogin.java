/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Jugador;
import Modelo.Conexion;
import Vistas.VistaLogin;
import Vistas.VistaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import superdugeonz_2.ControladorPrincipal;
import Controladores.ControladorMenu;
import Modelo.Criatura;
import Modelo.Dado;
import Modelo.JefeTerreno;
import Modelo.PuzzleDados;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Samsung
 */
public class ControladorLogin implements ActionListener {
    ControladorPrincipal cp;
    VistaLogin vistaLogin;
    Jugador user;
    VistaMenu vistaMenu;
    ControladorMenu contMenu=new ControladorMenu();
    Date date = new Date();
     
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        File TextFile = new File("Registro Acciones.txt"); 
        FileWriter TextOut = new FileWriter(TextFile, true);
        if (vistaLogin.getBotonIngresar()==e.getSource()){
            System.out.println("Click boton Ingresar (login)");
            TextOut.write("Click boton Ingresar (login)" +", "+ date+ "\r\n");
            TextOut.close();
            this.loguear();
            
            
            
        }
        if (vistaLogin.getBotonCancelar()==e.getSource()){
            System.out.println("Click boton Cancelar (login)");
            TextOut.write("Click boton Cancelar (login)" +", "+ date+ "\r\n");
            TextOut.close();
            this.vistaLogin.dispose(); //cierra la vista login
            //this.cp.vistaInicio.setVisible(true); //muestra la vista Inicio
        }
    }
        catch(IOException io){
            System.out.println("Error al Escribir"+ io);
        }
}

    public void verVista(ControladorPrincipal cp) {
        this.cp=cp;
        this.vistaLogin=new VistaLogin();
        this.vistaLogin.setVisible(true);
        this.vistaLogin.agregarListener(this);
    }

    
    
    private void loguear() {
        try{
        File TextFile = new File("Registro Acciones.txt"); 
        FileWriter TextOut = new FileWriter(TextFile, true);
        String usuario = this.vistaLogin.getUsr();
        String contraseña = this.vistaLogin.getPwd();
        
        
        if ((usuario.equals("")==false) && (contraseña.equals("")==false)){
            //con.conectar();
            //String users = con.login(usuario,contraseña);

            if(Jugador.existe(cp.arreglo_usuarios_registrados,usuario)){
                System.out.println("Usuario existe ");
                //user = new Jugador(usuario,contraseña);
                
                if(Jugador.verificar(usuario,contraseña,cp.arreglo_usuarios_registrados)){
                    Jugador jugador = null;
                    for (int i=0;i<cp.arreglo_usuarios_registrados.size();i++){
                        if(cp.arreglo_usuarios_registrados.get(i).usuario.equals(usuario)){
                            jugador=cp.arreglo_usuarios_registrados.get(i);
                        }
                    }
                    if (cp.arreglo_usuario.contains(jugador)==false){
                        cp.arreglo_usuario.add(jugador);
                    }
                    else{
                        System.out.println("el usuario ya esta logeado");
                    }
                    System.out.println("Usuarios logueados: ");
                    for (int i = 0;i<cp.arreglo_usuario.size();i++){
                        System.out.print( cp.arreglo_usuario.get(i).usuario+", ");
                    }
                    System.out.println("");
                    this.vistaLogin.dispose();
                    this.cp.contMenu.verVista(cp);
                    //vistaLogin.bienvenida(usuario);


                }else{
                    //vistaLogin.passError(usuario);
                    System.out.println("Contraseña incorrecta para" + usuario);
                    TextOut.write("Contraseña incorrecta para" + usuario +", "+ date+ "\r\n");
                    TextOut.close();
                    vistaLogin.setMensajeUsuario("");
                    vistaLogin.setMensajeContraseña("Contraseña incorrecta");

                }
            }else{
                //vistaLogin.userError(usuario);
                System.out.println("Usuario " + usuario + " inexistente ");
                TextOut.write("Usuario " + usuario + " inexistente " +", "+ date+ "\r\n");
                TextOut.close();
                vistaLogin.setMensajeUsuario("Usuario inexistente");
                vistaLogin.setMensajeContraseña("");

            }
            
        }
        else{

            if (usuario.equals("")==true){                
                vistaLogin.setMensajeUsuario("Ingrese usuario");
            }
            else{
                vistaLogin.setMensajeUsuario("");
            }
            if (contraseña.equals("")==true){
                vistaLogin.setMensajeContraseña("Ingrese contraseña");
            }
            else{
                vistaLogin.setMensajeContraseña("");
            }
            
        }
            
    }
        catch(IOException io){
            System.out.println("Error al Escribir"+ io);
        }
    }
}
