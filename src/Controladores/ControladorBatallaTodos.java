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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Lizweert
 */
public class ControladorBatallaTodos extends MouseAdapter implements ActionListener{
    ControladorMenu Cm;
    VistaSeleccionBatalla Vsb;
    ControladorPrincipal cp;
    ArrayList<Jugador> jugadoresRegistrados;
    ArrayList<Jugador> jugadoresLogeados;
    ArrayList<Jugador> jugadoresReady=new ArrayList<Jugador>();
    ControladorBatalla contBatalla=new ControladorBatalla();
    ControladorRegistro contRegistro=new ControladorRegistro();
    ControladorMenu contMenu;
    boolean auxGeneral=true;
    
    public void verVista(ControladorPrincipal cp) {
        this.cp = cp;
        this.jugadoresRegistrados=(ArrayList<Jugador>) cp.arreglo_usuarios_registrados.clone();
        this.jugadoresLogeados=(ArrayList<Jugador>) cp.arreglo_usuario.clone();
        this.Vsb=new VistaSeleccionBatalla();
        this.Vsb.setVisible(true);
        this.Vsb.agregarListener(this,this);
        System.out.println(jugadoresRegistrados.get(0).usuario);
    }
    public void limpiarCbox(int numero){
        auxGeneral=false;
        if (numero==1){
            Vsb.getCboxRegistrados1().removeAllItems();
            Vsb.getCboxRegistrados1().addItem("<Seleccionar>");
        }
        else if (numero==2){
            Vsb.getCboxRegistrados2().removeAllItems();
            Vsb.getCboxRegistrados2().addItem("<Seleccionar>");
        }
        if (numero==3){
            Vsb.getCboxRegistrados3().removeAllItems();
            Vsb.getCboxRegistrados3().addItem("<Seleccionar>");
        }
        if (numero==4){
            Vsb.getCboxRegistrados4().removeAllItems();
            Vsb.getCboxRegistrados4().addItem("<Seleccionar>");
        }
       
        auxGeneral=true;
    }
    public void limpiarPassword(int numero){
        if(numero==1){
            Vsb.getPwdField1().setText("");
        }
        else if(numero==2){
            Vsb.getPwdField2().setText("");
        }
        else if(numero==3){
            Vsb.getPwdField3().setText("");
        }
        else if(numero==4){
            Vsb.getPwdField4().setText("");
        }
    }
    public void actualizarRegistrados(int numero){
        for(int i=0;i<jugadoresRegistrados.size();i++){
            if (Vsb.getItemCboxRegistrados1().equals(jugadoresRegistrados.get(i).usuario)==false &&
                Vsb.getItemCboxRegistrados2().equals(jugadoresRegistrados.get(i).usuario)==false &&
                Vsb.getItemCboxRegistrados3().equals(jugadoresRegistrados.get(i).usuario)==false &&
                Vsb.getItemCboxRegistrados4().equals(jugadoresRegistrados.get(i).usuario)==false){
                    if (numero==1){
                        Vsb.getCboxRegistrados1().addItem(jugadoresRegistrados.get(i).usuario);
                    }
                    else if (numero==2){
                        Vsb.getCboxRegistrados2().addItem(jugadoresRegistrados.get(i).usuario);
                    }
                    else if (numero==3){
                        Vsb.getCboxRegistrados3().addItem(jugadoresRegistrados.get(i).usuario);
                    }
                    else if (numero==4){
                        Vsb.getCboxRegistrados4().addItem(jugadoresRegistrados.get(i).usuario);
                    }

            }
        }
        
    }
    public void rellenarLogeados(ActionEvent e,boolean aux){
        if (Vsb.getCboxRegistrados1()==e.getSource()&& aux ==true){
            
            System.out.println("clikie algo del cbox 1" );
            System.out.println(jugadoresLogeados.size());
            for (int i=0;i<=jugadoresLogeados.size()-1;i++){
                System.out.println(jugadoresLogeados.get(i).usuario.equals(Vsb.getItemCboxRegistrados1()));
                if (jugadoresLogeados.get(i).usuario.equals(Vsb.getItemCboxRegistrados1())){
                    Vsb.getPwdField1().setText(jugadoresLogeados.get(i).contraseña);
                    System.out.println("entre al if asdasd123");

                }
            }
        }
        if (Vsb.getCboxRegistrados2()==e.getSource()&& aux ==true){
            System.out.println("clikie algo del cbox 2");
            for (int i=0;i<=jugadoresLogeados.size()-1;i++){
                if (jugadoresLogeados.get(i).usuario.equals(Vsb.getItemCboxRegistrados2())){
                    Vsb.getPwdField2().setText(jugadoresLogeados.get(i).contraseña);
                    System.out.println("cambie la contrasella de la casilla 2");
                }
            }
        }
        if (Vsb.getCboxRegistrados3()==e.getSource()&& aux ==true){
            System.out.println("clikie algo del cbox 3");
            if(cp.arreglo_usuario.size()>0){
                for (int i=0;i<=jugadoresLogeados.size()-1;i++){
                if (jugadoresLogeados.get(i).usuario.equals(Vsb.getItemCboxRegistrados3())){
                    Vsb.getPwdField3().setText(jugadoresLogeados.get(i).contraseña);
                    
                }
            }
                
            }
            
        }
        if (Vsb.getCboxRegistrados4()==e.getSource()&& aux ==true){
            System.out.println("clikie algo del cbox 4");
            for (int i=0;i<=jugadoresLogeados.size()-1;i++){
                if (jugadoresLogeados.get(i).usuario.equals(Vsb.getItemCboxRegistrados4())){
                    Vsb.getPwdField4().setText(jugadoresLogeados.get(i).contraseña);
                    
                }
            }
        }
    }
    private void loguearBatalla(String usuario, String contraseña, ActionEvent e) {
        
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
                            if(Vsb.getBtnIngresar1()==e.getSource()){

                                
                                System.out.println("Se loguea!");
                                Vsb.getCboxRegistrados1().setEnabled(false);
                                Vsb.getPwdField1().setEnabled(false);
                                Vsb.getRadioJugador1().setEnabled(false);
                                Vsb.getRadioPNJ1().setEnabled(false);
                                Vsb.getBtnIngresar1().setEnabled(false);

                            }

                            if(Vsb.getBtnIngresar2()==e.getSource()){

                                    
                                    System.out.println("Se loguea 2!");
                                    Vsb.getCboxRegistrados2().setEnabled(false);
                                    Vsb.getPwdField2().setEnabled(false);
                                    Vsb.getRadioJugador2().setEnabled(false);
                                    Vsb.getRadioPNJ2().setEnabled(false);
                                    Vsb.getBtnIngresar2().setEnabled(false);
                                }
                            
                            if(Vsb.getBtnIngresar3()==e.getSource()){

                                    
                                    System.out.println("Se loguea 3!");
                                    Vsb.getCboxRegistrados3().setEnabled(false);
                                    Vsb.getPwdField3().setEnabled(false);
                                    Vsb.getRadioJugador3().setEnabled(false);
                                    Vsb.getRadioPNJ3().setEnabled(false);
                                    Vsb.getBtnIngresar3().setEnabled(false);
                                }
                            
                            if(Vsb.getBtnIngresar4()==e.getSource()){

                                    System.out.println("Se loguea!");
                                    Vsb.getCboxRegistrados4().setEnabled(false);
                                    Vsb.getPwdField4().setEnabled(false);
                                    Vsb.getRadioJugador4().setEnabled(false);
                                    Vsb.getRadioPNJ4().setEnabled(false);
                                    Vsb.getBtnIngresar4().setEnabled(false);
                                
                            }
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
        this.jugadoresRegistrados=(ArrayList<Jugador>) cp.arreglo_usuarios_registrados.clone();
        rellenarLogeados(e,auxGeneral);
        
        
        
      
        if (Vsb.getRadioJugador1()==e.getSource()){
            System.out.println("Presiono Radio Jugador");
            limpiarCbox(1);
            limpiarPassword(1);
            Vsb.getRadioPNJ1().setSelected(false);
            if(Vsb.getRadioJugador1().isSelected()){
                actualizarRegistrados(1);
            }
            
            
            
        }
        
        if (Vsb.getRadioJugador2()==e.getSource()){
                
            System.out.println("Presiono Radio Jugador 2");
            limpiarCbox(2);
            limpiarPassword(2);
            Vsb.getRadioPNJ2().setSelected(false);
            if(Vsb.getRadioJugador2().isSelected()){
                actualizarRegistrados(2);
            }
        }
        if (Vsb.getRadioJugador3()==e.getSource()){
            System.out.println("Presiono Radio Jugador 3");
            limpiarCbox(3);
            limpiarPassword(3);
            Vsb.getRadioPNJ3().setSelected(false);
            if(Vsb.getRadioJugador3().isSelected()){
                actualizarRegistrados(3);
            }
        }
        
        if (Vsb.getRadioJugador4()==e.getSource()){
            System.out.println("Presiono Radio Jugador 4");
            limpiarCbox(4);
            limpiarPassword(4);
            Vsb.getRadioPNJ4().setSelected(false);
            if(Vsb.getRadioJugador4().isSelected()){
                actualizarRegistrados(4);
            }
        }
        if(Vsb.getRadioPNJ1()==e.getSource()){
            System.out.println("Presiono Radio PNJ 1");
            limpiarCbox(1);
            limpiarPassword(1);
            Vsb.getRadioJugador1().setSelected(false);
        
        }
        if(Vsb.getRadioPNJ2()==e.getSource()){
            System.out.println("Presiono Radio PNJ 2");
            limpiarCbox(2);
            limpiarPassword(2);
            Vsb.getRadioJugador2().setSelected(false);
        }
        if(Vsb.getRadioPNJ3()==e.getSource()){
            System.out.println("Presiono Radio PNJ 3");
            limpiarCbox(3);
            limpiarPassword(3);
            Vsb.getRadioJugador3().setSelected(false);
        }
        if(Vsb.getRadioPNJ4()==e.getSource()){
            limpiarCbox(4);
            limpiarPassword(4);
            System.out.println("Presiono Radio PNJ 4");
            Vsb.getRadioJugador4().setSelected(false);
        }
        if(Vsb.getBtnIngresar1()==e.getSource()){
            System.out.println("Presiona Ingresar 1");
            String usuario = Vsb.getItemCboxRegistrados1();
            String pwd = Vsb.getPwdJugador1ST();
            if(usuario.equals("<Seleccionar>")==false && pwd.equals("")==false){
                this.loguearBatalla(usuario, pwd,e);

            }
        }
        if(Vsb.getBtnIngresar2()==e.getSource()){
            System.out.println("Presiona Ingresar 2");
            String usuario = Vsb.getItemCboxRegistrados2();
            String pwd = Vsb.getPwdJugador2ST();
            if(usuario.equals("<Seleccionar>")==false && pwd.equals("")==false){
                this.loguearBatalla(usuario, pwd,e);

            }
        }
        if(Vsb.getBtnIngresar3()==e.getSource()){
            System.out.println("Presiona Ingresar 3");
            String usuario = Vsb.getItemCboxRegistrados3();
            String pwd = Vsb.getPwdJugador3ST();
            if(usuario.equals("<Seleccionar>")==false && pwd.equals("")==false){
                this.loguearBatalla(usuario, pwd,e);

            }
        }
        if(Vsb.getBtnIngresar4()==e.getSource()){
            System.out.println("Presiona Ingresar 4");
            String usuario = Vsb.getItemCboxRegistrados4();
            String pwd = Vsb.getPwdJugador4ST();
            if(usuario.equals("<Seleccionar>")==false && pwd.equals("")==false){
                this.loguearBatalla(usuario, pwd,e);

            }
        }
        
        if(Vsb.getBtnJugar()==e.getSource()){
            System.out.println("Presiona Jugar");
            System.out.println( "lago de jugadores ready: " + jugadoresReady.size());
            Vsb.dispose();
            contBatalla.verVista(cp,jugadoresReady);
            

        }
        if(Vsb.getBtnRegistrar()==e.getSource()){
            contRegistro.verVista(cp);
        }
        if (Vsb.getBtnVolver()==e.getSource()){
            Vsb.dispose();
            this.cp.contMenu.verVista(cp);
        }
        
        
        //PARA QUE SE HABILITE EL BOTON DE JUGAR!
        if(jugadoresReady.size()>=2){
            Vsb.getBtnJugar().setEnabled(true);
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
    


