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
    
    public int puntosJugador;
    public int MovimientosCriature;
    
    public void lluviaTorrencial(int costeMovimientosCriature){
            costeMovimientosCriature =2;
            }
        
    
    public void hierbasVenenosas(int vidaCriaturaBD, int vidaCriatura){
            vidaCriatura = (int) (vidaCriatura - 0.2*vidaCriaturaBD);
        }
    public void meteoritoFuego (String Posicion){
        //Algoritmo de Busqueda de espacios de estado. Se buscara por ese metodo las criaturas mas cercanas y atacarlas 5 de radio
        
    }
}
