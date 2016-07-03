/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Conexion;
import Modelo.Criatura;
import Vistas.VistaInfoCriaturas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import superdugeonz_2.ControladorPrincipal;

/**
 *
 * @author Diego
 */
public class ControladorInfoCriaturas implements ActionListener{
    public ControladorPrincipal cp;
    public Conexion con = new Conexion();
    public VistaInfoCriaturas vistaInfoCriaturas;
    public ArrayList<Criatura> Criaturas;
    
    public void verVista(ControladorPrincipal cp) throws SQLException {
        this.cp=cp;
        this.vistaInfoCriaturas = new VistaInfoCriaturas();
        this.vistaInfoCriaturas.setVisible(true);
        this.vistaInfoCriaturas.getCboxCriaturas().removeAllItems();
        this.vistaInfoCriaturas.agregarListener(this);
        this.con.conectar();
        Criaturas = this.con.selectCriaturas();
        actualizarVista();
        this.con.close();   
    }
    public void actualizarVista(){
        vistaInfoCriaturas.getLabelInfoNombre().setVisible(false);
        vistaInfoCriaturas.getLabelInfoVida().setVisible(false);
        vistaInfoCriaturas.getLabelInfoAtaque().setVisible(false);
        vistaInfoCriaturas.getLabelInfoDefensa().setVisible(false);
        vistaInfoCriaturas.getLabelInfoNivel().setVisible(false);
        vistaInfoCriaturas.getCboxCriaturas().addItem("<Seleccionar>");
        for(int i=0;i<Criaturas.size();i++){
            vistaInfoCriaturas.getCboxCriaturas().addItem(Criaturas.get(i).nombre);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(this.vistaInfoCriaturas.getItemCboxCriaturas().equals("<Seleccionar>")==false){
           for(int i=0;i<Criaturas.size();i++){
               if(this.vistaInfoCriaturas.getItemCboxCriaturas().equals(Criaturas.get(i).nombre)){
                   vistaInfoCriaturas.getLabelImage().setIcon(Criaturas.get(i).imagen);
                   vistaInfoCriaturas.getLabelInfoNombre().setText(Criaturas.get(i).nombre);
                   vistaInfoCriaturas.getLabelInfoVida().setText(""+Criaturas.get(i).puntosDeVida);
                   vistaInfoCriaturas.getLabelInfoAtaque().setText(""+Criaturas.get(i).ataque);
                   vistaInfoCriaturas.getLabelInfoDefensa().setText(""+Criaturas.get(i).defensa);
                   vistaInfoCriaturas.getLabelInfoNivel().setText(""+Criaturas.get(i).nivel);
                   vistaInfoCriaturas.getLabelInfoNombre().setVisible(true);
                   vistaInfoCriaturas.getLabelInfoVida().setVisible(true);
                   vistaInfoCriaturas.getLabelInfoAtaque().setVisible(true);
                   vistaInfoCriaturas.getLabelInfoDefensa().setVisible(true);
                   vistaInfoCriaturas.getLabelInfoNivel().setVisible(true);
                   
               }
           }
       }
       if(vistaInfoCriaturas.getBtnVolver()==ae.getSource()){
           vistaInfoCriaturas.dispose();
       }
    }
    
    
    
}
