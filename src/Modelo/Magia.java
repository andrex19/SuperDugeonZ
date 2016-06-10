/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Criatura;
/**
 *
 * @author Lizweert
 */
public class Magia {
    
    public int puntosJugador;
    public int MovimientosCriature;
    
    public void lluviaTorrencial(Criatura criatura){
            criatura.movimiento =2;
            }
        
    
    public void hierbasVenenosas(Criatura criatura){
            criatura.puntosDeVida=(int) (criatura.puntosDeVida*0.8);

        }
    public void meteoritoFuego (Criatura criatura){
        criatura.puntosDeVida=(int) (criatura.puntosDeVida*0.7);
        //Algoritmo de Busqueda de espacios de estado. Se buscara por ese metodo las criaturas mas cercanas y atacarlas 5 de radio
    }
    
    public void activarLLuviaT(int[] puntosUsuario, int contadorTurnos, Criatura criatura){
        if(puntosUsuario[2] >= 10){
            if (contadorTurnos >= 10){
                this.lluviaTorrencial(criatura);
            }
            else{
                //poner mensaje de que no se puede usar y los turnos que falta para usarlo 
            }
        }
    }
    
    public void activarHierbasV(int[] puntosUsuario, int contadorTurnos, Criatura criatura){
        if(puntosUsuario[2] >= 15){
            if (contadorTurnos >= 10){
                this.hierbasVenenosas(criatura);
            }
            else{
                //poner mensaje de que no se puede usar y los turnos que falta para usarlo 
            }
        }
    }
    public void activarMeteoroF(int[] puntosUsuario, int contadorTurnos, Criatura criatura){
           
        if(puntosUsuario[2] >= 20){
            if (contadorTurnos >= 10){
                this.meteoritoFuego(criatura);
            }
            else{
                //poner mensaje de que no se puede usar y los turnos que falta para usarlo 
            }
    }
    }
}
