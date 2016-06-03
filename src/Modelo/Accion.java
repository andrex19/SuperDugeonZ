/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Diego
 */
public class Accion {
    
    //Atributos//
    private String Mover;
    private String Atacar;
    private String UsarTrampa;
    private String UsarMagia;
    //Metodos para obtener los atributos//
    public String getMover(){
    
        return this.Mover;
    }
    public String getAtacar(){
    
        return this.Atacar;
    }
    public String getUsarTrampa(){
    
        return this.UsarTrampa;
    }
    public String getUsarMagia(){
    
        return this.UsarMagia;
    }
}
