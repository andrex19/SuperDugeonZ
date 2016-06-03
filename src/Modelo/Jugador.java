package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Jugador {
    //Atributos//
    
    private String TipoDeJugador;
    private String Nombre;
    private String Contraseña;
    
    //metodos//
    
    public String getTipoDeJugador(){
    
        return this.TipoDeJugador;
    
    }
   public String getNombre(){
    
        return this.Nombre;
    }
   public String getContraseña(){
    
        return this.Contraseña;
    }
    
    
}