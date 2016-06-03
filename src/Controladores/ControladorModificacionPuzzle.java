/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Vistas.VistaModificacionPuzzle;
import java.awt.event.ActionListener;
import superdugeonz_2.ControladorPrincipal;
import Modelo.PuzzleDeDados;
import java.awt.event.ActionEvent;



public class ControladorModificacionPuzzle implements ActionListener{
    VistaModificacionPuzzle Vm;
    PuzzleDeDados Pd;
    ControladorPrincipal Cp;
    
    
    public void verVistaModificacion(ControladorPrincipal Cp){
        this.Cp=Cp;
        ControladorModificacionPuzzle ControladorModificacionPuzzle = new ControladorModificacionPuzzle();
        this.Vm = new VistaModificacionPuzzle();
        this.Vm.setVisible(true);
        this.Vm.agregarListener(Cp);
        
        
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        
        if(Vm.getAgregarlvl1BT()==e.getSource()){
            System.out.println("hola1");
            if(Vm.getListCriatura() <= 15){
                Vm.setListCriatura(Vm.getCBoxCriaturaLvl1()); //agregamos a la lista el componente de el ComboBox 1
            }
            
        }
        if(Vm.getAgregarlvl2BT()==e.getSource()){
            System.out.println("hola2");
        }
        if(Vm.getAgregarlvl3BT()==e.getSource()){
            System.out.println("hola3");
        }
        if(Vm.getAgregarlvl4BT()==e.getSource()){
            System.out.println("hola4");
        }
    }
    
}
