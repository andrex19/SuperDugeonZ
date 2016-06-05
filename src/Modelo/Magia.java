/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lizweert
 */
public class Magia {
    
    private int contadorTurnoUso = 0;
    public int puntosJugador;
    public int MovimientosCriature;
    
    public void LLuviaTorrencial(int puntos, int MovimientosCriature){
        while(this.contadorTurnoUso < 3){
            if(puntosJugador >= 10){
            puntosJugador = puntosJugador - 10;
            MovimientosCriature =2;
            contadorTurnoUso=contadorTurnoUso +1;
            }
        }
    }
}
