/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Casilla;
import Vistas.VistaBatalla;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import superdugeonz_2.ControladorPrincipal;

/**
 *
 * @author Samsung
 */
public class ControladorBatalla implements ActionListener  {
    ControladorPrincipal cp;
    VistaBatalla vistaBatalla;
    JPanel panelTablero;
    Casilla[][] arregloTablero= new Casilla[15][15];
            

        
    public void verVista(ControladorPrincipal cp) {
        this.cp=cp;
        this.vistaBatalla=new VistaBatalla();
        this.vistaBatalla.setVisible(true);
        this.vistaBatalla.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    
    
    
    
}
