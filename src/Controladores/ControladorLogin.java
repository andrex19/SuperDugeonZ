/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Usuario;
import Modelo.Conexion;
import Vistas.VistaLogin;
import Vistas.VistaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import superdugeonz_2.ControladorPrincipal;
import Controladores.ControladorMenu;


/**
 *
 * @author Samsung
 */
public class ControladorLogin implements ActionListener {
    ControladorPrincipal cp;
    VistaLogin vistaLogin;
    Usuario user;
    VistaMenu vistaMenu;
    ControladorMenu contMenu=new ControladorMenu();
    Conexion conection;
     
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (vistaLogin.getBotonIngresar()==e.getSource()){
            System.out.println("Click boton Ingresar (login)");
            this.loguear();
            
            
        }
        if (vistaLogin.getBotonCancelar()==e.getSource()){
            System.out.println("Click boton Cancelar (login)");
            this.vistaLogin.dispose(); //cierra la vista login
            //this.cp.vistaInicio.setVisible(true); //muestra la vista Inicio
        }
    }

    public void verVista(ControladorPrincipal cp) {
        this.cp=cp;
        this.vistaLogin=new VistaLogin();
        this.vistaLogin.setVisible(true);
        this.vistaLogin.agregarListener(this);
    }
    
    
    private void loguear() {
        
        String usuario = this.vistaLogin.getUsr();
        String contraseña = this.vistaLogin.getPwd();
        if ((usuario.equals("")==false) && (contraseña.equals("")==false)){
            if(Usuario.existe(usuario)){
                System.out.println("Usuario si existe ");
                if(Usuario.verificar(usuario,contraseña)){
                    //construir bien el usuario ! (con un metodo o nose)...
                    cp.arreglo_usuario.add( new Usuario(usuario,contraseña));
                    System.out.println("Usuario logueado!");
                    if (cp.arreglo_usuario.size()==1){
                        contMenu.verVista(cp);
                        cp.vistaInicio.setVisible(false);
                        
                    }
                    this.vistaLogin.dispose();
                    //vistaLogin.bienvenida(usuario);


                }else{
                    //vistaLogin.passError(usuario);
                    System.out.println("Contraseña incorrecta para" + usuario);
                    vistaLogin.setMensajeUsuario("");
                    vistaLogin.setMensajeContraseña("Contraseña incorrecta");

                }
            }else{
                //vistaLogin.userError(usuario);
                System.out.println("Usuario " + usuario + " inexistente ");
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
    
}
