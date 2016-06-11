/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdugeonz_2;

import Controladores.ControladorLogin;
import Controladores.ControladorMenu;
import Controladores.ControladorRegistro;
import Modelo.Jugador;
import Vistas.VistaInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Controladores.ControladorModificacionPuzzle;
import Modelo.Criatura;

/**
 *
 * @author Samsung
 */
public class ControladorPrincipal implements ActionListener{
    
    public ArrayList<Jugador> arreglo_usuario = new ArrayList<Jugador>();
    public ControladorLogin contLogin;
    public VistaInicio vistaInicio;
    public ControladorRegistro contRegistro;
    public ControladorModificacionPuzzle contMP;
    public ControladorMenu contM;

    

    public static void main(String[] args) {
        ControladorPrincipal cp=new ControladorPrincipal();
        cp.contLogin = new ControladorLogin(); // instancio el controlador del login
        cp.contRegistro=new ControladorRegistro();
        cp.vistaInicio=new VistaInicio(); // instancio la vista de inicio
        cp.contMP=new ControladorModificacionPuzzle();
        cp.vistaInicio.setVisible(true); //pongo visible la vista de inicio
        cp.vistaInicio.agregarListener(cp);
        Criatura atacante = new Criatura("1","Diego",1500,800,100,1);
        Criatura defensora = new Criatura("2","Tu Ano",1400,400,500,1);
        
        atacante.Atacar(defensora);
       
// hago que la vista sea escuchada por el controlador principal
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (vistaInicio.getBotonIngresar() == e.getSource()){
            //this.vistaInicio.setVisible(false); // hago que no sea visible la vista de inicio
            // para mostrar la otra vista
            this.contLogin.verVista(this);//con este metodo del controlador 
            // pongo visible la vista del login 
        }    
    
        if (vistaInicio.getBotonRegistrar() == e.getSource()){
            //this.vistaInicio.setVisible(false);
            this.contRegistro.verVista(this);
        } 
    }
    public ArrayList<Jugador> getArregloDEUsurios(){
        return this.arreglo_usuario;
    }
    
}
