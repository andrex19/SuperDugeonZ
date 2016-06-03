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

/**
 *
 * @author Samsung
 */
public class ControladorMenu implements ActionListener{
    public ControladorPrincipal cp;
    public VistaMenu vistaMenu;    
    
    public void verVista(ControladorPrincipal cp) {
        this.cp=cp;
        this.vistaMenu=new VistaMenu();
        this.vistaMenu.setVisible(true);
        this.vistaMenu.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vistaMenu.getBtnBI()==e.getSource()){
            
            System.out.println("Click boton Batalla individual");            
        }
        if (vistaMenu.getBtnBE()==e.getSource()){
            System.out.println("Click boton Batalla en equipos");            
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
                
        
    }
    
}
