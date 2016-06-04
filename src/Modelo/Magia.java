/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.lang.reflect.Array;
import Modelo.Criatura;

/**
 *
 * @author Lizweert
 */
public class Magia {
    
    private int contadorTurnoUso = 0;
    public int puntosJugador;
    public int MovimientosCriatura
    
    public void LLuviaTorrencial(puntosJugador,Array<Criatura>,MovimientosCriatura){
        while(this.contadorTurnoUso < 3){
            if(puntosJugador >= 10){
            puntosJugador = puntosJugador - 10;
            MovimientosCriatura =2;
            contadorTurnoUso=contadorTurnoUso +1;
            
        }
        
    }
    
}
