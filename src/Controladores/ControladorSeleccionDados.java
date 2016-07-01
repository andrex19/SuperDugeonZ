/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Dado;
import Modelo.Jugador;
import Modelo.PuzzleDados;
import Vistas.VistaSeleccionDados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Diego
 */
public class ControladorSeleccionDados extends MouseAdapter implements ActionListener {
    ControladorBatalla contBatalla;
    VistaSeleccionDados vistaSD;
    ArrayList<Dado> dadosPuzzle = new ArrayList<Dado>();
    Dado[] dadosSeleccionados = new Dado[4];
    
    public void verVista(ControladorBatalla contBatalla) {
        this.contBatalla = contBatalla;
        for(int i=0;i<contBatalla.jugadorActual.puzle.puzzle.length;i++){
            dadosPuzzle.add(contBatalla.jugadorActual.puzle.puzzle[i]);
        }
        this.vistaSD=new VistaSeleccionDados();
        this.vistaSD.setVisible(true);
        this.vistaSD.agregarListener(this,this);
        actualizarVista();
    }
    public void actualizarVista(){
        vistaSD.getCboxDado1().removeAllItems();
        vistaSD.getCboxDado1().addItem("<Seleccionar>");
        vistaSD.getCboxDado2().removeAllItems();
        vistaSD.getCboxDado2().addItem("<Seleccionar>");
        vistaSD.getCboxDado3().removeAllItems();
        vistaSD.getCboxDado3().addItem("<Seleccionar>");
        vistaSD.getCboxDado4().removeAllItems();
        vistaSD.getCboxDado4().addItem("<Seleccionar>");
        for(int i=0;i<dadosPuzzle.size();i++){
                if (vistaSD.getCboxDado1().equals(dadosPuzzle.get(i))==false &&
                    vistaSD.getCboxDado2().equals(dadosPuzzle.get(i))==false &&
                    vistaSD.getCboxDado3().equals(dadosPuzzle.get(i))==false &&
                    vistaSD.getCboxDado4().equals(dadosPuzzle.get(i))==false){
                        
                        vistaSD.getCboxDado1().addItem(dadosPuzzle.get(i));
                        vistaSD.getCboxDado2().addItem(dadosPuzzle.get(i));
                        vistaSD.getCboxDado3().addItem(dadosPuzzle.get(i));
                        vistaSD.getCboxDado4().addItem(dadosPuzzle.get(i));
                        
                }
            }
    }
    /*public String generarTombola(String nombreCriatura){
        String [] tombola = null;
        String cara = null;
        Random randomCaras = new Random();
        for(int i=0;i<dadosPuzzle.size();i++){
            if(this.dadosPuzzle.get(i).criatura.nombre.equals(nombreCriatura)){
                tombola = this.dadosPuzzle.get(i).caras;
                
            }
        }
        int INDEX = randomCaras.nextInt(tombola.length);
        cara = tombola[INDEX];
        //for (int j = 0; j < INDEX; j++) {
            //cara = (String) (tombola[INDEX]);
        //}
        return cara;
        
    }*/
    public boolean verificarNivel(Dado dado, int puntos){
        if (dado.criatura.nivel==1){
            if (puntos>0){
                return true;
            }
        }
        if (dado.criatura.nivel==2){
            if (puntos>2){
                return true;
            }
        }
        if (dado.criatura.nivel==3){
            if (puntos>3){
                return true;
            }
        }
        if (dado.criatura.nivel==4){
            if (puntos>4){
                return true;
            }
        }
        
        return false;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(vistaSD.getCheckDado1()==e.getSource()){
            System.out.println("Presiona Check 1");
            if (vistaSD.getItemCboxDado1().equals("<Seleccionar>")==false){
                Dado dado1 = (Dado) vistaSD.getItemCboxDado1();
                vistaSD.getLblDado1().setIcon(dado1.criatura.imagen);
                vistaSD.getCboxDado1().setEnabled(false);
            }
            
            
            
            if(vistaSD.getCheckDado1().isSelected()==false){
                vistaSD.getCboxDado1().setEnabled(true);
            }
            
            }
        if(vistaSD.getCheckDado2()==e.getSource()){
            System.out.println("Presiona Check 2");
            if (vistaSD.getItemCboxDado1().equals("<Seleccionar>")==false){
            Dado dado2 = (Dado) vistaSD.getItemCboxDado2();
            vistaSD.getLblDado2().setIcon(dado2.criatura.imagen);
            vistaSD.getCboxDado2().setEnabled(false);
            }
            if(vistaSD.getCheckDado2().isSelected()==false){
                vistaSD.getCboxDado2().setEnabled(true);
            }
        }
        if(vistaSD.getCheckDado3()==e.getSource()){
            System.out.println("Presiona Check 3");
            if (vistaSD.getItemCboxDado1().equals("<Seleccionar>")==false){
            Dado dado3 = (Dado) vistaSD.getItemCboxDado3();
            vistaSD.getLblDado3().setIcon(dado3.criatura.imagen);
            
            vistaSD.getCboxDado3().setEnabled(false);
            }
            if(vistaSD.getCheckDado3().isSelected()==false){
                vistaSD.getCboxDado3().setEnabled(true);
            }
            
        }
        if(vistaSD.getCheckDado4()==e.getSource()){
            System.out.println("Presiona Check 4");
            if (vistaSD.getItemCboxDado1().equals("<Seleccionar>")==false){
            Dado criatura = (Dado) vistaSD.getItemCboxDado4();
            vistaSD.getLblDado4().setIcon(criatura.criatura.imagen);
            vistaSD.getCboxDado4().setEnabled(false);
            }
            if(vistaSD.getCheckDado4().isSelected()==false){
                vistaSD.getCboxDado4().setEnabled(true);
            }
            
        }
        if(vistaSD.getLanzarDados()==e.getSource()){
            if(vistaSD.getCheckDado1().isSelected()==true){
                String resultado1;
                //int posicion;
                //posicion=vistaSD.getCboxDado1().getSelectedIndex();
                //System.out.println(posicion);
                //System.out.println(dadosPuzzle.get(posicion-1).criatura.nombre);
                Dado dado1=(Dado) this.vistaSD.getItemCboxDado1();
                this.dadosSeleccionados[0]=dado1;
                
                
                //System.out.println("Resultado Dado 1: "+resultado1);
                
            }
            if(vistaSD.getCheckDado2().isSelected()==true){
                String resultado2;
                //resultado2 = generarTombola(vistaSD.getItemCboxDado2());
                Dado dado2=(Dado) this.vistaSD.getItemCboxDado2();
                this.dadosSeleccionados[1]=dado2;
                //System.out.println("Resultado Dado 2: "+resultado2);
                
            }
            if(vistaSD.getCheckDado3().isSelected()==true){
                String resultado3;
               // resultado3 = generarTombola(vistaSD.getItemCboxDado3());
                Dado dado3=(Dado) this.vistaSD.getItemCboxDado3();
                this.dadosSeleccionados[2]=dado3;
                //System.out.println("Resultado Dado 3: "+resultado3);
                
            }
            if(vistaSD.getCheckDado4().isSelected()==true){
                String resultado4;
                //resultado4 = generarTombola(vistaSD.getItemCboxDado4());
                Dado dado4=(Dado) this.vistaSD.getItemCboxDado4();
                this.dadosSeleccionados[3]=dado4;
                //System.out.println("Resultado Dado 4: "+resultado4);
                
            }

            int[] puntos= this.contBatalla.jugadorActual.puntos;
            for (int i=0;i<4;i++){
                System.out.println("");
                if (this.dadosSeleccionados[i]!=null){
                    Dado dado=this.dadosSeleccionados[i];
                    String []caras=dado.caras;
                    String resultado = dado.lanzarDado(caras, puntos);
                    System.out.println("este es el resultado"+ resultado);
                    if (i==0){
                        System.out.println("/Imagenes/CarasDado/"+resultado+".png");
                        this.vistaSD.getLblImagen1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CarasDado/"+resultado+".png")));
                        if (resultado.equals("Inv") ){
                            if (verificarNivel(dado,puntos[4])){
                                this.vistaSD.getBtnInv1().setVisible(true);
                            }
                            
                        }
                        //System.out.println("entre al primer if");
                    }
                    if (i==1){
                        System.out.println("entre al segundo if");
                        System.out.println("/Imagenes/CarasDado/"+resultado+".png");
                        this.vistaSD.getLblImagen2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CarasDado/"+resultado+".png")));
                        if (resultado.equals("Inv") ){
                            if (verificarNivel(dado,puntos[4])){
                                this.vistaSD.getBtnInv2().setVisible(true);
                            }
                            
                        }
                        
                    }
                    if (i==2){
                        System.out.println("/Imagenes/CarasDado/"+resultado+".png");
                        this.vistaSD.getLblImagen3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CarasDado/"+resultado+".png")));
                        //System.out.println("entre al tercer if");
                        if (resultado.equals("Inv") ){
                            if (verificarNivel(dado,puntos[4])){
                                this.vistaSD.getBtnInv3().setVisible(true);
                            }
                            
                        }
                    }
                    if (i==3){
                        System.out.println("/Imagenes/CarasDado/"+resultado+".png");
                        this.vistaSD.getLblImagen4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CarasDado/"+resultado+".png")));
                        //System.out.println("entre al cuarto if");
                        if (resultado.equals("Inv") ){
                            if (verificarNivel(dado,puntos[4])){
                                this.vistaSD.getBtnInv4().setVisible(true);
                            }
                            
                        }
                    }
                    System.out.println("dado: " + i); 
                }
                
                
            }
            for (int i=0;i<puntos.length;i++){
                
                System.out.print(puntos[i]+ ", ");
            }
            System.out.println("");
            //this.contBatalla.dadosSeleccionados=(ArrayList<Dado>) this.dadosSeleccionados.clone();
            this.vistaSD.getBtnLanzar().setEnabled(false);
            this.contBatalla.vistaBatalla.getBtnLanzar().setEnabled(false);
            this.contBatalla.verificarPuntos();
        }
        if (this.vistaSD.getBtnInv1()==e.getSource()){
            this.contBatalla.dado=this.dadosSeleccionados[0];
            this.contBatalla.ultimo_boton=1;
            this.vistaSD.dispose();
        }
        if (this.vistaSD.getBtnInv2()==e.getSource()){
            this.contBatalla.dado=this.dadosSeleccionados[1];
            this.contBatalla.ultimo_boton=1;
            this.vistaSD.dispose();
        }
        if (this.vistaSD.getBtnInv3()==e.getSource()){
            this.contBatalla.dado=this.dadosSeleccionados[2];
            this.contBatalla.ultimo_boton=1;
            this.vistaSD.dispose();
        }
        if (this.vistaSD.getBtnInv4()==e.getSource()){
            this.contBatalla.dado=this.dadosSeleccionados[3];
            this.contBatalla.ultimo_boton=1;
            this.vistaSD.dispose();
        }
        if (this.vistaSD.getVolver()==e.getSource()){
            this.vistaSD.dispose();
        }
        
        
    }
    
}
    

