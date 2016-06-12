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
import Modelo.Jugador;

/**
 *
 * @author Lizweert
 */
public class ControladorBatallaTodos implements ActionListener{
    ControladorMenu Cm;
    VistaSeleccionBatalla Vsb;
    ControladorPrincipal cp;
    ArrayList<Jugador> jugadoresRegistrados;
    ArrayList<Jugador> jugadoresReady=new ArrayList<Jugador>();
    
    public void verVista(ControladorPrincipal cp) {
        this.cp = cp;
        this.jugadoresRegistrados=(ArrayList<Jugador>) cp.arreglo_usuarios_registrados.clone();
        this.Vsb=new VistaSeleccionBatalla();
        this.Vsb.setVisible(true);
        this.Vsb.agregarListener(this);
        System.out.println(jugadoresRegistrados.get(0).usuario);
    }
    
    private void loguearBatalla(String usuario, String contraseña) {
        
        System.out.println("entre al metodo loguear batalla");
        if ((usuario.equals("")==false) && (contraseña.equals("")==false)){
            System.out.println("entre al primer if");
            System.out.println(usuario);
            System.out.println(cp.arreglo_usuarios_registrados.get(0).usuario);
            if(Jugador.existe(cp.arreglo_usuarios_registrados,usuario)){
                System.out.println("Usuario existe ");
                

                if(Jugador.verificar(usuario,contraseña,cp.arreglo_usuarios_registrados)){
                    System.out.println("estoy dentro del segundo if");
                    Jugador jugador = null;
                    for (int i=0;i<cp.arreglo_usuarios_registrados.size();i++){
                        System.out.println(cp.arreglo_usuarios_registrados.get(i).usuario);
                        if(cp.arreglo_usuarios_registrados.get(i).usuario.equals(usuario)){
                            jugador=cp.arreglo_usuarios_registrados.get(i);
                            System.out.println("hola soy : " + jugador.usuario);
                        }
                    }
                    if (jugador==null){
                        System.out.println("jugador es nuloooooo");
                    }                
    
        
                    this.jugadoresReady.add(jugador);
                    System.out.println("Usuario logueado!");
                    for (int i=0;i<jugadoresRegistrados.size();i++){
                        if(jugadoresRegistrados.get(i).usuario.equals(jugador.usuario)){
                            System.out.println("se removio: " +jugadoresRegistrados.get(i).usuario );
                            jugadoresRegistrados.remove(i);
                        }
                    }
                        
                    }
                    //vistaLogin.bienvenida(usuario);


                }
            
        }
            
    }
    


    @Override
    public void actionPerformed(ActionEvent e) {
        if (Vsb.getRadioJugador1()==e.getSource()){
            System.out.println("Presiono Radio Jugador");
            Vsb.getCboxRegistrados1().removeAllItems();
            Vsb.getCboxRegistrados1().addItem("<Seleccionar>");
            Vsb.getRadioPNJ1().setSelected(false);
            for(int i=0;i<jugadoresRegistrados.size();i++){
                Vsb.getCboxRegistrados1().addItem(jugadoresRegistrados.get(i).usuario);
                
            }
        }
        if (Vsb.getRadioJugador2()==e.getSource()){
            System.out.println("Presiono Radio Jugador 2");
            Vsb.getCboxRegistrados2().removeAllItems();
            Vsb.getCboxRegistrados2().addItem("<Seleccionar>");
            Vsb.getRadioPNJ2().setSelected(false);
            for(int i=0;i<jugadoresRegistrados.size();i++){
                Vsb.getCboxRegistrados2().addItem(jugadoresRegistrados.get(i).usuario);
                
            }
        }
        if (Vsb.getRadioJugador3()==e.getSource()){
            System.out.println("Presiono Radio Jugador 3");
            Vsb.getCboxRegistrados3().removeAllItems();
            Vsb.getCboxRegistrados3().addItem("<Seleccionar>");
            Vsb.getRadioPNJ3().setSelected(false);
            for(int i=0;i<jugadoresRegistrados.size();i++){
                Vsb.getCboxRegistrados3().addItem(jugadoresRegistrados.get(i).usuario);
                
            }
        }
        
        if (Vsb.getRadioJugador4()==e.getSource()){
            System.out.println("Presiono Radio Jugador 4");
            Vsb.getCboxRegistrados4().removeAllItems();
            Vsb.getCboxRegistrados4().addItem("<Seleccionar>");
            Vsb.getRadioPNJ4().setSelected(false);
            for(int i=0;i<jugadoresRegistrados.size();i++){
                Vsb.getCboxRegistrados4().addItem(jugadoresRegistrados.get(i).usuario);
                
            }
        }
        if(Vsb.getRadioPNJ1()==e.getSource()){
            System.out.println("Presiono Radio PNJ 1");
            Vsb.getRadioJugador1().setSelected(false);
        
        }
        if(Vsb.getRadioPNJ2()==e.getSource()){
            System.out.println("Presiono Radio PNJ 2");
            Vsb.getRadioJugador2().setSelected(false);
        }
        if(Vsb.getRadioPNJ3()==e.getSource()){
            System.out.println("Presiono Radio PNJ 3");
            Vsb.getRadioJugador3().setSelected(false);
        }
        if(Vsb.getRadioPNJ4()==e.getSource()){
            System.out.println("Presiono Radio PNJ 4");
            Vsb.getRadioJugador4().setSelected(false);
        }
        if(Vsb.getBtnIngresar1()==e.getSource()){
            System.out.println("Presiona Ingresar 1");
            String usuario = Vsb.getItemCboxRegistrados1();
            String pwd = Vsb.getPwdJugador1ST();
            if(usuario.equals("<Seleccionar>")==false && pwd.equals("")==false){
                this.loguearBatalla(usuario, pwd);
                System.out.println("Se loguea!");
                Vsb.getCboxRegistrados1().setEnabled(false);
                Vsb.getPwdField1().setEnabled(false);
                Vsb.getRadioJugador1().setEnabled(false);
                Vsb.getRadioPNJ1().setEnabled(false);
                
            }
        }
        if(Vsb.getBtnIngresar2()==e.getSource()){
            System.out.println("Presiona Ingresar 2");
            String usuario = Vsb.getItemCboxRegistrados2();
            String pwd = Vsb.getPwdJugador2ST();
            if(usuario.equals("<Seleccionar>")==false && pwd.equals("")==false){
                this.loguearBatalla(usuario, pwd);
                System.out.println("Se loguea 2!");
                Vsb.getCboxRegistrados2().setEnabled(false);
                Vsb.getPwdField2().setEnabled(false);
                Vsb.getRadioJugador2().setEnabled(false);
                Vsb.getRadioPNJ2().setEnabled(false);
            }
        }
        if(Vsb.getBtnIngresar3()==e.getSource()){
            System.out.println("Presiona Ingresar 3");
            String usuario = Vsb.getItemCboxRegistrados3();
            String pwd = Vsb.getPwdJugador3ST();
            if(usuario.equals("<Seleccionar>")==false && pwd.equals("")==false){
                this.loguearBatalla(usuario, pwd);
                System.out.println("Se loguea 3!");
                Vsb.getCboxRegistrados3().setEnabled(false);
                Vsb.getPwdField3().setEnabled(false);
                Vsb.getRadioJugador3().setEnabled(false);
                Vsb.getRadioPNJ3().setEnabled(false);
            }
        }
        if(Vsb.getBtnIngresar4()==e.getSource()){
            System.out.println("Presiona Ingresar 4");
            String usuario = Vsb.getItemCboxRegistrados4();
            String pwd = Vsb.getPwdJugador4ST();
            if(usuario.equals("<Seleccionar>")==false && pwd.equals("")==false){
                this.loguearBatalla(usuario, pwd);
                System.out.println("Se loguea!");
                Vsb.getCboxRegistrados4().setEnabled(false);
                Vsb.getPwdField4().setEnabled(false);
                Vsb.getRadioJugador4().setEnabled(false);
                Vsb.getRadioPNJ4().setEnabled(false);
            }
        }
    }
    
        /*
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
    public void comprobacionDeJugadoresDisponibles(ArrayList<Jugador> Jugadores,int numeroAJugar){
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

