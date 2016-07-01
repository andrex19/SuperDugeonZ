/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.VistaRegistro;
import superdugeonz_2.ControladorPrincipal;
import Modelo.JefeTerreno;
import Modelo.Jugador;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Conexion;
import Modelo.Criatura;
import Modelo.PuzzleDados;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorRegistro implements ActionListener {
    ControladorPrincipal cp;
    VistaRegistro vistaRegistro;
    JefeTerreno JefeTerreno;
    ControladorMenu contMenu=new ControladorMenu();
    Conexion conn;
    
    
    
       
    public void verVista(ControladorPrincipal cp) {
    
    this.cp=cp;
    this.vistaRegistro=new VistaRegistro();
    this.vistaRegistro.setVisible(true);
    this.vistaRegistro.agregarListener(this);

    }
    public void jefeTerreno(){
        if(vistaRegistro.getItemCboxJefeTerreno().equals("Goku")){
                this.JefeTerreno = new JefeTerreno(1);
            }
            else if(vistaRegistro.getItemCboxJefeTerreno().equals("Vegeta")){
                this.JefeTerreno = new JefeTerreno(2);
            }
            else if(vistaRegistro.getItemCboxJefeTerreno().equals("Zolezzi")){
                this.JefeTerreno = new JefeTerreno(3);
            }
            else if(vistaRegistro.getItemCboxJefeTerreno().equals("Mr.Satan")){
                this.JefeTerreno = new JefeTerreno(4);
            }
        
    }
    public void registrar() throws SQLException{
        String usuario=vistaRegistro.getUsr();
        String pwd1=vistaRegistro.getPwd1();
        String pwd2=vistaRegistro.getPwd2();
        String jefeTerreno=vistaRegistro.getItemCboxJefeTerreno();
        
        //boolean seConecta;
        if (usuario.equals("")==false && pwd1.equals("")==false && pwd2.equals("")==false 
            && jefeTerreno.equals("<Seleccionar>")==false){
            conn = new Conexion();
            conn.conectar();
            
            if (pwd1.equals(pwd2)==true){
                //seConecta=conn.Registro(usuario, pwd1);
                //if(seConecta==true){
                    //System.out.println("Registra al usuario");
                //ESTA ES LA COMPROBACION IMPORTANTE!!!!!!!!!
                //DENTRO DE ESTE IF IRÍA LA COMPROBACIÓN DE TODO
                
                vistaRegistro.setMsjUsuario("");
                vistaRegistro.setMsjPwd1("");
                vistaRegistro.setMsjPwd2("");
                vistaRegistro.setMsjJefeTerreno("");
                
                
                
                if (Jugador.existe(cp.arreglo_usuarios_registrados, usuario)==false){
                    jefeTerreno();
                    Jugador jugador;
                    ArrayList<Criatura> criaturas = new ArrayList<Criatura>();
                    PuzzleDados mazo;
                    criaturas = conn.selectCriaturas();
                    mazo = new PuzzleDados(criaturas);
                    //sacar la informacion de las criaturas e intarciarlas
                    //meterlas en un puzzle de dados
                    
                    
                    jugador=new Jugador(usuario,pwd1,mazo,this.JefeTerreno);
                    System.out.println(jugador.jefeTerreno.nombre);
                    cp.arreglo_usuarios_registrados.add(jugador);
                    
                    
                    
                    //meter las cosas a la base de dato
                    this.conn.insertar("INSERT INTO JUGADOR (NOMBRE_JUGADOR,CONTRASENIA_JUGADOR) VALUES ('"+usuario+"','"+pwd1+"')");
                    int id = conn.selectIdJugador(usuario);
                    if(this.conn.insertar("INSERT INTO PUZZLEJUGADOR (ID_JUGADOR) VALUES ("+Integer.toString(id)+")")){
                        System.out.println("PASÓ EL INSERT");
                    }
                    
                    
                    for(int j = 0; j<15;j++){
                        this.conn.insertar("UPDATE PUZZLEJUGADOR SET CRIATURA"+(j+1)+" ='"+jugador.puzle.puzzle[j].criatura.nombre+"' WHERE ID_JUGADOR="+Integer.toString(id)+"");
                    }
                    if(jugador.jefeTerreno.nombre.equals("Goku")){
                        this.conn.insertar("INSERT INTO JEFEJUGADOR (ID_JUGADOR, ID_JEFE) VALUES ("+id+", "+1+")");
                    }
                    if(jugador.jefeTerreno.nombre.equals("Vegeta")){
                        this.conn.insertar("INSERT INTO JEFEJUGADOR (ID_JUGADOR, ID_JEFE) VALUES ("+id+", "+2+")");
                    }
                    if(jugador.jefeTerreno.nombre.equals("Zolezzi")){
                        this.conn.insertar("INSERT INTO JEFEJUGADOR (ID_JUGADOR, ID_JEFE) VALUES ("+id+", "+3+")");
                    }
                    if(jugador.jefeTerreno.nombre.equals("Mr.Satan")){
                        this.conn.insertar("INSERT INTO JEFEJUGADOR (ID_JUGADOR, ID_JEFE) VALUES ("+id+", "+4+")");
                    }
                    vistaRegistro.dispose();
                    //cp.contMenu.verVista(cp);
                    System.out.println("usuario registrado");
                }
                else{
                    vistaRegistro.setMsjUsuario("Usuario ya existe");
                    vistaRegistro.setMsjPwd1("");
                    vistaRegistro.setMsjPwd2("");
                    vistaRegistro.setMsjJefeTerreno("");
                    
                
                }
                
                
            }
            else{
                vistaRegistro.setMsjUsuario("");
                vistaRegistro.setMsjPwd1("");
                vistaRegistro.setMsjPwd2("Contraseña no coincide");
                vistaRegistro.setMsjJefeTerreno("");
                
                
                
            }
        }
        else{
            if (usuario.equals("")==true){
                vistaRegistro.setMsjUsuario("Ingrese usuario");
            }
            else{
                vistaRegistro.setMsjUsuario("");
            }
            if (pwd1.equals("")==true){
                vistaRegistro.setMsjPwd1("Ingrese contraseña");
            }
            else{
                vistaRegistro.setMsjPwd1("");
            }
            if (pwd2.equals("")==true){
                vistaRegistro.setMsjPwd2("Ingrese contraseña");
            }
            else{
                vistaRegistro.setMsjPwd2("");
            }
            if (jefeTerreno.equals("<Seleccionar>")==true){
                vistaRegistro.setMsjJefeTerreno("Seleccione jefe de terreno");
            }
            else{
                vistaRegistro.setMsjJefeTerreno("");
            }
            
            
        }

        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (vistaRegistro.getBotonSiguiente()==e.getSource()){
            try {          
                this.registrar();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Click boton registro");
            
        }
        if (vistaRegistro.getBotonCancelar()==e.getSource()){
            System.out.println("Click boton Cancelar (registro)");
            this.vistaRegistro.dispose(); //cierra la vista login
            //this.contMenu.verVista(cp);
            //this.cp.vistaInicio.setVisible(true); //muestra la vista Inicio
        }
            
        if (vistaRegistro.getCboxJefeTerreno()==e.getSource()){ //camibiar las imagenes!!!
            vistaRegistro.setImagenJefeTerreno(vistaRegistro.getItemCboxJefeTerreno());
            
            
            
        }    
        
        
    }
   
    
}
