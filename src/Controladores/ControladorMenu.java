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

/**
 *
 * @author Samsung
 */
public class ControladorMenu implements ActionListener{
    public ControladorPrincipal cp;
    public VistaMenu vistaMenu;    
    public ControladorBatallaTodos contBatallaTodos;
    
    public void verVista(ControladorPrincipal cp) {
        this.cp=cp;
        this.vistaMenu=new VistaMenu();
        this.vistaMenu.setVisible(true);
        this.vistaMenu.agregarListener(this);
        this.contBatallaTodos = new ControladorBatallaTodos();
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
       
        if (vistaMenu.getBtnBE()==e.getSource()){
            System.out.println("Click boton Batalla en General");   
            contBatallaTodos.verVista(cp);
            this.vistaMenu.dispose();
        }
        if (vistaMenu.getBtnBT()==e.getSource()){
            System.out.println("Click boton Torneo");            
        }
        if (vistaMenu.getBtnIC()==e.getSource()){
            System.out.println("Click boton Información de criaturas");            
        }
        if (vistaMenu.getBtnIP()==e.getSource()){
            System.out.println("Click boton Informacion de partidas");            
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
            cerrarSesion(0);
        }
        if (vistaMenu.getMenuItemCerrar2()==e.getSource()){
            System.out.println("cerrar sesion usuario 2");
            cerrarSesion(1);
        }
        if (vistaMenu.getMenuItemCerrar3()==e.getSource()){
            System.out.println("cerrar sesion usuario 3");
            cerrarSesion(2);
        }
        if (vistaMenu.getMenuItemCerrar4()==e.getSource()){
            System.out.println("cerrar sesion usuario 4");
            cerrarSesion(3);
        }
        if (vistaMenu.getMenuItemSalir()==e.getSource()){
            System.exit(0);
        }
        
        
                
        
    }
    
}
