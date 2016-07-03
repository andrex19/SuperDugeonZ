/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.VistaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import superdugeonz_2.ControladorPrincipal;
import Controladores.ControladorBatallaTodos;
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
public class ControladorMenu implements ActionListener{
    public ControladorPrincipal cp;
    public VistaMenu vistaMenu;    
    public ControladorBatallaTodos contBatallaTodos;
    public ControladorInfoCriaturas contInfoCriaturas;
    Date date = new Date();
    
    public void verVista(ControladorPrincipal cp) {
        this.cp=cp;
        this.vistaMenu=new VistaMenu();
        this.vistaMenu.setVisible(true);
        this.vistaMenu.agregarListener(this);
        this.contBatallaTodos = new ControladorBatallaTodos();
        this.contInfoCriaturas = new ControladorInfoCriaturas();
        actualizarVista();

    }
    public void actualizarVista(){
        if(cp.arreglo_usuario.size()==0){
            vistaMenu.getMenuItemCerrar1().setEnabled(false);
            vistaMenu.getMenuItemCerrar2().setEnabled(false);
            vistaMenu.getMenuItemCerrar3().setEnabled(false);
            vistaMenu.getMenuItemCerrar4().setEnabled(false);

        }
        else if(cp.arreglo_usuario.size()==1){
            vistaMenu.getMenuItemCerrar1().setEnabled(true);
            vistaMenu.getMenuItemCerrar2().setEnabled(false);
            vistaMenu.getMenuItemCerrar3().setEnabled(false);
            vistaMenu.getMenuItemCerrar4().setEnabled(false);
            vistaMenu.getMenuItemCerrar1().setText(cp.arreglo_usuario.get(0).usuario);
        }
        else if(cp.arreglo_usuario.size()==2){
            vistaMenu.getMenuItemCerrar1().setEnabled(true);
            vistaMenu.getMenuItemCerrar2().setEnabled(true);
            vistaMenu.getMenuItemCerrar3().setEnabled(false);
            vistaMenu.getMenuItemCerrar4().setEnabled(false);
            vistaMenu.getMenuItemCerrar1().setText(cp.arreglo_usuario.get(0).usuario);
            vistaMenu.getMenuItemCerrar2().setText(cp.arreglo_usuario.get(1).usuario);
        }
        else if(cp.arreglo_usuario.size()==3){
            vistaMenu.getMenuItemCerrar1().setEnabled(true);
            vistaMenu.getMenuItemCerrar2().setEnabled(true);
            vistaMenu.getMenuItemCerrar3().setEnabled(true);
            vistaMenu.getMenuItemCerrar4().setEnabled(false);
            vistaMenu.getMenuItemCerrar1().setText(cp.arreglo_usuario.get(0).usuario);
            vistaMenu.getMenuItemCerrar2().setText(cp.arreglo_usuario.get(1).usuario);
            vistaMenu.getMenuItemCerrar3().setText(cp.arreglo_usuario.get(2).usuario);
        }
        else if(cp.arreglo_usuario.size()==4){
            vistaMenu.getMenuItemCerrar1().setEnabled(true);
            vistaMenu.getMenuItemCerrar2().setEnabled(true);
            vistaMenu.getMenuItemCerrar3().setEnabled(true);
            vistaMenu.getMenuItemCerrar4().setEnabled(true);
            vistaMenu.getMenuItemCerrar1().setText(cp.arreglo_usuario.get(0).usuario);
            vistaMenu.getMenuItemCerrar2().setText(cp.arreglo_usuario.get(1).usuario);
            vistaMenu.getMenuItemCerrar3().setText(cp.arreglo_usuario.get(2).usuario);
            vistaMenu.getMenuItemCerrar4().setText(cp.arreglo_usuario.get(3).usuario);
        }
        
        
    }
    public void cerrarSesion(int numero){
        cp.arreglo_usuario.remove(numero);
        actualizarVista();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
	try{
        File TextFile = new File("Registro Acciones.txt"); 
        FileWriter TextOut = new FileWriter(TextFile, true);
       
        if (vistaMenu.getBtnBE()==e.getSource()){
            System.out.println("Click boton Batalla en General");  
            TextOut.write("Click boton Batalla en General" +", "+ date+ "\r\n");
            TextOut.close();
            contBatallaTodos.verVista(cp);
            this.vistaMenu.dispose();
        }
        if (vistaMenu.getBtnBT()==e.getSource()){
            System.out.println("Click boton Torneo");
            TextOut.write("Click boton Torneo" +", "+ date+ "\r\n");
            TextOut.close();
        }
        if (vistaMenu.getBtnIC()==e.getSource()){
            try {
                contInfoCriaturas.verVista(this.cp);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Click boton Información de criaturas");  
            TextOut.write("Click boton Información de criaturas" +", "+ date+ "\r\n");
            TextOut.close();
        }
        if (vistaMenu.getBtnIP()==e.getSource()){
            System.out.println("Click boton Informacion de partidas");
            TextOut.write("Click boton Información de partidas" +", "+ date+ "\r\n");
            TextOut.close();            
        }
        if (vistaMenu.getMenuItemIniciar()==e.getSource()){
            cp.contLogin.verVista(cp);
            //this.vistaMenu.dispose();
        }
        if (vistaMenu.getMenuItemRegistrar()==e.getSource()){
            cp.contRegistro.verVista(cp);
            //this.vistaMenu.dispose();
        }
        if (vistaMenu.getMenuItemCerrar1()==e.getSource()){
            System.out.println("cerrar sesion usuario 1");
            TextOut.write("cerrar sesion usuario 1" +", "+ date+ "\r\n");
            TextOut.close();  
            cerrarSesion(0);
        }
        if (vistaMenu.getMenuItemCerrar2()==e.getSource()){
            System.out.println("cerrar sesion usuario 2");
            TextOut.write("cerrar sesion usuario 2" +", "+ date+ "\r\n");
            TextOut.close();  
            cerrarSesion(1);
        }
        if (vistaMenu.getMenuItemCerrar3()==e.getSource()){
            System.out.println("cerrar sesion usuario 3");
            TextOut.write("cerrar sesion usuario 3" +", "+ date+ "\r\n");
            TextOut.close();  
            cerrarSesion(2);
        }
        if (vistaMenu.getMenuItemCerrar4()==e.getSource()){
            System.out.println("cerrar sesion usuario 4");
            TextOut.write("cerrar sesion usuario 4" +", "+ date+ "\r\n");
            TextOut.close();  
            cerrarSesion(3);
        }
        if (vistaMenu.getMenuItemSalir()==e.getSource()){
            System.exit(0);
        }
        
        
                
        
    }
    catch(IOException io){
            System.out.println("Error al Escribir"+ io);
        }
    }
}

