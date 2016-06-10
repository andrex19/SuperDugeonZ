/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Vistas.VistaSeleccionBatalla;
import Controladores.ControladorMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Vistas.VistaLogin;
import Controladores.ControladorLogin;
import superdugeonz_2.ControladorPrincipal;
import Modelo.Usuario;

/**
 *
 * @author Lizweert
 */
public class ControladorSeleccionBatalla implements ActionListener{
    ControladorMenu Cm;
    VistaSeleccionBatalla Vsb;
    ControladorLogin Cl;
    ControladorPrincipal cp;
    VistaLogin vl;
    
    
        public void verVista() {
        this.Vsb=new VistaSeleccionBatalla();
        this.Vsb.setVisible(true);
        this.Vsb.agregarListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Vsb.get2Jugadores()==e.getSource()){
            System.out.println("Click boton Jugar 2 Jugadores");
            //colocar metodo de eleccion de equipo   
            this.comprobacionDeJugadoresDisponibles(cp.getArregloDEUsurios(), 2);
        }
        if (Vsb.get3Jugadores()==e.getSource()){
            System.out.println("Click en jugar 3 Jugadores");
            //metodo de seleccion de equipo
            this.comprobacionDeJugadoresDisponibles(cp.getArregloDEUsurios(), 3);
        }
        if (Vsb.get4Jugadores()==e.getSource()){
            System.out.println("click en jugar 4 Jugadores");
            //metodo de seleccion de equipo
            this.comprobacionDeJugadoresDisponibles(cp.getArregloDEUsurios(), 4);
        }

    }
    public void comprobacionDeJugadoresDisponibles(ArrayList<Usuario> Jugadores,int numeroAJugar){
        switch(numeroAJugar){
            case 2:

                if (Jugadores.size()< 2){
                    this.setTodoNulo();
                    this.Vsb.getJugador3TF().setVisible(false);
                    this.Vsb.getPwdJugador3TF().setVisible(false);
                    this.Vsb.getIngresar3().setVisible(false);
                    this.Vsb.getJugador4TF().setVisible(false);
                    this.Vsb.getPwdJugador4TF().setVisible(false);
                    this.Vsb.getIngresar4().setVisible(false);
                    this.Vsb.setTextoJugador1(Jugadores.toString());
                    this.Vsb.getPwdJugador1TF().setVisible(false);
                    break;
                }

            case 3:
                    
                if (Jugadores.size() < 3){
                    this.setTodoNulo();
                    this.Vsb.getJugador4TF().setVisible(false);
                    this.Vsb.getPwdJugador4TF().setVisible(false);
                    this.Vsb.getIngresar4().setVisible(false);
                    this.Vsb.setTextoJugador1(Jugadores.toString());
                    this.Vsb.getPwdJugador1TF().setVisible(false);

                }

            case 4:
                if (Jugadores.size() < 4){
                    this.setTodoNulo();
                    this.Vsb.setTextoJugador1(Jugadores.toString());
                    this.Vsb.getPwdJugador1TF().setVisible(false);
                }
 
        }
    }
    public void setTodoNulo(){
                    this.Vsb.getJugador1TF().setVisible(false);
                    this.Vsb.getPwdJugador1TF().setVisible(false);
                    this.Vsb.getIngresar1().setVisible(false);
                    this.Vsb.getJugador2TF().setVisible(false);
                    this.Vsb.getPwdJugador2TF().setVisible(false);
                    this.Vsb.getIngresar2().setVisible(false);
                    this.Vsb.getJugador3TF().setVisible(false);
                    this.Vsb.getPwdJugador3TF().setVisible(false);
                    this.Vsb.getIngresar3().setVisible(false);
                    this.Vsb.getJugador4TF().setVisible(false);
                    this.Vsb.getPwdJugador4TF().setVisible(false);
                    this.Vsb.getIngresar4().setVisible(false);

    }
    
    
    
    
/*    public void ponerLoginRegistroEnVista(String Mensaje){
        this.Vsb.setMensajeInfo("");
        this.Vsb.getIngresar().setVisible(false);
        this.Vsb.getRegistrar().setVisible(false);
        //Dejamos las variables vacias para luego darles el valor segun corresponda
        this.Vsb.setMensajeInfo(Mensaje);
        this.Vsb.getIngresar().setVisible(true);
        this.Vsb.getRegistrar().setVisible(true);
         
    }*/
}

