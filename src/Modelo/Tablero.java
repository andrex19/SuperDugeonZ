package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Tablero {
    
    public int CantColumnas;
    public int CantFilas;
    public Casilla Casilla[];
    
    
    //metodos//
    
    public int getColumnas(){
    
        return this.CantColumnas;
    }
    public int getFilas(){
    
        return this.CantFilas;
    }
    public Modelo.Casilla[] getCasilla(){
    
        return this.Casilla;
    }
}
