/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.VistaRegistro;
import superdugeonz_2.ControladorPrincipal;
import Modelo.JefeTerreno;
import Modelo.Usuario;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorRegistro implements ActionListener {
    ControladorPrincipal cp;
    VistaRegistro vistaRegistro;
    JefeTerreno JefeTerreno;
    ControladorMenu contMenu=new ControladorMenu();
    Conexion conn;
    
    
    
       
    public void verVista(ControladorPrincipal cp) {
    
    this.cp=cp;
    this.vistaRegistro=new VistaRegistro();
    this.vistaRegistro.setVisible(true);
    this.vistaRegistro.agregarListener(this);
    

    }
    public void registrar() throws SQLException{
        String usuario=vistaRegistro.getUsr();
        String pwd1=vistaRegistro.getPwd1();
        String pwd2=vistaRegistro.getPwd2();
        //String jefeTerreno=vistaRegistro.getItemCboxJefeTerreno();
        //String puzzle=vistaRegistro.getItemCboxPuzzle();
        if (usuario.equals("")==false && pwd1.equals("")==false && pwd2.equals("")==false){
            conn = new Conexion();
            boolean seConecta = conn.conectar();
            
            if (pwd1.equals(pwd2)==true){
                vistaRegistro.setMsjUsuario("");
                vistaRegistro.setMsjPwd1("");
                vistaRegistro.setMsjPwd2("");
                vistaRegistro.setMsjJefeTerreno("");
                vistaRegistro.setMsjPuzzle("");
                boolean exito = conn.Registro(usuario, pwd1);
                
                if (Usuario.existe(usuario)==false){
                    //construir bien el usuario ! (con un metodo o nose)...
                    cp.arreglo_usuario.add(new Usuario(usuario,pwd1));
                    //agregar a la base de datos ...
                    if (cp.arreglo_usuario.size()==1){
                            contMenu.verVista(cp);
                            cp.vistaInicio.setVisible(false);

                        }
                    vistaRegistro.dispose();
                    System.out.println("usuario registrado");
                }
                else{
                    vistaRegistro.setMsjUsuario("Usuario ya existe");
                    vistaRegistro.setMsjPwd1("");
                    vistaRegistro.setMsjPwd2("");
                    vistaRegistro.setMsjJefeTerreno("");
                    vistaRegistro.setMsjPuzzle("");
                
                }
                
                
            }
            else{
                vistaRegistro.setMsjUsuario("");
                vistaRegistro.setMsjPwd1("");
                vistaRegistro.setMsjPwd2("Contraseña no coincide");
                vistaRegistro.setMsjJefeTerreno("");
                vistaRegistro.setMsjPuzzle("");
                
                
            }
        }
        else{
            if (usuario.equals("")==true){
                vistaRegistro.setMsjUsuario("Ingrese usuario");
            }
            else{
                vistaRegistro.setMsjUsuario("");
            }
            if (pwd1.equals("")==true){
                vistaRegistro.setMsjPwd1("Ingrese contraseña");
            }
            else{
                vistaRegistro.setMsjPwd1("");
            }
            if (pwd2.equals("")==true){
                vistaRegistro.setMsjPwd2("Ingrese contraseña");
            }
            else{
                vistaRegistro.setMsjPwd2("");
            }
            /*if (jefeTerreno.equals("<Seleccionar>")==true){
                vistaRegistro.setMsjJefeTerreno("Seleccione jefe de terreno");
            }
            else{
                vistaRegistro.setMsjJefeTerreno("");
            }*/
            /*if (puzzle.equals("<Seleccionar>")==true){
                vistaRegistro.setMsjPuzzle("Seleccione puzzle");
            }
            else{
                vistaRegistro.setMsjPuzzle("");
            }*/
            
        }

        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vistaRegistro.getBotonSiguiente()==e.getSource()){
            try {
                this.registrar();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
                        
            System.out.println("Click boton registro");
            
        }
        if (vistaRegistro.getBotonCancelar()==e.getSource()){
            System.out.println("Click boton Cancelar (registro)");
            this.vistaRegistro.dispose(); //cierra la vista login
            this.cp.vistaInicio.setVisible(true); //muestra la vista Inicio
        }
            
        if (vistaRegistro.getCboxJefeTerreno()==e.getSource()){ //camibiar las imagenes!!!
            vistaRegistro.setImagenJefeTerreno(vistaRegistro.getItemCboxJefeTerreno());
            
        }    
        if (vistaRegistro.getCboxPuzzle()==e.getSource()){
            if (vistaRegistro.getItemCboxPuzzle().equals("Puzzle 1")){
                System.out.println("Puzzle seleccionado: Puzzle 1");     
            }
            else if (vistaRegistro.getItemCboxPuzzle().equals("Puzzle 2")){
                System.out.println("Puzzle seleccionado: Puzzle 2");     
            }
            else if (vistaRegistro.getItemCboxPuzzle().equals("Puzzle 3")){
                System.out.println("Puzzle seleccionado: Puzzle 3");     
            }
        
        }
        
    }
   
    
}
