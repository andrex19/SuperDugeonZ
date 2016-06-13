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

    }
    public void cerrarSesion(){
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (vistaMenu.getBtnBE()==e.getSource()){
            System.out.println("Click boton Batalla en General");   
            contBatallaTodos.verVista(cp,this);
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
        }
        if (vistaMenu.getMenuItemRegistrar()==e.getSource()){
            cp.contRegistro.verVista(cp);
        }
        if (vistaMenu.getMenuItemCerrar1()==e.getSource()){
            System.out.println("cerrar sesion usuario 1");
        }
        if (vistaMenu.getMenuItemCerrar2()==e.getSource()){
            System.out.println("cerrar sesion usuario 2");
        }
        if (vistaMenu.getMenuItemCerrar3()==e.getSource()){
            System.out.println("cerrar sesion usuario 3");
        }
        if (vistaMenu.getMenuItemCerrar4()==e.getSource()){
            System.out.println("cerrar sesion usuario 4");
        }
        
        
                
        
    }
    
}
