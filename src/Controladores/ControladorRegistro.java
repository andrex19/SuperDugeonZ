/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.VistaRegistro;
import superdugeonz_2.ControladorPrincipal;
import Modelo.JefeTerreno;
import Modelo.Jugador;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Conexion;
import Modelo.PuzzleDados;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorRegistro implements ActionListener {
    ControladorPrincipal cp;
    VistaRegistro vistaRegistro;
    JefeTerreno JefeTerreno;
    ControladorMenu contMenu=new ControladorMenu();
    
    //Conexion conn;
    
    
    
       
    public void verVista(ControladorPrincipal cp) {
    
    this.cp=cp;
    this.vistaRegistro=new VistaRegistro();
    this.vistaRegistro.setVisible(true);
    this.vistaRegistro.agregarListener(this);

    }
    public void jefeTerreno(){
        if(vistaRegistro.getItemCboxJefeTerreno().equals("Goku")){
                this.JefeTerreno = new JefeTerreno(1);
            }
            else if(vistaRegistro.getItemCboxJefeTerreno().equals("Vegeta")){
                this.JefeTerreno = new JefeTerreno(2);
            }
            else if(vistaRegistro.getItemCboxJefeTerreno().equals("Zolezzi")){
                this.JefeTerreno = new JefeTerreno(3);
            }
            else if(vistaRegistro.getItemCboxJefeTerreno().equals("Mr.Satan")){
                this.JefeTerreno = new JefeTerreno(4);
            }
        
    }
    public void registrar(){
        String usuario=vistaRegistro.getUsr();
        String pwd1=vistaRegistro.getPwd1();
        String pwd2=vistaRegistro.getPwd2();
        String jefeTerreno=vistaRegistro.getItemCboxJefeTerreno();
        String puzzle=vistaRegistro.getItemCboxPuzzle();
        //boolean seConecta;
        if (usuario.equals("")==false && pwd1.equals("")==false && pwd2.equals("")==false 
            && jefeTerreno.equals("<Seleccionar>")==false && puzzle.equals("<Seleccionar>")==false){
            //conn = new Conexion();
            //conn.conectar();
            //System.out.println("Base de datos conectada!!");
            
            if (pwd1.equals(pwd2)==true){
                //seConecta=conn.Registro(usuario, pwd1);
                //if(seConecta==true){
                    //System.out.println("Registra al usuario");
                //ESTA ES LA COMPROBACION IMPORTANTE!!!!!!!!!
                //DENTRO DE ESTE IF IRÍA LA COMPROBACIÓN DE TODO
                
                vistaRegistro.setMsjUsuario("");
                vistaRegistro.setMsjPwd1("");
                vistaRegistro.setMsjPwd2("");
                vistaRegistro.setMsjJefeTerreno("");
                vistaRegistro.setMsjPuzzle("");
                
                
                if (Jugador.existe(cp.arreglo_usuarios_registrados, usuario)==false){
                    jefeTerreno();
                    Jugador jugador;
                    jugador=new Jugador(usuario,pwd1,new PuzzleDados(),this.JefeTerreno);
                    cp.arreglo_usuarios_registrados.add(jugador);
                    //agregar a la base de datos ...

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
            if (jefeTerreno.equals("<Seleccionar>")==true){
                vistaRegistro.setMsjJefeTerreno("Seleccione jefe de terreno");
            }
            else{
                vistaRegistro.setMsjJefeTerreno("");
            }
            if (puzzle.equals("<Seleccionar>")==true){
                vistaRegistro.setMsjPuzzle("Seleccione puzzle");
            }
            else{
                vistaRegistro.setMsjPuzzle("");
            }
            
        }

        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vistaRegistro.getBotonSiguiente()==e.getSource()){
                this.registrar();          
            System.out.println("Click boton registro");
            
        }
        if (vistaRegistro.getBotonCancelar()==e.getSource()){
            System.out.println("Click boton Cancelar (registro)");
            this.vistaRegistro.dispose(); //cierra la vista login
            //this.cp.vistaInicio.setVisible(true); //muestra la vista Inicio
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
